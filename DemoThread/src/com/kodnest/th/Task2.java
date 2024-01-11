package com.kodnest.th;

public class Task2 extends Thread{
public Task2(String name) {
	super(name);
}

public void typing() {
	for(int i = 0; i<= 10;i++) {
		System.out.println("typing...");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public void autoCorrection() {
	for(; ;) {
		System.out.println("autocorrection...");
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
public void autoSuggestion() {
	for(; ;) {
		System.out.println("autocorrection...");
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
public void run() {
	if(this.getName().equalsIgnoreCase("typing"){
		
	}
}

}

