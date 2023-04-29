import java.util.*;

public class FindAllPalandromeSubstringWorkday {
	public static List<String> findAllPalindromeSubs(String s) {
		List<String> result = new ArrayList<>();
	      int n = s.length();

	      // Check for substrings of odd length
	      for (int i = 0; i < n; i++) {
	         int left = i, right = i;
	         while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
	            result.add(s.substring(left, right + 1));
	            left--;
	            right++;
	         }
	      }

	      // Check for substrings of even length
	      for (int i = 0; i < n - 1; i++) {
	         int left = i, right = i + 1;
	         while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
	            result.add(s.substring(left, right + 1));
	            left--;
	            right++;
	         }
	      }

	      return result;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "abacdfgdcaba";
	      System.out.println(findAllPalindromeSubs(s));
	}

}
