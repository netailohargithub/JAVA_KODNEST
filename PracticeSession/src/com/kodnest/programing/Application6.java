package com.kodnest.programing;

import java.util.Scanner;

public class Application6 {
public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("User! please enter a number");
	double f = scan.nextDouble();
	Question6 q6 = new Question6();
	
	double celsious = q6.convertFahrenhightToCelsious(f);
	System.out.println("The celsious value is"+celsious);
	scan.close();
}
}
