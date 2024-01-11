package com.kodnest.string;

public class ReverseSecondHalf {
public static void main(String[] args) {
	String s = "programing";
	for(int i = s.length()-1;i>=s.length()/2;i--) {

		System.out.print(s.charAt(i)+" ");
	}
}
}
