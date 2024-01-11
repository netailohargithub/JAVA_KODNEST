package com.kodnest.string;

public class EvenIndexElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "programing";
		for (int i = 0;i<s.length();i++) {
			if(i % 2 == 0) {
				System.out.print(s.charAt(i)+" ");
			}
		}

	}

}
