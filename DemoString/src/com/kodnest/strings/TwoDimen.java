package com.kodnest.strings;

public class TwoDimen {
public static void main(String[] args) {
	String s = "india newziland";
	String[] split = s.split(" ");
	for (String string : split) {
		System.out.println(string);
	}
	//System.out.println((s.charAt(0)+"").toUpperCase()+s.substring(1));
}
}
