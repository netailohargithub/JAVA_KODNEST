package com.kodnest.ce;

public class ClassA {
 void display(){
	System.out.println("Parent class");
}
 
}
 class B extends ClassA{
	 void display() throws IOException {
		 System.out.println("Child class");
	 }
 }
	

