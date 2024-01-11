package com.kodnest.strings;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		//System.out.println(s);
		//for(int j = 0;j<s.length();j++) {
		//for(int i = s.length()-1;i>=0;i--) {
		//	System.out.print(s.charAt(i));
		//}
		//}
  // System.out.println();
		for(int i =0; i<s.length();i++) {
			for(int j = i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}

}
