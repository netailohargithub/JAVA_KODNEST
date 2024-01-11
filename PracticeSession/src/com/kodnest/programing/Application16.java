package com.kodnest.programing;

import java.util.Scanner;

public class Application16 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter a number");
		int throttle = scan.nextInt();
		Question16 q16 = new Question16();
		
		int thrust = q16.calculateThrust(throttle);
		System.out.println("The Thrust is :"+thrust);
		scan.close();
	}
}
