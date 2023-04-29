import java.util.*;

public class Longest_Substring_Withou_Repeating_Characters_03 {

	/*
	 * Approch: Sliding window (Fast and slow pointers) & hashSet to store chars that has seen
	 * keep moving fast untill  its not seen in the hasset then we return the substring length
	 * keep computing the maxlength as we move fast forward
	 * Time: 
	 * Space: O(1)
	 * */
	
	public static int longestSubstringWithoutRepeatingChars(String s) {
		int fast = 0;
		int slow = 0;
		int maxLen = 0;
		
		HashSet<Character> seen = new HashSet<>();
		
		while(s.length() > fast) {
			if(!seen.contains(s.charAt(fast))) {
				seen.add(s.charAt(fast));
				maxLen = Math.max(maxLen, fast - slow + 1); //keep computing the length
				fast++;
				
			} else { //once duplicate char found move slow pointer and remove the privious chars and start count fresh
				seen.remove(s.charAt(slow));
				slow++;
			}
			
		}
		
		return maxLen;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(longestSubstringWithoutRepeatingChars(s));
	}

}
