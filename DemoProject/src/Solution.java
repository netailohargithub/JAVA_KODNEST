
public class Solution {
public static void add(int a)
{
System.out.println("The resultis"+a);
}
public static void add(int a, int b)
{
System.out.println("The resultis"+(a+b));
}
public static void add(double a, int b)
{
	System.out.println("The resultis"+(a+b));
}
public static void add(double a, double b)
{
	System.out.println("The resultis"+(a+b));
}
public static void main(String[] args)
{
	add(10);
	//add()
   add(10,20);
   add(47.87,8);
   add(4,8);
	
}
}
