package com.kodnest.javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Main2 {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
           ts.add(30);
           ts.add(40);
           ts.add(10);
           ts.add(50);
           ts.add(78);
           
           //System.out.println(ts);
           
           System.out.println(ts.first());
           System.out.println(ts.last());
           
          
           
	}
}
