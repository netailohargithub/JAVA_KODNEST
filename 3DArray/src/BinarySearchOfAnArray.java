import java.util.Arrays;
import java.util.Scanner;
public class BinarySearchOfAnArray {

	public static void main(String[] args) {
		int a[]= {13,34,67,89,44,76};
	  Scanner scan =new Scanner(System.in);
	 // int n = scan.nextInt();
	 // int a[]= new int[n];
		
		 System.out.println("Original Array:");
	        for (int element : a) {
	            System.out.println(element + " ");
	        }
	        Arrays.sort(a);
	        System.out.println("sorted array is:");
	        for(int i = 0;i<a.length;i++) {
	        	System.out.println(a[i]+" ");
	        }
	        
	        System.out.println("index element is");
	        
	        System.out.println(Arrays.binarySearch(a, 67) );
	        
	       /* int ele = 68;
	        int low = 0;
	        int high = 5;
	        int flag =0;
	       
	        while(low<=high) {
	        	int mid =(low+high)/2;
	        if(a[mid]== ele) {
	        	System.out.println("element found");
	        	flag++;
	        	break;
	        }else if(ele>a[mid]){
	        	low = mid +1;
	        }else {
	        	high = mid-1;
	        }
	        }
	        if(flag==0) {
	        	System.out.println("element not found ");
	        }*/
	}

}
