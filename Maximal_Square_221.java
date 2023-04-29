import java.util.*;

public class Maximal_Square_221 {
	public static int maximalSquare(int[][] grid) {
		int res = 0;
		int[][] sol = new int[grid.length+1][grid[0].length+1];
		
		if(grid.length == 0) return 0;
		
		
		for(int i = 1; i <= grid.length; i++) {
			for(int j = 1; j <= grid[0].length; j++) {
				if(grid[i-1][j-1] == 1) {
					sol[i][j] = Math.min(Math.min(sol[i][j-1], sol[i-1][j-1]), sol[i-1][j]) + 1;
					res = Math.max(sol[i][j], res);
				}
			}
		}
		return res * res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{0,1},{1,0}};
		System.out.println(maximalSquare(matrix));
	}

}
