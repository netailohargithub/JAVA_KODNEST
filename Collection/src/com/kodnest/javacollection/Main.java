package com.kodnest.javacollection;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
	ArrayList cpl = new ArrayList();
	cpl.add("Virat");
	cpl.add("Rohit");
	cpl.add("Dhoni");
	System.out.println(cpl);
	
	ArrayList fpl = new ArrayList();
	fpl.add("Messi");
	fpl.add("Sunil");
	
	ArrayList players = new ArrayList();
	
	players.addAll(cpl);
	players.addAll(fpl);
	System.out.println(players);
	
	
}
}
