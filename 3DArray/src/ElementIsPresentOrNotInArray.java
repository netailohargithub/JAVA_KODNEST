import java.util.Scanner;
public class ElementIsPresentOrNotInArray {
public static void main(String[]args) {
	boolean ispresent = false;
	Scanner scan = new Scanner(System.in);
	int n =scan.nextInt();
	System.out.println("the need checked element is");
	int m = scan.nextInt();
	int a[]= new int[n];
	System.out.println("Enter the elements of array");
	for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	System.out.println("The array is");
	for(int i = 0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
	//check the element present or not
	for(int i = 0;i<a.length;i++) {
	if(a[i]==m) {
		//
		ispresent = true;
		System.out.println("present");
		break;
	}
	}
}
}
