import java.util.*;

public class Group_Anagrams_49 {
	
	public static List<List<String>> anagram(String[] strs) {
		
		List<List<String>> res = new ArrayList<>();
		Map<String, List<String>> group = new HashMap<>();

		//go through each words sort and and compare if they are the same     
		for(String str : strs) {
			char[] word = str.toCharArray();
			Arrays.sort(word);
			//convert back to string
			String sorted = new String(word);
			
			
			if(!group.containsKey(sorted)) {
				group.put(sorted, new ArrayList<>());
				
			}
			group.get(sorted).add(str);
			
		}
		res.addAll(group.values());
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(anagram(strs));
	}

}
