import java.util.Scanner;
public class TotalDigits {
public static void main (String[]args) {
	Scanner scan = new Scanner(System.in);
	int i = scan.nextInt();
	int count = 0;
	int original = i;
	int sum =0;
	
	
	while(i>0) {
		i =i /10;
		count++;
		int reminder = i%10;
		 sum = sum + (int)Math.pow(reminder, count);
		int co = i/10;
	}
	
	
	if (original == sum) {
	System.out.println("Armstrong Numbar");
	}else {
		System.out.println("Not a Armstrong Number");
	}
	
}
}
