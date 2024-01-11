
public class SwapWithoutUsingThirdVariable {

	    public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 20;

	        System.out.println("Before swapping:");
	        System.out.println("num1 = " + num1);
	        System.out.println("num2 = " + num2);

	        // Swap without a third variable through a method
	        swapWithoutThirdVariable(num1, num2);

	        System.out.println("\nAfter swapping:");
	        System.out.println("num1 = " + num1);
	        System.out.println("num2 = " + num2);
	    }

	    public static void swapWithoutThirdVariable(int a, int b) {
	        a = a + b;
	        b = a - b;
	        a = a - b;
	    }
	}


