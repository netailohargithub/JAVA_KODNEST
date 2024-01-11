package com.demo.constructor;

public class Application {
public static void main(String[] args)
{
	Student s = new Student();
	//s.name="Netai";
	//s.age=21;
	//s.marks=64.23f;
	System.out.println(s.name);
	System.out.println(s.age);
	System.out.println(s.marks);
	s.study();
}
}
