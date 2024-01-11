package com.kodnest.string;

public class TotalWordOfASentence {
	    public static void main(String[] args) {
	        String inputString = "Amar vitor oo bahire ontore ontore acho tumi hridoy jure";

	        System.out.println("Original String: " + inputString);

	        int wordCount = countWords(inputString);

	        System.out.println("Total number of words: " + wordCount);
	    }

	    public static int countWords(String str) {
	        // Using split() method to split the string into words
	        String[] words = str.split("\\s+");

	        // Returning the length of the array, which represents the number of words
	        return words.length;
	    }
}
