import java.util.*;

public class Minimum_Moves_to_Equal_Array_Elements_453 {
	/*
	 * how many moves it take to make the entire array equal
	 * nums = [1, 2, 3] -> [2, 3, 3] -> [3, 4, 3] -> [4, 4,4] 3teps it take 
	 * 
	 * 
	 * Approch: Math
	 * 1. calculate the number of moves bu sum(a[i] - min(a))
	 * Time:O(n)
	 * Space: O(1)
	 * */
	
	public static int minMoves(int[] nums) {
		int moves = 0;
		int min = Integer.MAX_VALUE;
		
		//Step 1: compute the min
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] - min != 0) {
				moves++;
			}
		}
		
		return moves;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(minMoves(nums));
	}

}
