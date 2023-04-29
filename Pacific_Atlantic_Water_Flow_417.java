import java.util.*;

public class Pacific_Atlantic_Water_Flow_417 {
	
	static int dir[][] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; //up, down, right, left
	public static List<List<Integer>> pacificAtlantic(int[][] matrix) {
		  List<List<Integer>> res = new ArrayList<>();
	        //edge case
	       if(matrix == null || matrix.length == 0 || matrix[0].length == 0) 
	            return res;
	        
	        
	        int n = matrix.length;
	        int m = matrix[0].length;
	        //use two matric to capture water reaching pacific and Atlantic
	        boolean[][] pacific = new boolean[n][m];
	        boolean[][] atlantic = new boolean[n][m];
	        //dfs cols
	       
	        for(int i = 0; i < m; i++) {
	            dfs(matrix, 0, i, Integer.MIN_VALUE, pacific);
	            dfs(matrix, n-1, i, Integer.MIN_VALUE, atlantic);
	        }
	        //dfs on rows
	         for(int i = 0; i < n; i++) {
	            dfs(matrix, i, 0, Integer.MIN_VALUE, pacific);
	            dfs(matrix, i, m-1, Integer.MIN_VALUE, atlantic);
	        }
	        
	        //add to the result
	        for(int i = 0; i < n; i++) {
	            for(int j = 0; j < m; j++) {
	                if(pacific[i][j]  && atlantic[i][j]) {
	                    res.add(Arrays.asList(i,j));
	                }
	             }
	        }
	        
	        return res;
		
		
	}
	
	public static void dfs(int[][] matrix, int i, int j, int prev, boolean[][] ocean) {
		if(i < 0 || i >= ocean.length || j < 0 || j >= ocean[0].length) return;
        //if curr value is less than the boarder values then water cant go there thus return nothing
        
		if(matrix[i][j] < prev ||ocean[i][j]) return; //water cant flow
        //mark the visited point
        
        ocean[i][j] = true;
        
        for(int[] d: dir) {
            dfs(matrix, i+d[0], j+d[1], matrix[i][j], ocean);
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
		System.out.println(pacificAtlantic(heights));

	}

}
