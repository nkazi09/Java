import java.util.*;

public class Decode_Ways_91 {
	//Approch: Dynamic programing - bottom up processing 
	//Map up to 2 digits since a-z > 1-26
    public static int numDecodings(String s) {
    
    	int[] dp = new int[s.length()];
    	dp[0] = 1;
    	dp[1] = s.charAt(0) == '0' ? 0 : 1;
    	
    	for(int i = 2; i <= s.length(); i++) {
    		//pick two digits
    		int first = Integer.valueOf(s.substring(i-1, i));
    		int second = Integer.valueOf(s.substring(i-2, i));
    		//first digit
    		if(first >= 1 && first <= 9) {
    			dp[i] += dp[i-1]; 
    		}
    		//second digit picked
    		if(second >= 10 && second <= 26) {
    			dp[i] += dp[i-2]; 
    		}
    	}
    	
    	return dp[s.length()];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
