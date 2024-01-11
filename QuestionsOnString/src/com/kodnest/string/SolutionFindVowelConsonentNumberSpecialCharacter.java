package com.kodnest.string;

public class SolutionFindVowelConsonentNumberSpecialCharacter {

		public static void main(String[] args) {
			String s = "write2javaproGrams4H.W!";
			
			int vowel = 0;
			int consonant = 0;
			int num = 0;
			int charac = 0;
			
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(ch>='a' && ch<='z') {
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
						vowel++;
					}
					else {
						consonant++;
					}
				}
				else if(ch>='0' && ch<='9') {
					num++;
				}
				else if(ch>='A' && ch<='Z') {
					if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
						vowel++;
					}
					else {
						consonant++;
					}
				}
				else {
					charac++;
				}
			}
			System.out.println("Vowel Count is: "+vowel);
			System.out.println("Consonant Count is: "+consonant);
			System.out.println("Number Count is: "+num);
			System.out.println("Special Characters Count is: "+charac);
	}
}