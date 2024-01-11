import java.util.Scanner;
public class WordOutputifProvideAoutpoutB {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		//int i = scan.nextInt();
		char ch = scan.next().charAt(0);
		int i = (int)ch;
		//for(char ch =(char)i;i<=65 && i>=122;ch++) 
		for(;i<=65 && i>=122;i++)
		{
			System.out.println((char)i);
		}
		
	}
	

}
