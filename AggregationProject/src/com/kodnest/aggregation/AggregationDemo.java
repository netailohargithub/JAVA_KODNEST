package com.kodnest.aggregation;

public class AggregationDemo {
	public static void main(String[] args) {
		Pilot rahul = new Pilot("Rahul");
	
	     Airlines luftanza = new Airlines("Luftanza",rahul);	
	    // luftanza.operte();
	     luftanza = null;
	    // luftanza.operte();
	     rahul.fly();
	     
	}

}


 class Pilot{
	 String name ;
	 public Pilot(String name) {
		 this.name = name;
	 }
	 void fly() {
		 System.out.println(name+" is flying the plane");
	 }
 }
 
 
  class Airlines{
	 String airname ;
	 Pilot pilot;
	 public Airlines(String name, Pilot pilot) {
		 this.airname = name;
		 this.pilot = pilot;
	 }
	 void operte() {
		 System.out.println(airname+" is operating...");
		 pilot.fly();
	 }
 }