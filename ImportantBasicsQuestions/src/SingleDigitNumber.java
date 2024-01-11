import java.util.Scanner;

public class SingleDigitNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n > 9) {
			int sum = 0;
			while (n > 0) {
				int rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
		}
		System.out.println(n);
	}

}
