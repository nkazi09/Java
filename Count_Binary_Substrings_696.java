import java.util.*;

public class Count_Binary_Substrings_696 {
	 public static int countBinarySubstrings(String s) {
		 int i = 1;
		 int count = 0;
		 int prev = 0;
		 int curr = 1;
		/*
		 * have two pointers prev and curr keep moving them to identify the groups
		 * Since we know the String will consist of 1's and 0's we can find the groups when
		 * */
		
		while(i < s.length()) {
			//Ex: 11000110
			
			if(s.charAt(i - 1) != s.charAt(i)) {
				//find the group
				count += Math.min(curr, prev); //substring count
				
				prev = curr; //start new group
				curr = 1; //reset curr
			} else {
				//keep adding to the current group
				curr++;
			}
			
			i++;
		
		}
		
		return count += Math.min(curr, prev);
		 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "00110011";
		
		System.out.println(countBinarySubstrings(s));
	}

}
