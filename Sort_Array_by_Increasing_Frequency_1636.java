import java.util.*;

public class Sort_Array_by_Increasing_Frequency_1636 {
	public static int[] frequencySort(int[] nums) {
		if(nums.length == 0 || nums == null) return nums;

        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        //Store the min on top
        //if they have e same freqiency then put the smaller one first
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b));
        pq.addAll(map.keySet());
        
        //add to map values to pq  
        int[] res = new int[nums.length];
        int idx = 0;
        while(!pq.isEmpty()) {
            int curr = pq.remove();
            for(int i = 0; i < map.get(curr); i++) {
                res[idx++] = curr;
            }   
            
        }
        return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,2,3};
		int[] res = frequencySort(nums); 
		
		for(int r : res){
			System.out.println(r);
			
		}
	}

}
