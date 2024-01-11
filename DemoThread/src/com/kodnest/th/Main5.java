package com.kodnest.th;

public class Main5 {
public static void main(String[] args) {
	Hospital task = new Hospital();
	
	 Thread t1 = new Thread(task);
	 t1.setName("Thor");
	 Thread t2 = new Thread(task);
	 t2.setName("Iron_Man");
	 
	 t1.start();
	 t2.start();
	 
}
}

class Hospital implements Runnable{

	
	public synchronized void run() {
	String name =  	Thread.currentThread().getName();
		System.out.println(name+" is in ICU");
		try {
			Thread.sleep(5000);
		
		
		System.out.println(name+" is getting Treatment");
		Thread.sleep(5000);
		System.out.println(name+" is getting dischurge");
		
		}catch(Exception e) {
			System.out.println("Exception Handling");
		}
		
	}
	
}