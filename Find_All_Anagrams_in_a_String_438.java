import java.util.*;

public class Find_All_Anagrams_in_a_String_438 {

	//create two int arrays sCount and pCount
	//keep moving sliding window for sCount and compare substring
	//if substring count match the pCount we add to res
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> res = new ArrayList<>();
		
		int[] sCount = new int[26];
		int[] pCount = new int[26];
		
		//base
		if(p.length() == 0 || p == null) {
			return res;
		}
		
		for(int i = 0; i < p.length(); i++) {
			pCount[p.charAt(i) - 'a']++;		
		}
		
		for(int i = 0; i < s.length(); i++) {
			sCount[s.charAt(i) - 'a']++;
		
			if(i >= p.length()) {
				sCount[s.charAt(i - p.length()) - 'a']--;
			}
			//check if two arrays are equal
			if(Arrays.equals(sCount, pCount)) {
				res.add(i - p.length() + 1);
			}
		
		}
		
	
		return res;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abab"; 
		String p = "ab";
		
		System.out.println(findAnagrams(s, p));
	}

}
