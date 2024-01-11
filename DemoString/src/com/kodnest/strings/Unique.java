package com.kodnest.strings;

public class Unique {
	
	    public static void main(String[] args) {
	        String inputString = "abc";

	        System.out.println("Original String: " + inputString);
	        System.out.println("Unique Substrings:");
	        printUniqueSubstrings(inputString);
	    }

	    public static void printUniqueSubstrings(String str) {
	        int length = str.length();

	        // Iterate over each character in the string
	        for (int i = 0; i < length; i++) {
	            // Form substrings starting from the current character
	            for (int j = i + 1; j <= length; j++) {
	                String substring = str.substring(i, j);
	                if (isUnique(substring, i, j, str)) {
	                    System.out.println(substring);
	                }
	            }
	        }
	    }

	    public static boolean isUnique(String substring, int start, int end, String str) {
	        // Check if the substring is unique in the given range
	        for (int i = start; i < end - 1; i++) {
	            for (int j = i + 1; j < end; j++) {
	                if (substring.equals(str.substring(i, j))) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	


	}

