package com.kodnest.inheritance;

class A{
	int age;
}


class B extends A{
	String name;
	public B(int i) {
		
	}
}


public class Solution {
   public static void main(String[] args) {
	B b = new B(10);
	//int c = 10;
	
	System.out.println(b.name);
	System.out.println(b.age);
}
}
