import java.util.*;

public class Maximum_Product_Subarray_152 {

	public static int maxProduct(int[] nums) {
		
		if(nums.length == 0 || nums == null) return 0; 
		
		int[] dp = new int[nums.length];
		int min = dp[0];
		int max = dp[0];
		int maxSub = dp[0];
		
		for(int i = 0; i < nums.length; i++) {
			int temp = max;
			
			max = Math.max(nums[i], Math.max(nums[i] * min, max * nums[i]));
			
			min = Math.min(nums[i], Math.min(nums[i] * temp, min * nums[i])); 
			
			maxSub = Math.max(max, maxSub);
		}
		
		return maxSub;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,-2,4};
	
		System.out.println(maxProduct(nums));
	}

}
