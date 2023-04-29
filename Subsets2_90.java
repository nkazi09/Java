import java.util.*;

public class Subsets2_90 {
	
	public static List<List<Integer>> Subsets2(int[] nums) {
		/*
		Idea is to generate all possible subset.taking a number or not taking a number. similar to permutation 
	
		Approch: Resursion/backtracking + sort
		1. index variable to keep track of the end of our numbers 
		2. sort the array
	
		Time: O(n * 2^n) 2^n cuz in every itteration we make a choice to take or not take an int
		Space: O(n)
		*/ 
	        List<List<Integer>> res = new ArrayList<>();
	        
	        Arrays.sort(nums);
	       
	        backtracking(nums, res, new ArrayList<>(), 0);
	        
        return res;
	}

	public static void backtracking(int[] nums, List<List<Integer>> res, List<Integer> subset, int start) {
	    res.add(new ArrayList<>(subset));
	    
	    for(int i = start; i < nums.length; i++) {
	        if(i > start && nums[i] == nums[i-1]) continue;
	        
	        subset.add(nums[i]); //add the first eliment
	    
	    //backtrack and pick and not pick values
	    backtracking(nums, res, subset, i+1);
	    
	    subset.remove(subset.size() - 1);
	 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,2};
		
		System.out.println(Subsets2(nums));
	

	}

}
