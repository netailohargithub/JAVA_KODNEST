
public class DemoMethods {
	public static void getBill()
	{
		System.out.println("The bill is rs 10");
	}
	public static void getBill(int quantity)
	{
	System.out.println("The bill is"+(10*quantity));
	}
	public static void getBill(String type)
	{
		System.out.println("The bill for"+type+"is rs 20");
	}
	public static void getBill(int quantity,String type)
	{
		System.out.println("The bill for"+quantity+"-"+type+"is rs"+(20*quantity));
	}
	public static void getBill(int quantity1,String type1,int quantity2,String type2)
	{
		System.out.println("The bill for"+quantity1+"-"+type1+"is rs"+(20*quantity1)+quantity2+"-"+type2+"is rs"+(10*quantity2));
	}
public static void main(String[] args)
{
	getBill();
	getBill(4);
	getBill("Masala chai");
	getBill(4,"Masala chai");
	getBill(4,"Masala chai",6,"Sutta");
	
}

}
