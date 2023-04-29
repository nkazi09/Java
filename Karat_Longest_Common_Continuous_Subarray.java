import java.util.*;

public class Karat_Longest_Common_Continuous_Subarray {
	/*
	 * Gven two arrays User 1 and User 2 return a list of all the common subsets that matches in both
	 * 
	 * [["3234.html", "xys.html", "7hsaa.html"], // user1
	 * ["3234.html", "sdhsfjdsh.html", "xys.html", "7hsaa.html"] // user2
	 * output:  ["xys.html", "7hsaa.html"]
		Approch: 2D Grid
		
		plot the strings in a 2d grid and  triverse the 2d grid and chack what matches and put it into the result and return 
	 * Find the longest common continous array
	 * */
	public static List<List<String>> longestCommonSubArray(String[] s1, String[] s2) {
		int[][] dp = new int[s1.length + 1][s2.length + 1];
		List<List<String>> res = new ArrayList<>();
		int max = 0;
		
		for(int i = 1; i <= s1.length; i++) {
			for(int j = 1; j <= s2.length; j++) {
				if(s1[i-1].equals(s2[j-1])) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				max = Math.max(max, dp[i][j]);
			}
		}
		
		for(int i = dp.length - 1; i >= 0; i--) {
			for(int j = dp[0].length - 1; j >= 0; j--) {
				if(dp[i][j] == max) {
					List<String> list = new ArrayList<>();
					while(dp[i][j] > 0 && i  >= 0 && j >= 0) {
						list.add(0, s1[i-1]);
						dp[i][j] = 0;
						i--;
						j--;
					}
					res.add(list);
				}
				
			}	
			
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = {"3234.html", "xys.html", "7hsaa.html"};
		String[] s2 = {"3234.html", "sdhsfjdsh.html", "xys.html", "7hsaa.html"}; // user2
		System.out.println(longestCommonSubArray(s1, s2));
	}

}
