
public class ElementsOfAnArrayMultipleOf {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        System.out.println("Original Array:");
	        for (int i=0;i<arr.length;i++) {
	            System.out.println(arr[i] + " ");
	        }
	        System.out.println("the elements that ar multiple of 5:");
	        for(int i =0;i<arr.length;i++) {
	        	if(arr[i] % 5 == 0) {
	        		System.out.println(arr[i]+" ");
	        	}
	        }
	        System.out.println("the elements that ar multiple of 3:");
	        for(int i =0;i<arr.length;i++) {
	        	if(arr[i] % 3 == 0) {
	        		System.out.println(arr[i]+" ");
	        	}
	        }
	        System.out.println("the elements that ar multiple of 5 & 3:");
	        for(int i =0;i<arr.length;i++) {
	        	if(arr[i] % 5 == 0 && arr[i] %3 ==0) {
	        		System.out.println(arr[i]+" ");
	        	}
	        }
	        System.out.println("the elements that ar multiple of 5 or 3:");
	        for(int i =0;i<arr.length;i++) {
	        	if(arr[i] % 5 == 0 || arr[i] % 3 == 0) {
	        		System.out.println(arr[i]+" ");
	        	}
	        }
}
}
