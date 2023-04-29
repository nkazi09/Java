import java.util.*;

public class Set_Matrix_Zeroes_73 {
	/*
	 * Triverse the matrix twice
	 * */
	public static void setZeroes(int[][] matrix) {
		int col0 = 1; //flag
		int rows = matrix.length;
		int cols = matrix[0].length;
		
			
			//check the value at zero'th column
			// Since first cell for both first row and first column is the same i.e. matrix[0][0]
			// We can use an additional variable for either the first row/column.
			// For this solution we are using an additional variable for the first column
			// and using matrix[0][0] for the first row.
	        for (int i = 0; i < rows; i++) {
	            if (matrix[i][0] == 0) col0 = 0;
	            for (int j = 1; j < cols; j++)
	                if (matrix[i][j] == 0)
	                    matrix[i][0] = matrix[0][j] = 0;
	        }

	        for (int i = rows - 1; i >= 0; i--) {
	            for (int j = cols - 1; j >= 1; j--)
	                if (matrix[i][0] == 0 || matrix[0][j] == 0)
	                    matrix[i][j] = 0;
	            if (col0 == 0) matrix[i][0] = 0;
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
