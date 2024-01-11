
public class ThreeDArray1 {
public static void main(String[]args) {
	 int a[][][]= {
			         {
				       {10,20,30},
				       {110,120,40}
			         },
			         {
				        {40,50,60},
				        {80,90,80}
			          }
	 
	               };
	 
	 for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			for (int j2 = 0; j2 < a[i][j].length; j2++) {
				
				System.out.print(a[i][j][j2]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	 
}
}
