package com.kodnest.string;

public class PangramCheck {
	    public static void main(String[] args) {
	        String inputString = "The quick brown fox jumps over the lazy dog";

	        System.out.println("Original String: " + inputString);

	        if (isPangram(inputString)) {
	            System.out.println("The string is a pangram.");
	        } else {
	            System.out.println("The string is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String str) {
	        // Convert the string to lowercase for case-insensitive comparison
	        str = str.toLowerCase();

	        // Create an array to mark the presence of each letter
	        boolean[] isPresent = new boolean[26];

	        // Iterate over each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if the character is an English alphabet letter
	            if (ch >= 'a' && ch <= 'z') {
	                isPresent[ch - 'a'] = true;
	            }
	        }

	        // Check if all letters are present
	        for (boolean present : isPresent) {
	            if (!present) {
	                return false; // Not a pangram
	            }
	        }

	        return true; // Pangram
	    }
}
