
public class SumOfCorrospondingElementsTwoArray {
public static void main(String[]args) {
	int a[]= {1,2,3,4};
	int b []= {5,6,7,8};
	int c []= new int[4];
	
	for(int i =0;i<a.length;i++) {
		c[i] = a[i]+b[i];
		System.out.println(c[i]);
	}
}
}
