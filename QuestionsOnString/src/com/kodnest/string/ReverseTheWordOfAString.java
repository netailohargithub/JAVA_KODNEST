package com.kodnest.string;

public class ReverseTheWordOfAString {
public static void main(String[] args) {
	String s = "hello java program";
	String[] split = s.split(" ");
	for(int i =split.length-1; i>=0;i--) {
		System.out.print(split[i]+" ");
	}

}
}
