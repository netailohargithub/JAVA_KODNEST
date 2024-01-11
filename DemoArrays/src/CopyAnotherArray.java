import java.util.Scanner;

public class CopyAnotherArray {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("User please enter the size of array");
		int n = scan.nextInt();
		
		int a [] = new int[n];
		System.out.println(a.length+"user please enter the elements of an array");
		
		//store elements into the array
		for(int i = 0;i<=a.length-1;i++) {
			a[i]= scan.nextInt();
	
		}
		
		
		
		System.out.println("array elements of a");
		for(int j = 0;j<=a.length-1;j++) {
			System.out.println(a[j]);
		}
		
		
		
		
		System.out.println("The four integer elements of an array b are:");
		
		int b [] = new int[n];
		for(int j = 0;j<=a.length-1;j++) {
			b[j] = a[j];
		}
		
		for(int j = 0;j<=a.length-1;j++) {
			System.out.println(b[j]);
		}
		
		
	     
	     
}
}
