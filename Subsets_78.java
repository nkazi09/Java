import java.util.*;

public class Subsets_78 {
	
	//Backtrack
	public static List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> res = new ArrayList<>();
		
		backtrack(nums, res, 0, new ArrayList<>());
		
		return res;
		
	} 
	
	public static void backtrack(int[] nums, List<List<Integer>> res, int index, List<Integer> subset) {
		res.add(new ArrayList<>(subset));
		
		for(int i = index; i < nums.length; i++) {
			//always add the first number
			subset.add(nums[i]);
			
			//pick or not pick the number 
			backtrack(nums, res, i+1, subset);
			subset.remove(subset.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		
		System.out.println(subsets(nums));
	}

}
