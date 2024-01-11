import java.util.Scanner;

public class QubeRoot {
	public static void main(String []args) {
		System.out.println();
	 Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt();
	 cbrtnumber(n);
	}
	static void cbrtnumber(int n) {
		System.out.println((int)Math.cbrt(n));
	}

}
