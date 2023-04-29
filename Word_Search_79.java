import java.util.*;

public class Word_Search_79 {
	public static boolean exist(char[][] board, String word) {
		if(board.length == 0 || board == null) return true;
		
		char[] w = word.toCharArray();
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if(isWordExist(board, i, j, w, 0)) {
					return true;
				}
				
			}
			
		}
		return false;
		
	}
	
	public static boolean isWordExist(char[][] grid, int i, int j, char[] word, int index) {
		
		if(word.length == index) return true;
		
		if(i < 0 || grid.length <= i || j < 0 || j >= grid[0].length || grid[i][j] != word[index]) {
			
			return false;
		}
		
		char temp = grid[i][j];
		grid[i][j] = ' ';
		
		boolean found = isWordExist(grid, i+1, j, word, index+1) ||
						isWordExist(grid, i-1, j, word, index+1) ||
						isWordExist(grid, i, j+1, word, index+1) ||	
						isWordExist(grid, i, j-1, word, index+1);
		
		grid[i][j] = temp;
		
		return found;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };
		
			System.out.println(exist(grid, "GEEKS"));
			System.out.println(exist(grid, "GGID"));

	}

}
