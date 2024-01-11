package com.kodnest.javacollection;
import java.util.LinkedList;
public class Main1 {
public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(20);
	ll.add(30);
	ll.add(40);
	System.out.println(ll);
	
	ll.add(1,35);
	System.out.println(ll);
	
	ll.set(0, 60);
	System.out.println(ll);
}
}
