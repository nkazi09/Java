import java.util.*;

public class Karat_longest_contiguous_sequence {
	/*
	 Problem statement: We have some clickstream data that we gathered on our client's website. 
	Using cookies, we collected snippets of users' anonymized URL histories 
	while they browsed the site. The histories are in chronological order, and 
	no URL was visited more than once per person.
	
	Write a function that takes two users' browsing histories as input and 
	returns the longest contiguous sequence of URLs that appears in both.
	
	Sample input:
	user0 = ["/start", "/green", "/blue", "/pink", "/register", "/orange", "/one/two"]
	user1 = ["/start", "/pink", "/register", "/orange", "/red", "a"]
	user2 = ["a", "/one", "/two"]
	user3 = ["/pink", "/orange", "/yellow", "/plum", "/blue", "/tan", "/red", "/amber", "/CornflowerBlue", "/LightGoldenRodYellow", ]
	user4 = ["/pink", "/orange", "/amber", "/plum", "/blue", "/tan", "/red", "/lavender", "/CornflowerBlue", "/LightGoldenRodYellow"]
	user5 = ["a"]
	
	Sample output:
	findLongestHistory(user0, user1) => ["/pink", "/register", "/orange"]
	findLongestHistory(user0, user2) => [] (empty)
	findLongestHistory(user0, user0) => ["/start", "/green", "/blue", "/pink", "/register", "/orange", "/one/two"]
	findLongestHistory(user5, user2) => ["a"]
	findLongestHistory(user3, user4) => ["/plum", "/blue", "/tan", "/red"]
	findLongestHistory(user4, user3) => ["/plum", "/blue", "/tan", "/red"]
	
	n: length of the first user's browsing history
	m: length of the second user's browsing history

	*/
	
	public static List<String> findContinousURL(String[] user1, String[] user2){
		 int[][] dp = new int[user1.length+1][user2.length+1];
	        for(int i = 1; i <= user1.length; i++) {
	            for(int j = 1; j <= user2.length; j++) {
	                if(user1[i-1] == user2[j-1]) {
	                    dp[i][j] = dp[i-1][j-1] + 1;
	                } else {
	                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
	                }
	            }
	        }
	  
	        int row = dp.length-1; 
	        int col = dp[0].length-1;
	        
	        List<String> result = new ArrayList<>();
	        
	        while (row > 0 && col > 0) {
	        	if (dp[row-1][col-1] + 1 == dp[row][col]) {
	        		result.add(user1[row-1]);
	        		row--;
	        		col--;
	        	} else {
	        		if (dp[row-1][col] == dp[row][col]) {
	        			row--;
	        		} else {
	        			col--;
	        		}
	        	}
	        }
	        Collections.reverse(result);
	        return result;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] user1 = {"/start", "/green", "/blue", "/pink", "/register", "/orange", "/one/two"};
		String[] user2 = {"/start", "/pink", "/register", "/orange", "/red", "a"};
		List<String> repeatingStrings = findContinousURL(user1, user2);

	  for(String str : repeatingStrings) {
          System.out.println(str);
	  }
	
	}

}
