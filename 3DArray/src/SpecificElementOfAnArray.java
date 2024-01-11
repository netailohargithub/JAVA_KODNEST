import java.util.Scanner;

public class SpecificElementOfAnArray {
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
		
		
		System.out.println("User please enter elements of array");
		for(int i = 0;i<=a.length-1;i++) {
			for(int j=0; j<a[i].length;j++) {
			a[i][j]= scan.nextInt();
			}
		}
		System.out.println("Array Values are: ");
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(j==1)
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
