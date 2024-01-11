package com.kodnest.string;

public class WithoutUsingLengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "prog";
		int i = 0;
		int count = 0;
try {
	while(true) {
		System.out.println(s.charAt(i));
		count++;
		i++;
	}
} catch (Exception e) {
	System.out.println(count);
}
	}

}
