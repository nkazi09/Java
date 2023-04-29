import java.util.*;

public class Longest_Valid_Parentheses_32 {
	public static int longestValidParentheses(String s) {
		/*
		 * Stack approch 1
		 * 1. push -1 on the beganing
		 * 2. Push index of the open parenthesis
		 * 3. pop eliment when encounter closed pargethesis calculate the length and continue readin
		 * 
		 * Approch 2: Optimized using loops
		 * */
		/*
		//Approch 1:
		if(s.length() == 0 || s == null) return 0;
		int max = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
			
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				stack.push(i);
			} else  {
				stack.pop();
				if(stack.isEmpty()) {
					stack.push(i);
				} else { //otherwise calculate length
					max = Math.max(max, i - stack.peek());
				}
			}
		}
	
		return max;
		*/
		int open = 0;
		int close = 0;
		int max = 0;
		
		//triverse from left to right
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				open++;
			} else {
				close++;
			}
			
			if(open == close) {
				int len = open + close;
				max = Math.max(max, len);
			} else if(close > open) { //edge case
				//reset the value to 0
				open = 0;
				close = 0;
			}
		}
		
		//Triverse this in the new reverse direction from right to left
		 open = close = 0;
	        for(int i = s.length() -1; i >=0 ; i--) {
	            if(s.charAt(i) == '(') {
	                open++;       
	            } else {
	                close++;
	            } 
	            
	            if(open == close) {
	                int tLength = open + close;
	                max = Math.max(max, tLength);
	            } else if(open > close) { //edge case
	                //reset the values to 0 the parenthesis match up to this point
	                open = 0;
	                close = 0;
	            }
	            
	        }
	         return max;           
	        
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()";
		System.out.println(longestValidParentheses(s));
	}

}
