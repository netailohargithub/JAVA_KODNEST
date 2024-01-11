import java.util.Scanner;
public class MargeTwoArray1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		 int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {6, 7, 8, 9, 10};

	        int length1 = array1.length;
	        int length2 = array2.length;

	        // Calculate the length of the new array
	        int totalLength = length1 + length2;

	        // Create a new array with the calculated length
	        int[] newArray = new int[totalLength];

	        // Copy elements from array1 to the new array
	        for (int i = 0; i < length1; i++) {
	            newArray[i] = array1[i];
	        }

	        // Copy elements from array2 to the new array
	        for (int i = 0; i < length2; i++) {
	            newArray[length1 + i] = array2[i];
	        }
	        // Print the new array
	        for (int value : newArray) {
	            System.out.print(value + " ");
	        }
	}

}
