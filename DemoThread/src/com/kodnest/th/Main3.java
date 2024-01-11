package com.kodnest.th;

public class Main3 {
public static void main(String[] args) {
	System.out.println("main() start");
	OneToTen task1 = new OneToTen();
	Thread thread = new Thread(task1);
	
	thread.start();
	try {
		thread.join(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("main() stop");
    
    
}
}
