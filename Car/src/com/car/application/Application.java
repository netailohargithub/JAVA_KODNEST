package com.car.application;

public class Application {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "Volvo";
		c1.modelName = " Xc90";
		c1.price = 15000000;
		c1.colour ="Black";
		System.out.println("---------------");
		System.out.print(c1.name);
		System.out.println(c1.modelName);
		System.out.println(c1.price);
		System.out.println(c1.colour);
		c1.drive();
		c1.stop();
		System.out.println("---------------");
		Car c2 = new Car();
		c2.name = "Mercedes";
		c2.price = 35000000 ;
		c2.colour ="Black";
		c2.modelName = " Maybach650";
		System.out.print(c2.name);
		System.out.println(c2.modelName);
		System.out.println(c2.price);
		System.out.println(c2.colour);
		c2.drive();
		c2.stop();
		System.out.println("---------------");

	}
}
