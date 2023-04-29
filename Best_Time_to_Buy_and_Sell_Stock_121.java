import java.util.*;

public class Best_Time_to_Buy_and_Sell_Stock_121 {
	public static int maxProfit(int[] nums) {
		int minPrice = Integer.MAX_VALUE;;
		int maxProfit = 0;
		
		for(int i = 0; i < nums.length; i++) {
			minPrice = Math.min(minPrice, nums[i]);
			maxProfit = Math.max(maxProfit, nums[i] - minPrice);
			
		}
		
		return maxProfit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}

}
