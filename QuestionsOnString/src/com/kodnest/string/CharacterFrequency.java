package com.kodnest.string;

public class CharacterFrequency {
	
	    public static void main(String[] args) {
	        String inputString = "hello";
	        char targetChar = 'l';

	        System.out.println("Original String: " + inputString);
	        System.out.println("Frequency of '" + targetChar + "': " + getCharacterFrequency(inputString, targetChar));
	    }

	    public static int getCharacterFrequency(String str, char targetChar) {
	        int frequency = 0;

	        // Iterate over each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            // Check if the current character matches the target character
	            if (str.charAt(i) == targetChar) {
	                frequency++;
	            }
	        }

	        return frequency;
	    }
	

}
