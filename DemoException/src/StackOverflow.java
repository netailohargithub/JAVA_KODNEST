
public class StackOverflow {

	public static void main(String[] args) {
		
		        // Call a method that causes a StackOverflowError
		       // recursiveMethod(0);
		add();
		    }

		    // A recursive method that leads to StackOverflowError
		   // private static void recursiveMethod(int counter) {
		     //   System.out.println("Counter: " + counter);
		        
		        // Recursive call
		        //recursiveMethod(counter + 1);
	static void add() {
		add();
		    }
		}


	


