package com.kodnest.th;

public class Alphabate extends Thread{
public void run(){
	Thread currentThread =		Thread.currentThread();
	System.out.println(currentThread);
	for(char c = 'a';c<='l';c++) {
		System.out.println(c);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
