import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int size = 0;
	try {
		
		size = scan.nextInt();
	int[] arr = new int[size];
	for(int i = 0;i<size;i++) {
		arr[i]= scan.nextInt();
	}
	
	int indexElement = scan.nextInt();
	System.out.println(arr[indexElement]);
		
	}catch(NegativeArraysizeException e1) {
		System.out.println("Negative");
	}
} catch (Exception e) {
	e.printStackTrace();
}
}

