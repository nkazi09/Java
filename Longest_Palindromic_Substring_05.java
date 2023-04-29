import java.util.*;
public class Longest_Palindromic_Substring_05 {
	
	private static int maxLen = 0;
	private static int start = 0;
	
	public static String longestPalindrome(String s) {
		
		if(s.length() < 2) return s;
	
		for(int i = 0; i < s.length() - 1; i++) {
			expandPalandrome(s, i, i+1); //odd
			expandPalandrome(s, i, i); //even
			
		}
		
		return s.substring(start, maxLen + start);
	}
	
	public static void expandPalandrome(String s, int start, int end) {
		//base
		while(start > 0 && s.length() > end  && s.charAt(end) == s.charAt(start)) {
			start--;
			end++;
		}
		int currLen = end - start - 1;
		
		if(currLen > maxLen) {
			start = start + 1;
			maxLen = currLen;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babad";
		System.out.println(longestPalindrome(s));
	}

}
