import java.util.*;

public class Subarray_Sum_Equals_K_560 {
	
    public static int subarraySum(int[] nums, int k) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int count = 0;
    	int currSum = 0;
    	
    	if(nums.length == 0) return 0;
    	
    	//take total sum exist in the array
    	for(int num : nums) {
    		currSum += num;
    	}
    	
    	//keep counting subarray equals k
    	if(currSum == k) {
    		count++;
    	}
    	
    	if(map.containsKey(currSum - k)) {
    		count += map.get(currSum - k);
    	}
    	map.put(currSum, map.getOrDefault(currSum, 0) + 1);
    	
    	
    	return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1}; 
		int k = 2;
		System.out.println(subarraySum(nums, k));

	}

}
