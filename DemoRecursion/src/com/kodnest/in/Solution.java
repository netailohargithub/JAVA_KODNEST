package com.kodnest.in;

public class Solution {
public static void main(String[] args) {
	int n = 4;
	fact(n);
}
public static void fact(int n) {
	if (n == 0) {
		return;
	}
	System.out.println("Executing!"+n);
	n--;
	fact(n);
}
}
