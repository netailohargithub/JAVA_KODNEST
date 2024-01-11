package com.kodnest.programing;

import java.util.Scanner;

public class Application5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a int number");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		Question5 q5 = new Question5();
		
		double distance =q5.calculateDistance(a,b);
		System.out.println("The distance is"+ distance);
		scan.close();
	}
}
