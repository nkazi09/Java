import java.util.*;

public class Rotting_Oranges_994 {

	//identify the number of non enpty cells
	// do dfs/bfs on all 4 directions
	//check at the end on the number oranges we started with vs what we have rotten matches if they dont match that measn 
	//we have oranges that can not be rotten thus return -1
	public static int rottenOrange(int[][] grid) {
		
		int fresh = 0;
		int min = 0;
		int rotten = 0;
		

		Queue<int[]> queue = new LinkedList<>();
		
		
		if(grid == null || grid.length == 0) return 0;
		
		for(int i = 0; i < grid.length; i++) {
			
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 2) {
					queue.add(new int[] {i, j});
					
				}
				if(grid[i][j] != 0) {
					fresh++;
				}
			}
		}
		
		//base case: no fresh orange that can be rotten
		if(fresh == 0) return 0;
		
		//directions
		int dx[] = {0, 0 , -1, 1};
		int dy[] = {1, 1, 0, 0};
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			rotten += size;
			
			for(int i = 0; i < size; i++) {
				int[] point = queue.poll();
				
				for(int j = 0; j < 4; j++) {
					int x = point[0] + dx[j];
					int y = point[1] + dy[j];
				
				
					if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0 || grid[x][y] == 2) {
						continue;
					}
					
					grid[x][y] = 2;
					queue.add(new int[] {x, y});
				
				}
				
			}
			if(queue.size() != 0 ) {
				
				min++;
			}
			
			
		}
		
		return fresh == rotten ? min : -1;
	}
	
	public static void main(String[] args) {
		int grid[][] = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
		System.out.println(rottenOrange(grid));
		
	}

}
