import java.util.*;

public class Number_of_Islands_200 {
	
	/*
	Approch: DFS

	Linear scan the 2D grid map if a node contains 1 then it is a root node thus trigger dfs.
	Mark every visted node to '0' to mark visited 
	count the number of root node that triggered dfs that will be the number of islands.

	psuedo code:
	    loops through row and column
	        trigger dfs when grid[row][colum] euqals '1'
	            call dfs method
	            keep a count integer keep track of the nuber of dfs trigger

	Time: O(MxN) where m length of rows and n is length of columns

	Space:O(mxn) case that the grid map is filled with lands where DFS goes by M×N deep
	*/

    public static int numberOfIsland(char[][] grid) {

	    if(grid.length == 0 || grid == null) return 0;
	    int count = 0;
	    
	        for(int i = 0; i < grid.length; i++) {
	            for(int j = 0; j < grid[i].length; j++) {
	                if(grid[i][j] == '1') {
	                    count += dfs(grid, i, j);
	                }
	            }
	        }
	    
	    return count;
	    }
    //i = row, j = column
    private static int dfs(char[][] grid, int i, int j) {
       if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }
        
        //visisted the grid mark 0
        grid[i][j] = '0';
        //count the vertical and horizontal '1'
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    
        return 1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = {{'1', '1','1','1', '0'},
						 {'1', '1','0','1', '0'},
						 {'1', '1','0','0', '0'},
						 {'0', '0','0','0', '0'}};
						 	
		System.out.println(numberOfIsland(grid));
	}

}
