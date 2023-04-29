import java.util.*;

public class Partition_Equal_Subset_Sum_416 {
/*
 * Approch 1: Recursion + HashMap
 * 1. check if the total sub is even or odd 
 * 2. if odd return false
 * 3. if even compute all possible subset using recursion
 * 
 * */
	
	
	
	
	 
	public static boolean subSetSum(int[] nums) {
		int sum = 0;
		
		//compute the sum
		for(int num : nums) {
			sum += num;
		}
		
		if(sum % 2 == 1) return false;
		
		//we are at even number now we need to try simulate even number of subset
		
		//try to form subset using sum/2. if we can form that this means we can form the subsets
		return helperRecursion(nums, sum, 0, 0, new HashMap<String, Boolean>());
	}
	
	public static boolean helperRecursion(int[] nums, int sum, int curr, int index, HashMap<String, Boolean> state) {
		String currState = index + "" + sum; 
		
		if(state.containsKey(currState)) {
			return state.get(currState);
		}
		
		//base case : two different subset sum up to the total sum 
		//current sum
		if(curr * 2 == sum) {
			return true;
		}
		
		//stop recursing 
		if(curr > sum / 2 || index >= nums.length) {
			return false;
		}
		//recusive call will take the number or not take the number in the sum
		boolean found = helperRecursion(nums, sum, curr, index+1, state) || helperRecursion(nums, sum, curr + nums[index], index+1, state);
		
		return found;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,5};
		System.out.println(subSetSum(nums));
		
	}

}
