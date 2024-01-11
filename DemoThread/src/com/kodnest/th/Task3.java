package com.kodnest.th;

public class Task3 extends Thread{
	public Task3(String name) {
		super(name);
	}
	public void run() {
		for(; ;) {
			System.out.println("autocorrection...");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
