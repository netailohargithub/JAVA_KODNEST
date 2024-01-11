package com.kodnest.javacollection;
import java.util.ArrayList;
import java.util.Iterator;
public class Main3 {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	//System.out.println(al);
	//al.size();
	System.out.println(al.size());
	System.out.println("using for loop");
	for(int i = 0;i<al.size();i++) {
		System.out.print(al.get(i)+" ");
	}
	System.out.println();
	System.out.println("Using while loop");
	
	int i = 0;
	while(i<al.size()) {
		System.out.print(al.get(i)+" ");
		i++;
	}
  System.out.println();
  System.out.println("Using do while loop");
	int b =0;
	do{
		System.out.print(al.get(b)+" ");
		b++;
		
	}while(b<al.size());
	
	System.out.println();
	System.out.println("Using for each loop");
	for(Object c : al) {
		System.out.print(c+" ");
	}
	System.out.println();
	System.out.println("using iterator method");
	Iterator it = al.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");
	}
}
}
