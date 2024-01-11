import java.util.Scanner;
public class MaximumSubarraySum {
	 public static int maxSubArray(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return 0;
	        }

	        int maxSum = nums[0];
	        int currentSum = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            currentSum = Math.max(nums[i], currentSum + nums[i]);
	            maxSum = Math.max(maxSum, currentSum);
	        }

	        return maxSum;
	    }
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] nums = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            nums[i] = scanner.nextInt();
	        }

	        int maxSum = maxSubArray(nums);
	        System.out.println("Maximum Subarray Sum: " + maxSum);
	    }
}
