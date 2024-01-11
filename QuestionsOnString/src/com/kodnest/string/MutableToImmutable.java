package com.kodnest.string;

public class MutableToImmutable {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer("hello");
	String str = new String(s);
	System.out.println(str);
}
}
