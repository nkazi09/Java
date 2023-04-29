import java.util.*;

public class Design_Tic_Tac_Toe_348 {
	
		static int[] rows;
		static int[] cols;
		static int diagonal;
		static int antidigonal;
		
		//creates the nxn grid
		public Design_Tic_Tac_Toe_348(int n) {
			rows = new int[n];
			cols = new int[n];
		}
	
	
	public static int move(int row, int col, int player) {
		/* @param player The player, can be either 1 or 2.
	    	@return The current winning condition, can be either:
	            0: No one wins.
	            1: Player 1 wins.
	            2: Player 2 wins. 
	    */
	    //return  1 for player 1 and player 2 return -1
		int currPlayer = (player == 1) ? 1 : -1;
		
        // update currentPlayer in rows and cols arrays
		rows[row] += currPlayer;
		cols[col] += currPlayer;
		
		//Update diogonal
		if(row == col) {
			diagonal += currPlayer;
		}
		
		
		//Update antidiagonal
		if(col == (cols.length - row - 1)) {
			antidigonal += currPlayer;
		}
	    
		int n = rows.length;
		
		//check if the curr player wins
		if(Math.abs(rows[row]) == n || Math.abs(cols[col]) == n || Math.abs(diagonal) == n || Math.abs(antidigonal) == n) {
			return player;
		}
	
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
