
public class SwapUsingThirdVariable {

	    public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 20;

	        System.out.println("Before swapping:");
	        System.out.println("num1 = " + num1);
	        System.out.println("num2 = " + num2);

	        // Swap using a third variable through a method
	        swapWithThirdVariable(num1, num2);

	        System.out.println("\nAfter swapping:");
	        System.out.println("num1 = " + num1);
	        System.out.println("num2 = " + num2);
	    }

	    public static void swapWithThirdVariable(int a, int b) {
	        int temp = a;
	        a = b;
	        b = temp;
	    }
	}
