package com.kodnest.th;

import java.util.Scanner;

public class Addition {
void addNumbers(){
	Thread currentThread =		Thread.currentThread();
	System.out.println(currentThread);
	Scanner scan = new Scanner(System.in);
	int i = scan.nextInt();
	int j = scan.nextInt();
	System.out.println(i+j);
}
}
