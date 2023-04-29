import java.util.*;

public class Generate_Parentheses_22 {
	
	
	public static List<String> generateParenthesis(int n) {
   /*
   n = 3 print -> ()()() ((())) (()()) 
   recursion and use string builder append based parenthesis based on n
   */ 

	        List<String> res = new ArrayList<>();
	        helper(res, n, "", 0, 0);
	        return res;
	    }
	    
	    
	public static void helper(List<String> res, int n, String curr, int open, int close) {
	        //Base
	        if(curr.length() == n*2) {
	            res.add(curr);
	            return;
	        }
	        //add more open patheesis
	        if(n > open) {
	            helper(res, n, curr + "(", open + 1, close);
	        }
	        //need to add more closed parenthesis
	        if(open > close) {
	           helper(res, n, curr + ")", open, close + 1);
	        }
	        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(generateParenthesis(n));
	}

}
