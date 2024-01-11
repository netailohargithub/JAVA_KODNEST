import java.util.Scanner;

public class Citizen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		if (a >= 18) {
			System.out.println("Eligible");
         
		}
       scan.close();
	}
}
