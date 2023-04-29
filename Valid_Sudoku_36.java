import java.util.*;
public class Valid_Sudoku_36 {
	
	/*
	* Approch: HashSet 3 hashsets
    * 1. For each row, we create a HashSet to check for duplicates in each row.
    * 2. For each column, we also create a HashSet to check for duplicates in each column.
    * 3. For each square, we also create a HashSet to check for duplicates in each square, but we need to 
    */
	public static boolean isValidSudoku(char[][] grid) {
		HashSet<Character>[] row = new HashSet[n];
		HashSet<Character>[] col = new HashSet[n];
		HashSet<Character>[] square = new HashSet[n];
		
		int n = 9;
		
		for(int i = 0; i < n; i++) {
			row[i] = new HashSet<>();
			col[i] = new HashSet<>();
			square[i] = new HashSet<>();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				char temp = grid[i][j];
			
				if(temp == ' ') {
					continue;
				}
				int index = i / 3 * 3 + j / 3; 
				
				if(row[i].contains(temp) || col[j].contains(temp) || square[index].contains(temp)) {
					return false;
				}
				
				row[i].add(temp);
				col[j].add(temp);
				square[index].add(temp);
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = 
				{{'5','3','.','.','7','.','.','.','.'}
				,{"6",".",".","1","9","5",".",".","."]
				,[".","9","8",".",".",".",".","6","."]
				,["8",".",".",".","6",".",".",".","3"]
				,["4",".",".","8",".","3",".",".","1"]
				,["7",".",".",".","2",".",".",".","6"]
				,[".","6",".",".",".",".","2","8","."]
				,[".",".",".","4","1","9",".",".","5"]
				,[".",".",".",".","8",".",".","7","9"]]
	}

}
