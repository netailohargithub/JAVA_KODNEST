package com.kodnest.string;
import java.util.Scanner;
public class FrequencyCountOfAGivenString {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	char ch = 'c';
	int count = 0;
	if(ch<='a' && ch>='z') {
		for(int i = 0;i<s.length();i++) {
		if(ch == s.charAt(i)) {
			count++;
		   }
	      }
		}
	System.out.println(count);
}
}
