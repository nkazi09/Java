import java.util.*;

public class Coin_Change_322 {

	public static int coinChange(int[] coins, int amount) {
		//amount has to be greate than coins
		int[] dp = new int[amount+1]; 
		Arrays.fill(dp, amount+ 1);
		
		//base
		dp[0] = 0;
		
		for(int i = 0; i <= amount; i++) {
			
			for(int j = 0; j < coins.length; j++) {
				if(coins[j] <= i) {
					dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
					
				}
				
			}
			
		}
		
		
		
		return dp[amount] > amount ? -1 : dp[amount]; 
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 5 };
	    //int mamount = 11;
	     
	    System.out.println(coinChange(arr, 11));

	
	}

}
