import java.util.Scanner;
public class Calculator 
{
public static void main(String [] args)
   {

   System.out.println("user please enter an integer value");
   Scanner scan = new Scanner (System.in);
   int n = scan.nextInt();

   int m = scan.nextInt();
   System.out.println("The Addition of given number is="+addition(n,m));
   System.out.println("The Substraction of given number is="+substraction(n,m));
   System.out.println("The Multiplication of given number is="+multiplication(n,m));
   System.out.println("The Quotient of given number is="+quotient(n,m));
   System.out.println("The Reminder of given number is="+reminder(n,m));
   }
   public static int addition(int a,int b)
   {
	   return(a+b);
   }
   public static int substraction(int a,int b)
   {
	   return(a-b);
   }
   public static int multiplication(int a,int b)
   {
	   return(a*b);
   }
   public static int quotient(int a,int b)
   {
	   return(a/b);
   }
   public static int reminder(int a,int b)
   {
	   return(a%b);
   }
   
}
