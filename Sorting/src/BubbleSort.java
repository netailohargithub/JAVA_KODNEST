
public class BubbleSort {
	public static void printArray(int a[]) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
public static void main(String[] args) {
	int a []= {7,8,1,2,3};
	
	// bubble sorting 
	 for(int i=0;i<a.length-1;i++) {
		 for(int j =0; j<a.length-i-1;j++) {
			 if(a[j]>a[j+1]) {
				 //swap
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]= temp; 
				//System.out.println(a[j]);
			 }
		 }
	 }
	 
	 printArray(a);
}
}
