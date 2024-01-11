
public class BorderElementsOfAnTwoDArray {

	public static void main(String[] args) {
	    
	        int[][] array = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };

	        int numRows = array.length;
	        int numCols = array[0].length;

	        // Display top row
	        for (int i = 0; i < numCols; i++) {
	            System.out.print(array[0][i] + " ");
	        }

	        // Display right column
	        for (int i = 1; i < numRows; i++) {
	            System.out.print(array[i][numCols - 1] + " ");
	        }
	        // Display bottom row
	        if (numRows > 1) {
	            for (int i = numCols - 2; i >= 0; i--) {
	                System.out.print(array[numRows - 1][i] + " ");
	            }
	        }

	        // Display left column
	        if (numCols > 1) {
	            for (int i = numRows - 2; i >= 1; i--) {
	                System.out.print(array[i][0] + " ");
	            }
	        }

	}

}
