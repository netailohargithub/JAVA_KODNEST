package com.kodnest.employee;

public class Employee {
	private String name;
	private int age;
	private int id;
	private int salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void work()
	{
		System.out.println("Working");
		
	}
	public void meeting()
	{
		System.out.println("Meeting");
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
	
}
