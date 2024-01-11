package com.kodnest.string;

public class PalindromeCheck {
	
	    public static void main(String[] args) {
	        String inputString = "madam";

	        System.out.println("Original String: " + inputString);
	        if (isPalindrome(inputString)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        // Iterate from both ends towards the center
	        while (left < right) {
	            // Compare characters from both ends
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; // Not a palindrome
	            }

	            left++;
	            right--;
	        }

	        return true; // Palindrome
	    }
	

}
