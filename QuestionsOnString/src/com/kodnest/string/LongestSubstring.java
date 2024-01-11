package com.kodnest.string;

public class LongestSubstring {
	    public static void main(String[] args) {
	        String inputString = "abcdefabcd";

	        System.out.println("Original String: " + inputString);

	        String longestSubstring = findLongestSubstring(inputString);

	        System.out.println("Longest Substring: " + longestSubstring);
	    }

	    public static String findLongestSubstring(String str) {
	        int n = str.length();
	        int start = 0, maxLength = 0;
	        int[] lastIndex = new int[256];

	        // Initialize all elements of lastIndex to -1
	        for (int i = 0; i < 256; i++) {
	            lastIndex[i] = -1;
	        }

	        int i = 0;
	        for (int j = 0; j < n; j++) {
	            i = Math.max(i, lastIndex[str.charAt(j)] + 1);

	            if (j - i + 1 > maxLength) {
	                start = i;
	                maxLength = j - i + 1;
	            }

	            lastIndex[str.charAt(j)] = j;
	        }

	        return str.substring(start, start + maxLength);
	    }
}
