import java.util.Scanner;
public class SwitchCase {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("User please enter a number");
	//int a = scan.nextInt();
	//System.out.println("User please enter a number");
	//int b = scan.nextInt();
	//System.out.println("user please enter a character");
	//char ch = scan.next().charAt(0);
	//int ch = scan.nextInt();
	/*boolean value = scan.nextBoolean();
	byte b = scan.nextByte();
	short s =scan.nextShort();
	long l = scan.nextLong();
	float f =scan.nextFloat();
	double d =scan.nextDouble();*/
	String str =scan.next();
;
	switch(str)
	{
	case "one" : if (6==6) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	break;
	
	/*case 2 : System.out.println("Two");
	break;
	case 3 : System.out.println("Three");
	break;
	case 4 :
		//if(b>0) {
		System.out.println("Four");
	break;
	case 5 : System.out.println("five");
	break;*/
	default: System.out.println("Invalid ");
	
	switch(str)
	{
	case "one" : System.out.println("One");
	break;
	default: System.out.println("Invalid ");
	}
}
}
}
