package com.kodnest.inbuilt;

public class WithOutLengthMethod {
	public static void main(String[] args) {
        String myString = "Program";
        
        int length = findStringLength(myString);
        System.out.println("Length of the string: " + length);
    }
    
    public static int findStringLength(String str) {
        int count = 0;
        // Iterate through the characters until the end of the string
        for (int i = 0; i < str.toCharArray().length; i++) {
            // Check for null character to determine the end of the string
            if (str.toCharArray()[i] == '\0') {
                break;
            }
            count++;
        }
        return count;
    }
}
