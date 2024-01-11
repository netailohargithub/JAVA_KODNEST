package com.kodnest.string;

public class SecondHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="programing";
		for(int i = (s.length()/2);i<=s.length()-1;i++) {
			System.out.print(s.charAt(i)+" ");
		}
	}

}
