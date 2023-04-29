	import java.util.*;

public class House_Robber_198 {
	//dynamic programing
	public static int rob(int[] nums) {
		
		/*  1. Case 0: where you have no houses
			2. Case 1: where you have 1 house
			3. case 2: where you have 2 houses
			4. case 3: where you have 3 houses
		 */
		//case 0: where no houses are there to rob
		if(nums.length == 0 || nums == null) return 0;
		
		//Case 1: where you have 1 house
		if(nums.length == 1) return nums[0];
		
		// case 2: where you have 2 houses
		if(nums.length == 2) return Math.max(nums[0], nums[1]);
		
		//if there are 3 houses how do we choose between which two to rob
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for(int i = 2; i < nums.length; i++) {
			//take the first and 3rd house or take the middle house
			dp[i] = Math.max(nums[i] + dp[i - 2], dp[i-1]);
		}
		
		return dp[nums.length - 1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));
	
	}

}
