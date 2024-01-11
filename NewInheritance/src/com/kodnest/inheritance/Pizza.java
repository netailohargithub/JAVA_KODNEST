package com.kodnest.inheritance;

 class Pizza1 {
  public Pizza1() {
	  System.out.println("Macking a basic pizza");
  }
}
 class PepperoniPizza extends Pizza1{
	 public PepperoniPizza() {
		 System.out.println("Adding pepperoni top");
	 }
 }
 public class Pizza{
	 public static void main(String[] args) {
		 PepperoniPizza pizza = new PepperoniPizza();
	}
 }
  
 