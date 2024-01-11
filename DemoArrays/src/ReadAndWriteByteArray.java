import java.util.Scanner;

public class ReadAndWriteByteArray {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		//create an byte array of size 4
		System.out.println("User please enter the size of array");
		byte n = scan.nextByte();
		
		byte a [] = new byte[n];
		System.out.println(a.length+"user please enter the elements of an array");
		
		//store elements into the array
		System.out.println("User please enter 4 element of an array");
		for(byte i = 0;i<=a.length-1;i++) {
			a[i]= scan.nextByte();
	
		}
		
		System.out.println("The four integer elements of an array are:");
		
		for(byte j = 0;j<=a.length-1;j++) {
			System.out.println(a[j]);
		}
	}
}
