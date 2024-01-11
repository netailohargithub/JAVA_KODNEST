package com.kodnest.programing;

import java.util.Scanner;

public class Application9 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			Question9 q9 = new Question9();
			
			int cube = q9.cubeNumber(num);
			System.out.println("The square is"+cube);
			scan.close();
		}
}
