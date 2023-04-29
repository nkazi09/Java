import java.util.*;

public class wordsBreak_139 {

	//create all possible substrings and check agains the list of words if it exists
	//create a boolean array which will mark true when we match the word
	//store all the words in a set and check substrins agains the set to see if it exist
	
	public static boolean wordBreak(String s, List<String> wordDict)  {

	     boolean[] dp = new boolean[s.length() + 1];
	     Set<String> set = new HashSet<>(wordDict);
	   
	    //base
	     dp[0] = true; //keeping the array initial eliment to true and update as we find the substrings or not
	    
	   for(int i = 1; i <= s.length(); i++) {
	       for(int j = 0; j < i; j++) {
	           //look at all possible substrings
	           
	           String sub = s.substring(j, i);
	           
	           //checks if substring is found or matched
	           if(dp[j] && set.contains(sub)) {
	               dp[i] = true;
	               break;
	           } 
	       }
	   }     
	        
	  return dp[s.length()]; //return size   
	   
	} 	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		String[] arr = {"leet","code"};
		String s = "leetcode";
		
		for(String a : arr) {
			list.add(a);
		}
		
		System.out.println(wordBreak(s, list));
			
		
		
	}

}
