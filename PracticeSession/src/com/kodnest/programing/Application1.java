package com.kodnest.programing;

import java.util.Scanner;

public class Application1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a long number");
		long a = scan.nextLong();
		long b = scan.nextLong();
		Question1 q1 = new Question1();
		
		long result =q1.galacticAddition(a,b);
		System.out.println("The result is"+ result);
		scan.close();
	}
}
