
public class SelectionSort {
	public static void printArray(int a[]) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int a []= {7,8,1,2,3};
		
		// selection sorting 
		 for(int i=0;i<a.length-1;i++) {
			int  smallest = i;
			 for(int j =i+1; j<a.length;j++) {
				 if(a[smallest] > a[j]) {
                  smallest = j;					 
			    }
			 }
			 //swap
			 int temp = a[smallest];
			 a[smallest]= a[i];
			 a[i]=temp;
		 }
		 
		 printArray(a);

	}

}
