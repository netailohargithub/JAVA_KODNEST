package com.kodnest.programing;

import java.util.Scanner;

public class Application13 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a number");
		double principal = scan.nextDouble();
		double rate = scan.nextDouble();
		double time = scan.nextDouble();
		Question13 q13 = new Question13();
		
		double si = q13.calculateSimpleInterest(principal,rate,time);
		System.out.println("The Simple Interest is :"+si);
		scan.close();
	}
}
