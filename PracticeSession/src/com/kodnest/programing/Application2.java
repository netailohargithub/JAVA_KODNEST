package com.kodnest.programing;

import java.util.Scanner;

public class Application2 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("User! please enter a int number");
			int a = scan.nextInt();
			int b = scan.nextInt();
			Question2 q2 = new Question2();
			
			System.out.println("The substraction is:"+q2.substractNumber(a,b));
			System.out.println("The multiplication is:"+q2.multiplicationNumber(a,b));
			System.out.println("The divition is:"+q2.divisionNumber(a,b));
			System.out.println("The reminder is:"+q2.reminderNumber(a,b));
			scan.close();
		}
}
