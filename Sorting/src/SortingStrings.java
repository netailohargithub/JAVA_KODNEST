
public class SortingStrings {
public static String getSmallestAndLargest(String s, int k) {
	String smallest = "";
	String largest = "";
	String emp = "";
	for(int i = 0;i<s.length();i++) {
		for(int j = i+1;j<split.length-i-1;j++) {
			if(split[j].compareTo(split[j+1])>0) {
				String temp = split[j];
				split[j] = split[j+1];
				split[j+1]=temp;
			}
		}
	}
	smallest = split[0];
	largest = split[sp];
	return smallest +"\n"+ largest;
	
}
}
