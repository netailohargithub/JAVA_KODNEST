package com.kodnest.string;

public class ReverseWholeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s = "hello java program";
  String []a = s.split(" ");
  for(int i = a.length-1;i>=0;i--) {
	  StringBuffer str = new StringBuffer(a[i]);
	  System.out.print(str.reverse()+" ");
        }
	}

}
