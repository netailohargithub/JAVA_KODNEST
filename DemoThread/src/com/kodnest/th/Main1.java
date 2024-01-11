package com.kodnest.th;

public class Main1 {
public static void main(String[] args) {
	
	Thread.currentThread().setPriority(8);
	System.out.println(Thread.currentThread());
	//Thread currentThread =		Thread.currentThread();
	//System.out.println(currentThread);
	for(int i = 0; i<= 10;i++) {
		if(i % 2 != 0) {
		System.out.println(i);
		}
	}
	try {
		Thread.currentThread().sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Task1 task1 = new Task1();
	task1.start();
}
}
