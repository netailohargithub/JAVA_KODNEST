
public class Solution6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			// print *
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("?");
			}
			System.out.println();
		}
		
	}
}
