import java.util.Scanner;
public class Solution1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		//create an int array of size 4
		System.out.println("User please enter the size of array");
		int n = scan.nextInt();
		
		int a [] = new int[n];
		System.out.println(a.length+"user please enter the elements of an array");
		
		//store elements into the array
		System.out.println("User please enter 4 element of an array");
		for(int i = 0;i<=a.length-1;i++) {
			a[i]= scan.nextInt();
	
		}
		
		System.out.println("The four integer elements of an array are:");
		
		for(int j = 0;j<=a.length-1;j++) {
			System.out.println(a[j]);
		}
	}

}
