
import java.util.Scanner;
public class ThreeDArray {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		//create an int array of size 4
		System.out.println("User please enter the row of array");
		int row = scan.nextInt();
		System.out.println("User please enter the column of array");
		int column = scan.nextInt();
		System.out.println("User please enter the height of array");
		int height = scan.nextInt();

		// Declaration or creation of 2d  array
		int a [][][] = new int[row][column][height];
		System.out.println("user please enter the elements of an array");

		//store elements into the array

		System.out.println("User please enter elements of array");
		for(int row1 = 0;row1<=a.length-1;row1++) {
			for(int column1=0; column1<a[row1].length;column1++) {
				for(int height1 = 0;height1<a[row1][column1].length;height1++) {
					a[row1][column1][height]= scan.nextInt();
				}
			}
		}
		System.out.println("Array Values are: ");

		for(int row1 = 0;row1<=a.length-1;row1++) {
			for(int column1=0; column1<a[row1].length;column1++) {
				for(int height1 = 0;height1<a[row1][column1].length;height1++) {
					System.out.println(a[row1][column1][height1]+" ");
				}
				System.out.println();
			}
		}
	}
}
