import java.util.Scanner;
public class SampleArray1 {

		public static void main(String[] args) {
	        int[] originalArray = {1, 2, 3, 4, 5};
	        int positionsToRotate = 2; // Change this value to specify the number of positions to rotate

	        int length = originalArray.length;
	        int[] rotatedArray = new int[length];

	        // Copy elements to the rotated array with rotation
	        for (int i = 0; i < length; i++) {
	            int newIndex = (i + positionsToRotate) % length;
	            rotatedArray[newIndex] = originalArray[i];
	        }

	        // Print the rotated array
	        System.out.println("Original Array: ");
	        for (int value : originalArray) {
	            System.out.print(value + " ");
	        }
	        
	        System.out.println("\nRotated Array (" + positionsToRotate + " positions to the right): ");
	        for (int value : rotatedArray) {
	            System.out.print(value + " ");
	        }
	    }
	}


