
public class CalculateArea {
	public static void area(int a)
	{
		System.out.println("The area of a square is"+(a*a));
	}
	public static void area(int bredth,int length)
	{
	System.out.println("The area of a rectangle is"+(bredth*length));
	}
	public static void area(double redious)
	{
		System.out.println("The area of circle is"+(3.14*redious*redious));
	}
	public static void area(double base,double slant)
	{
		System.out.println("The area of pyramid is"+((2*base*slant)+((base*base))));
	}
	
public static void main(String[] args)
{
	area(9);
	area(4,5);
	area(8.0);
	area(6.0,9.0);
	
}
}
