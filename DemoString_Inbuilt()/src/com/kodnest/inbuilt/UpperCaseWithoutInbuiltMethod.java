package com.kodnest.inbuilt;

public class UpperCaseWithoutInbuiltMethod {
	  public static void main(String[] args) {
	        String inputString = "Program";
	        
	        String upperCaseString = convertToUpperCase(inputString);
	        System.out.println("Original String: " + inputString);
	        System.out.println("Uppercase String: " + upperCaseString);
	    }
	    
	    public static String convertToUpperCase(String str) {
	        StringBuilder upperCaseString = new StringBuilder();
	        
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            
	            // Check if the character is a lowercase letter
	            if (currentChar >= 'a' && currentChar <= 'z') {
	                // Convert to uppercase by adjusting the ASCII value
	                char upperCaseChar = (char) (currentChar - ('a' - 'A'));
	                upperCaseString.append(upperCaseChar);
	            } else {
	                // Keep the character unchanged if it's not a lowercase letter
	                upperCaseString.append(currentChar);
	            }
	        }
	        
	        return upperCaseString.toString();
	    }
}
