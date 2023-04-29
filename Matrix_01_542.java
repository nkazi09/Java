import java.util.*;

public class Matrix_01_542 {
/*
 * 
 * Calculate distance from 1 to newrst cells 
 * Restrict it to only 2 directions which 
 * 	- first direction from curr cell as abs(k - i) + abs(1-j)
 *  - is distance smaaller then update distance
 * First, left and top neighbor
 * 2nd, bottom and right neighbors and compute distance
 * 
 * Time: O(n*m)
 * Space:O(1)
 * */
	
	public static int[][] updateMatrix(int[][] matrix) {
		Queue<int[]> queue = new LinkedList<>();
        int m = matrix.length, n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int row = cur[0] + dir[i][0];
                int col = cur[1] + dir[i][1];
                if (row < 0 || row >= m || col < 0 || col >= n || visited[row][col]) {
                    continue;
                }
                visited[row][col] = true;
                matrix[row][col] = matrix[cur[0]][cur[1]] + 1;
                queue.offer(new int[]{row, col});
            }
        }
        return matrix;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = new int[][]{{0,0,0},{0,1,0},{1,1,1}};
		
		int[][] res = updateMatrix(mat);
		for(int[] re : res) {
			System.out.println(Arrays.toString(re));
		}
	}

}
