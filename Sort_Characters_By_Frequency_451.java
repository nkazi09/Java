import java.util.*;

public class Sort_Characters_By_Frequency_451 {
	
	//use PriorityQueue 
	public static String frequencySort(String s) {
		if(s.length() == 0 || s == null) return s;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		//put the most frequent eliments first
		PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		pq.addAll(map.keySet());

		StringBuilder sb = new StringBuilder();
		
		while(!pq.isEmpty()) {
			char curr = pq.remove();
			
			for(int i = 0; i < map.get(curr); i++) {
				
				sb.append(curr);
			}
			
		}
		
		return sb.toString();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tree";
		System.out.println(frequencySort(s));
	}

}
