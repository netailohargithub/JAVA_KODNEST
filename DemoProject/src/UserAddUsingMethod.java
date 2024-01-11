import java.util.Scanner;
class UserAddUsingMethod
{
public static void main(String [] args)
   {
   addNumbers();
   }

public static int addNumbers()
   {
   Scanner scan = new Scanner (System.in);

   System.out.println("user please enter an integer value");
   int a = scan.nextInt();

   System.out.println("user please enter an integer value");
   int b = scan.nextInt();
   
   int sum= a+b;
   System.out.println(sum);
   return sum;
   }
}