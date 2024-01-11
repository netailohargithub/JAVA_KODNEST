import java.util.Scanner;
public class Positive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a>0) {
			System.out.println("Positive");
		}
		if(a<0) {
			System.out.println("Not Positive");
		}
		scan.close();
	}

}
