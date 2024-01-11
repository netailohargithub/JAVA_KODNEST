
	import java.util.Scanner;
	public class LargestDigitNumber {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int largestDigit = findLargestDigit(number);

	        System.out.println("The largest digit in the number is: " + largestDigit);
	        scanner.close();
	    }

	    
	    public static int findLargestDigit(int number) {
	        int largestDigit = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            if (digit > largestDigit) {
	                largestDigit = digit;
	            }
	            number /= 10;
	        }

	        return largestDigit;
	    }
	}


