package com.kodnest.programing;

import java.util.Scanner;

public class Application3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a long number");
		int a = scan.nextInt();
		Question3 q3 = new Question3();
		
		int result =q3.doubleTheNumber(a);
		System.out.println("The result is"+ result);
		scan.close();
}
}