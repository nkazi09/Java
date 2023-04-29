import java.util.*;

public class spiralMatrix_54 {
	public static List<Integer> spiraMatrix(int[][] matrix) {
		
		List<Integer> res = new ArrayList<>();
		//define the boundaries
		int top = 0;
		int left = 0;
 		int right = matrix[0].length - 1;
		int bottom = matrix.length - 1;
		int size = matrix[0].length * matrix.length; 
 		
		//base
		if(matrix.length == 0 || matrix == null) return res;
		
		while(size > res.size()) {
			
			//loop through the boundaries
			//left -> right
			for(int i = left; i <= right && size > res.size(); i++ ) {
				res.add(matrix[top][i]);
				
			}
			top++;
			
			//top->bottom 
			for(int i = top; i <= bottom && size > res.size(); i++ ) {
				res.add(matrix[i][right]);
				
			}
			right--;
			
			//right->left
			for(int i = right; i >= left && size > res.size(); i-- ) {
				res.add(matrix[bottom][i]);
				
			}
			bottom--;

			//bottom->up
			for(int i = bottom; i >= top && size > res.size(); i-- ) {
				res.add(matrix[i][left]);
				
			}
			left++;
		
		}
		
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

		System.out.println(spiraMatrix(matrix));

	}

}
