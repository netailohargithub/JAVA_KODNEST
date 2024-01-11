
package com.kodnest.string;

public class SolutionEvenAfterReverseOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "program";
		for (int i = 0;i<s.length();i++) {
			if(i % 2 != 0) {
				System.out.print(s.charAt(i)+" ");
			}
		}
		for (int i = s.length();i>=0;i--) {
			if(i % 2 == 0) {
				System.out.print(s.charAt(i)+" ");
			}
		}
	}

}
