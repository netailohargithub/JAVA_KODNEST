
public class ReverseArray {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original Array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println("\nArray in Reverse Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
