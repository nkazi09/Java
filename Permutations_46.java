import java.util.*;

public class Permutations_46 {
 
	//recursion that will return the all possible combination
	//use a boolean array to remember which combinations has already been taken
	
	
	public static List<List<Integer>> permutation(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		boolean[] freq = new boolean[nums.length];
		recursion(list, new ArrayList<>(), nums, freq);
		
		return list;
	}
	
	public static void recursion(List<List<Integer>> list, List<Integer> curr, int[] nums, boolean[] freq) {
		if(curr.size() == nums.length) { //found all purmutations
			list.add(new ArrayList<>(curr));
			return;
			
		} else {
		
			for(int i = 0; i < nums.length; i++) {
				if(!freq[i]) {
					freq[i] = true;
					curr.add(nums[i]);
					recursion(list, curr, nums, freq);
					curr.remove(curr.size() - 1);
					freq[i] = false;
			
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		List<List<Integer>> res = permutation(nums);
		for(int i = 0; i < res.size(); i++) {
			System.out.print("(");
			for(int j = 0; j < res.get(i).size(); j++) {
				System.out.print(res.get(i).get(j) + " ");
				
			}
			System.out.print(")");
			
		}
 
		
	}

}
