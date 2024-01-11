import java.util.Scanner;
public class SumOfOddDigitsGivenNumber {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int count = 0;
		
		int sum =0;
		while(i != 0) {
		int digit = i %10;
		if(digit%2 == 0) {
			sum += digit;
		}
		i/=10;

		}
		System.out.println(sum);
	}

}
