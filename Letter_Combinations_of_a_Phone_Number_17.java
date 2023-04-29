import java.util.*;
public class Letter_Combinations_of_a_Phone_Number_17 {
	
	public static List<String> letterCombinations(String s) {
		List<String> res = new ArrayList<>();
		
		String[] mapping = {
				"0",
				"1",
				"abc",
				"def",
				"ghi",
				"jkl",
				"mno",
				"pqrs",
				"tuv",
				"wxyz"
				
		};
		
		letterCombRecursive(s, res, mapping, 0, "");
		
		return res;
	}
	
	
	public static void letterCombRecursive(String digits, List<String> res, String[] mapping, int index, String curr) {
		if(digits.length() == index) {
			res.add(curr);
			return;
		}
		
		String letter = mapping[digits.charAt(index) - '0'];
		for(int i = 0; i < letter.length(); i++) {
			letterCombRecursive(digits, res, mapping, index + 1, curr + letter.charAt(i));
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "23";
		System.out.println(letterCombinations(digits));
	}

}
