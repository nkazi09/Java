import java.util.*;
public class Longest_Repeating_Character_Replacement_424 {
	public static int characterReplacement(String s, int k) {
		int[] count = new int[26];
		int maxLen = 0;
		int frequent = 0; //to keep track of the most frequent char
		int start = 0;
		
		for(int  i = 0; i < s.length(); i++) {
			int charCount = count[s.charAt(i) - 'A']++;
			frequent = Math.max(frequent, charCount);
			
			//sliding window
			while(i - start - frequent + 1 > k) {
				count[s.charAt(i) - 'A']--;
				start++;
			}
			//check the max length of the substring
			maxLen = Math.max(maxLen, i-start+1);
		}
		return maxLen;
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AABABBA"; 
		int k = 1;
		System.out.println(characterReplacement(s, k));
	}

}
