import java.util.Scanner;
public class SecondHighLowElementOfArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int firstLowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = num;
            } else if (num > secondHighest && num != firstHighest) {
                secondHighest = num;
            }

            if (num < firstLowest) {
                secondLowest = firstLowest;
                firstLowest = num;
            } else if (num < secondLowest && num != firstLowest) {
                secondLowest = num;
            }
        }

        System.out.println("Second Highest: " + secondHighest);
        System.out.println("Second Lowest: " + secondLowest);
}
}
