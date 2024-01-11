package com.kodnest.programing;

import java.util.Scanner;

public class Application4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String s1 = scan.next();
		System.out.println("Enter the Second String");
		String s2 = scan.next();
		
		Question4 q4 = new Question4();
		
		System.out.println("The Complete String is: "+q4.joinStrings(s1, s2));
		scan.close();
	}
}
