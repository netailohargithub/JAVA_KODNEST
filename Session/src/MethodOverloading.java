
public class MethodOverloading {

	    // Method with no parameters
	    public void display() {
	        System.out.println("Display method with no parameters");
	    }

	    // Method with one int parameter
	    public void display(int num) {
	        System.out.println("Display method with int parameter: " + num);
	    }

	    // Method with one double parameter
	    public void display(double num) {
	        System.out.println("Display method with double parameter: " + num);
	    }

	    // Method with two int parameters
	    public void display(int num1, int num2) {
	        System.out.println("Display method with two int parameters: " + num1 + ", " + num2);
	    }

	    // Method with a string parameter
	    public void display(String message) {
	        System.out.println("Display method with string parameter: " + message);
	    }

	    // Method with a char parameter
	    public void display(char ch) {
	        System.out.println("Display method with char parameter: " + ch);
	    }

	    // Method with a boolean parameter
	    public void display(boolean flag) {
	        System.out.println("Display method with boolean parameter: " + flag);
	    }

	    // Method with an array of integers
	    public void display(int[] numbers) {
	        System.out.print("Display method with array of integers: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        MethodOverloading example = new MethodOverloading();

	        example.display();
	        example.display(10);
	        example.display(5.5);
	        example.display(20, 30);
	        example.display("Hello, Method Overloading!");
	        example.display('A');
	        example.display(true);
	        example.display(new int[]{1, 2, 3, 4, 5});
	    }
	}


