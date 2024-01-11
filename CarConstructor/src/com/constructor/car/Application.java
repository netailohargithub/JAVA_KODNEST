package com.constructor.car;

public class Application {
public static void main(String[] args)
{
	Car n= new Car("volvo", "Xc90", 15000000);
	System.out.println(n.name);
	System.out.println(n.model);
	System.out.println(n.price);
	n.drive();
}
}
