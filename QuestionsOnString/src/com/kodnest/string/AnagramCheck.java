package com.kodnest.string;

import java.util.Arrays;

public class AnagramCheck {
	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        if (areAnagrams(str1, str2)) {
	            System.out.println("The strings are anagrams.");
	        } else {
	            System.out.println("The strings are not anagrams.");
	        }
	    }

	    public static boolean areAnagrams(String str1, String str2) {
	        // Remove spaces and convert to lowercase for case-insensitive comparison
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        // Check if the sorted characters of both strings are equal
	        return Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
	    }

}
