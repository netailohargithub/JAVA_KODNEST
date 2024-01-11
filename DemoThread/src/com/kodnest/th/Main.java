package com.kodnest.th;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Thread currentThread =		Thread.currentThread();
System.out.println(currentThread);
		
			
    PrintOneToTen printOneToTen= new PrintOneToTen();
    printOneToTen.start();
   // Addition addi= new Addition();
    //addi.addNumbers();
    Alphabate alpha = new Alphabate();
    alpha.start();
    printOneToTen.setName("second-threag");
    alpha.setName("first-thread");
}
}


