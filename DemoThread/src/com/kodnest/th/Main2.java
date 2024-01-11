package com.kodnest.th;

public class Main2 {
	public static void main(String[] args) {
				
		Task2 task2 = new Task2("typing...");
		Task2 task3 = new Task2("autoCorrection...");
		Task2 task4 = new Task2("autoSuggestion...");
		
		task2.start();
		
		task3.setDaemon(true);
		task4.setDaemon(true);

		
		task3.setPriority(1);
		task4.setPriority(1);
		
		task3.start();
		task4.start();
	}
}
