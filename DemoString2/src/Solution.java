import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		String originalString = "Hello Java Program";
		String reversedString = reverseString(originalString);
		System.out.println("Original String: " + originalString);
		System.out.println("Reversed String: " + reversedString);
	}
	public static String reverseString(String input) {
		StringBuilder stringBuilder = new StringBuilder(input);
		return stringBuilder.reverse().toString();
	}
}
