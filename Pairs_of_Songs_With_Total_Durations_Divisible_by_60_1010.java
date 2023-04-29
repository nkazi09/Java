import java.util.*;
public class Pairs_of_Songs_With_Total_Durations_Divisible_by_60_1010 {
	
    public static int numPairsDivisibleBy60(int[] time) {
    	
    	/*time = [30,20,150,100,40] how many pairs are there that divisible by 60
    	 *        
    	 * Use a map to keep track of the remainder and frequency of each ints
    	 * keep a count increment as we do that
    	 * Time: O(N)
    	 * Space: O(1) cuz the size of map ramainder is fixed 60
    	 * 
    	 * */
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	int count = 0;
    	
    	for(int t : time) {
    		int remainder = t % 60;
    		
    		if(remainder == 0) { //when it equals 0 store 60 isntead
    			//to keep the value positive
    			count += map.getOrDefault(0, 0);
    		} else { //otherwise store remainder instead
    			count += map.getOrDefault(60 - remainder, 0);
    		}
    		
    		
    		map.put(remainder, map.getOrDefault(remainder, 0) + 1);
    	}
    	
    	return count;
    	/*
    	int count = 0;
    	
    	if(time == null || time.length == 0) return count;
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i < time.length; i++) {
    		
    		int remainder = time[i] % 60;
    		
    		count += map.getOrDefault((60 - remainder) % 60, 0);
    		map.put(remainder, map.getOrDefault(remainder, 0) + 1);
    	}
    	
    	return count;
    
    */
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] time = {30,20,150,100,40};
		
		System.out.println(numPairsDivisibleBy60(time));
		
	}

}
