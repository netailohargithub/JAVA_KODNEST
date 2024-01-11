	import java.util.Scanner;
public class DrivingLisence {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();

			if (a >= 18) {
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Not Eligible");
			}
	       scan.close();
		}
	}
