import java.util.*;

public class Google_1048_Longest_String_Chain {
	/*
	You are given an Sorted array of words where each word consists of lowercase English letters. and a prefix
	
	wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA without changing the order of the other characters to make it equal to wordB.
	
	For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
	A word chain is a sequence of words [word1, word2, ..., wordk] with k >= 1, where word1 is a predecessor of word2, word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k == 1.
	
	Return the length of the longest possible word chain with words chosen from the given list of words.
	
	Example: 
	Input: words = ["a","b","ba","bca","bda","bdca"], String prefix = ab
	Output: 4
	
	Time: O(logn)
	Space: O(1)
	*/
	public static int longestStrChain(String[] words, String searchPrefix) {
	/*
	 * Approch: Binary Seach
	 * */
		//Base
		 if (words == null || words.length == 0) {
	            return -1;
	        }
	        int low = 0;
	        int high = words.length - 1;
	        int searchPrefixLength = searchPrefix.length();

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            String word = words[mid];
	            int compare = -1;

	            if (searchPrefixLength <= word.length()) {
	                compare = word.substring(0, searchPrefixLength).compareTo(searchPrefix);
	            }

	            if (compare == 0) {
	                return mid;
	            } else if (compare > 0) {
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	            }

	        }
	        return -1;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"a","b","ba","bca","bda","bdca"};
		String prefix = "ba";
		
		System.out.println(longestStrChain(words, prefix));

	}

}
