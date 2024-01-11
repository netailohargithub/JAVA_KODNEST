package com.kodnest.employee;

public class Application {
	public static void main (String [] args)
	{
		Employee e1= new Employee();
		e1.setName("Ram");;
		e1.setAge(29);;
		e1.setId(123);;
		e1.setSalary(60000);;
		System.out.println(e1);
		e1.work();
		e1.meeting();
		System.out.println("==========");
		Employee e2= new Employee();
		e2.setName("Sam");
		e2.setId(2227);
		e2.setAge(23);
		e2.setSalary(7777);
		System.out.println(e2);
		e2.work();
		e2.meeting();
		
	}
}
