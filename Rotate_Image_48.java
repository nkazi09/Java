import java.util.*;

public class Rotate_Image_48 {
	// 1. Reflect
	// 2. Transpose
	public static void rotate(int[][] matrix) {
	
		transpose(matrix);
	    reflect(matrix);
		
	}
	
    //swap rows with colmns with roes
	public static void transpose(int[][] matrix) {
		int n = matrix.length;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];  
				matrix[i][j] = temp;
			}
		}
	}
	//swap to reverse the rows
    //Swap the value of matrix [i][j] with [rows - i - 1][cols - j - 1] for half the rows size.
	public static void reflect(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-j-1];  
				matrix[i][n-j-1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(rotate(matrix));
	}

}
