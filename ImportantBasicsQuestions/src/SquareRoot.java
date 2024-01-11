import java.util.Scanner;
public class SquareRoot {
	public static void main(String []args) {
		System.out.println();
	 Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt();
	 sqrtnumber(n);
	}
	static void sqrtnumber(int n) {
		System.out.println((int)Math.sqrt(n));
	}

}
