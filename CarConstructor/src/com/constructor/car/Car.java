package com.constructor.car;

public class Car {
String name;
String model;
long price;
public Car(String a, String b, long c)
{
	name = a;
	model = b;
	price = c;
}
void drive()
{
	System.out.println("Driving");
}
}
