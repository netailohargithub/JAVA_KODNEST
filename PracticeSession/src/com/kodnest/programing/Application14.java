package com.kodnest.programing;

import java.util.Scanner;

public class Application14 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a number");
		double minutes = scan.nextDouble();
		Question14 q14 = new Question14();
		
		double hour = q14.convertToHours(minutes);
		System.out.println("The alternet Hour is :"+hour);
		scan.close();
	}
}
