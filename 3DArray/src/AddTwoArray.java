import java.util.Arrays;
import java.util.Scanner;
public class AddTwoArray {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	 int[] array1 = {10, 20, 30, 40};
     int[] array2 = {50, 60, 70, 80};

     // Calculate the length of the new array
     int length = array1.length + array2.length;

     // Create a new array with the calculated length
     int[] newArray = new int[length];

     // Copy elements from array1 and array2 to the new array
     System.arraycopy(array1, 0, newArray, 0, array1.length);
     System.arraycopy(array2, 0, newArray, array1.length, array2.length);

     // Print the new array
     System.out.println("Array1: " + Arrays.toString(array1));
     System.out.println("Array2: " + Arrays.toString(array2));
     System.out.println("New Array: " + Arrays.toString(newArray));
 	
}
}
