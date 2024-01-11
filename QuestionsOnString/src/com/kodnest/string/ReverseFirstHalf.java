package com.kodnest.string;

public class ReverseFirstHalf {
public static void main(String[] args) {
	String s = "programing";
	for(int j = (s.length()/2)-1;j>=0;j--) {

		System.out.print(s.charAt(j)+" ");
	}
	
}
}
