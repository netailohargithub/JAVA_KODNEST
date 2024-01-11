package com.kodnest.string;

public class FrequencyOfAGivenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "String";
		char ch = 'r';
		int count = 0;
		for(int i = 0; i<s.length();i++) {
			if(ch==s.charAt(i)) {
				count++;
			}
		}
		System.out.println("Frequency of "+ch+" is : "+count);

	}

}
