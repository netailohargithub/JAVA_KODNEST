package com.kodnest.in;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter the number for multiplication table: ");
   int number = scan.nextInt();

   System.out.println("Multiplication Table for " + number + ":");
   printMultiplicationTable(number, 1);

   scan.close();
}

public static void printMultiplicationTable(int number, int multiplier) {
   if (multiplier <= 10) {
       System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
       printMultiplicationTable(number, multiplier + 1);
   }
	}

}

