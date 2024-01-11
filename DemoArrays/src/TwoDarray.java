import java.util.Scanner;
public class TwoDarray {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		//create an int array of size 4
		System.out.println("User please enter the row of array");
		int row = scan.nextInt();
		System.out.println("User please enter the column of array");
		int column = scan.nextInt();
		
		
		// Declaration or creation of 2d  array
		int a [][] = new int[row][column];
		System.out.println("user please enter the elements of an array");
		
		//store elements into the array
		
		
		
		
		//int [][]a1= {{row},{column}};
		//System.out.println(a1);
		System.out.println("User please enter elements of array");
		for(int row1 = 0;row1<=a.length-1;row1++) {
			for(int column1=0; column1<a[row1].length;column1++) {
			a[row1][column1]= scan.nextInt();
			}
		}
		System.out.println("Array Values are: ");
		
		for(int row1=0; row1<a.length;row1++) {
			for(int column1=0;column1<a[row1].length;column1++) {
				System.out.println(a[row1][column1]);
			}
		}
	}
	}

