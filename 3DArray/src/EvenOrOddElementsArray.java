
public class EvenOrOddElementsArray {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        System.out.println("Original Array:");
	        for (int i=0;i<arr.length;i++) {
	            System.out.print(arr[i] + " ");
	        }

	        System.out.println("\nEven Index Elements:");
	        for (int i=0;i<arr.length;i++) {
	            if (i % 2 == 0) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	        System.out.println("\nOdd Index Elements:");
	        for (int i = 0;i<arr.length;i++) {
	            if (i % 2 != 0) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	        System.out.println("\nEven Elements:");
	        for (int i=0;i<arr.length;i++) {
	            if (arr[i] % 2 == 0) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	        System.out.println("\nOdd Elements:");
	        for (int i = 0;i<arr.length;i++) {
	            if (arr[i] % 2 != 0) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
}
