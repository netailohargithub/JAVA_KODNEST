import java.util.Scanner;
public class MainSwitch {
public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	char ch = scan.next().charAt(0);
	switch(ch) {
	    case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':System.out.println("pass");
		break;
		/*case 6:
		case 7:
		case 8:
		case 9*/
		case 'F':System.out.println("Number is 6-10");
		break;
	}
}
}
