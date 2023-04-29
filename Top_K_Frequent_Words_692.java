import java.util.*;

public class Top_K_Frequent_Words_692 {
	//approch Map + Priority Queue
	public static List<String> topKFrequent(String[] words, int k) {
		 List<String> result = new ArrayList<>();
	        Map<String, Integer> map = new HashMap<>();
	        for(int i=0; i<words.length; i++)
	        {
	            //only update the value if the word is in the map
	            if(map.containsKey(words[i]))
	                map.put(words[i], map.get(words[i])+1);
	            else
	                //first time adding the eliment
	                map.put(words[i], 1);
	        }
	        //sort them by freq high to low
	        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
	                 (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue());
	        
	        for(Map.Entry<String, Integer> entry: map.entrySet())
	        {
	            pq.offer(entry);
	            if(pq.size()>k)
	                pq.poll();
	        }

	        while(!pq.isEmpty())
	            result.add(0, pq.poll().getKey());
	        
	        return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"i","love","leetcode","i","love","coding"};
		int k = 2;
		System.out.println(topKFrequent(words, k));
	}

}
