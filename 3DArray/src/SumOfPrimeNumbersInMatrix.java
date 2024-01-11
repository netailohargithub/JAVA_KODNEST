
public class SumOfPrimeNumbersInMatrix {
	  public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        if (num <= 3) {
	            return true;
	        }
	        if (num % 2 == 0 || num % 3 == 0) {
	            return false;
	        }
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	  
	  public static int sumOfPrimeNumbers(int[][] matrix) {
	        int sum = 0;
	        for (int[] row : matrix) {
	            for (int num : row) {
	                if (isPrime(num)) {
	                    sum += num;
	                }
	            }
	        }
	        return sum;
	    }
	  public static void main(String[] args) {
	        int[][] matrix = {
	            {3, 4, 5, 7},
	            {8, 9, 11, 13},
	            {21, 24, 42, 43}
	        };

	        int primeSum = sumOfPrimeNumbers(matrix);
	        System.out.println("Sum of Prime Numbers: " + primeSum);
	    }
}
