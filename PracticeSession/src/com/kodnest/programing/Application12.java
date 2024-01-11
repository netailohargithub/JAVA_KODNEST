package com.kodnest.programing;

import java.util.Scanner;

public class Application12 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a number");
		double inches = scan.nextDouble();
		Question12 q12 = new Question12();
		
		double feet = q12.convertInchesToFeet(inches);
		System.out.println("The Feet is :"+feet);
		scan.close();
	}
}
