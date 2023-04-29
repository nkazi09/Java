import java.util.*;
public class Break_a_Palindrome_1328 {
	
    public static String breakPalindrome(String palindromeStr) {
    	
    	 char[] arr = palindromeStr.toCharArray();
         int len = arr.length;

         // Reading characters from left to right until a character that is not "a" is found
         // Changing that character to "a" breaks the palindrome while being lexicographically lowest
         // Only half of the string needs to be checked since the input string is always a palindrome
         for (int i = 0; i < len / 2; i++) {
             if (arr[i] != 'a') {
                 arr[i] = 'a';
                 return String.valueOf(arr);
             }
         }
         
         // If palindrome consists only of "a", or input  of a single character then the string below is returned
         return "IMPOSSIBLE";
        
     }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bb";
		System.out.println(breakPalindrome(s));

	}

}
