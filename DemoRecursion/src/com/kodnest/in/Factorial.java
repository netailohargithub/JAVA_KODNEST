package com.kodnest.in;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	long factorial = calculateFactorial(n);
	System.out.println(factorial);
	scan.close();
}
private static long calculateFactorial(int num) {
	if(num == 0 || num == 1) {
		return 1;
	}else {
		return num * calculateFactorial(num-1);
	}
}
}
