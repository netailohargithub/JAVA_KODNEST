package com.student.kodnest;

public class Application {
public static void main (String[] args)
{
	Student s1= new Student();
	s1.name="Netai Lohar";
	s1.age=21;
	s1.id="S19028e2";
	System.out.println(s1.name);
	System.out.println(s1.age);
	System.out.println(s1.id);
	s1.study();
	s1.exams();
	System.out.println("-------------------");
	Student s2= new Student();
	s2.name="Kritanta Biswas";
	s2.age=21;
	s2.id="k19028k2";
	System.out.println(s2.name);
	System.out.println(s2.age);
	System.out.println(s2.id);
	s2.study();
	s2.exams();
}
}
