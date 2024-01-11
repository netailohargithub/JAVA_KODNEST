import java.util.Scanner;
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		s = s.toLowerCase();
         int count1 = 0;
         int count2 = 0;
         for(int i = 0;i<s.length();i++) {
        	 if(s.charAt(i)=='z') {
        		 count1++;
        	 }else if(s.charAt(i)=='o') {
        		 count2++;
        	 }
         }
         if(count1 * 2 == count2) {
        	 System.out.println("Yes");
         }else {
        	 System.out.println("No");
         }
	}
}
