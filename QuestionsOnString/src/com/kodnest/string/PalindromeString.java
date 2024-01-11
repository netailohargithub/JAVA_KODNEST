package com.kodnest.string;

public class PalindromeString {
public static void main(String[] args) {
	String s = "mam";
	StringBuffer str = new StringBuffer(s);
	StringBuffer reverse = str.reverse();
	System.out.println(s.equals(reverse.toString()));
}
}
