import java.util.Scanner;
class Square
{
public static void main(String [] args)
   {

   System.out.println("user please enter an integer value");
   Scanner scan = new Scanner (System.in);
   int n = scan.nextInt();
   System.out.println("The square of given number is="+findSquare(n));
   }
   public static int findSquare(int a)
   {
	   return(a*a);
   }
}
