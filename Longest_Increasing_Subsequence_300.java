import java.util.Arrays;

public class Longest_Increasing_Subsequence_300 {
	//dynamic programing
	public static int lengthOfLIS(int[] nums) {
		
		if(nums.length <= 1) return nums.length;
	
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		int max = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < i; j++) {
				if(nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
					
				}
			}
			max = Math.max(dp[i], max);
		}
		
		return max;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,9,2,5,3,7,101,18};
		
		System.out.println(lengthOfLIS(nums));
	}

}
