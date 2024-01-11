
	import java.util.Scanner;

	public class GCDofTwoNumbers {

		    public static void main(String[] args) {
		    	Scanner scan = new Scanner(System.in);
		        int num1 = scan.nextInt(); 
		        int num2 = scan.nextInt(); 

		        int gcd = findGCD(num1, num2);

		        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
		        scan.close();
		       
		    }

		    
		    public static int findGCD(int a, int b) {
		        while (b != 0) {
		            int temp = b;
		            b = a % b;
		            a = temp;
		        }
		        return a;
		        
		       /* for(int i = 1; i<=num1 && i<=num2;i++) {
		        	if(num1%i==0 && num2%i==0) {
		        	int gcd = i;
		        	System.out.println(i);
		        }*/
		    }
		}
	

