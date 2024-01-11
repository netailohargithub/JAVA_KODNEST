import java.util.Scanner;
public class IfElseLadder {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("User! please enter a number");
		int a = s.nextInt();
		System.out.println("User! please enter the second number");
		int b = s.nextInt();
		System.out.println("User! please enter a operator");
		char ch = s.next().charAt(0);
		if (ch =='+') {
			System.out.println(a+b);
		}
		 else if(ch == '-') {
			System.out.println(a-b);
		}
		 else if(ch == '*') {
			 System.out.println(a*b);
		 }
		 else if(ch == '/') {
			System.out.println(a/b);
		}
		 else if (ch == '%') {
			 System.out.println(a%b);
		 }
		 else {
			 System.out.println("Invalid character");
		 }
	
	}
}
