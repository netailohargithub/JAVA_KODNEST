package com.kodnest.programing;

import java.util.Scanner;

public class Application17 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a number");
		double sideLength = scan.nextDouble();
		Question17 q17 = new Question17();
		
		double area = q17.calculatePlotArea( sideLength);
		System.out.println("The Plot Area is :"+area);
		scan.close();
	}
}
