import java.util.*;

public class Remove_Duplicate_Letters_316 {
	/*
	 * Idea is to use a set to keep all eliments uniqueue
	 * use a stack to put the eliments in the smallest to largest order
	 * */
	public static String removeDuplicateLetters(String s) {
		 Stack<Character> stack = new Stack<>();
		    StringBuilder res = new StringBuilder();
		        
		    // this lets us keep track of what's in our solution in O(1) time
		    HashSet<Character> seen = new HashSet<>();
		    
		    int[] count = new int[26];
		        
		    for(int i = 0; i < s.length(); i++) {
		        count[s.charAt(i) - 'a']++; //count the number of occurances of chars
		    }
		        
		    for(int i = 0; i < s.length(); i++) {
		        char c = s.charAt(i);
		        
		        count[s.charAt(i) - 'a']--; //decrement the counts as we keep readong the string
		        
		        //Only add if it does not exist
		        if(seen.contains(c)) {
		            continue;
		        }
		        
		        //check if the charsacter is greate than c so remove     
		        while(!stack.isEmpty() && c < stack.peek() && count[stack.peek() - 'a'] != 0) { //and more occurances of c in teh array 
		            seen.remove(stack.pop()); // remove from both stack and set
		        }

		        seen.add(c);
		        stack.push(c);

		        
		    }
		    //reverse the order
		    while (!stack.isEmpty()) {
		        res.insert(0, stack.pop());
		    }
		        
		    return res.toString();   
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bcabc";
		System.out.println(removeDuplicateLetters(s));
	}

}
