package com.kodnest.th;

public class Main4 {
	public static void main(String[] args) {
		
		Task task = new Task();
		task.start();
		
		for(int i =50;i<=60;i++) {
			System.out.println("Parent thread");
			Thread.currentThread().yield();
		}
		
	}
}
class Task extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child thread");
		}
	}
}