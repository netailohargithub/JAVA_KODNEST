package com.kodnest.programing;

import java.util.Scanner;

public class Application8 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	Question8 q8 = new Question8();
	
	int square = q8.squareNumber(num);
	System.out.println("The square is"+square);
	scan.close();
}
}
