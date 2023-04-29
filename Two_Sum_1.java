import java.util.*;

public class Two_Sum_1 {
	public static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> visited = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			visited.put(nums[i], i);
		}
		
		for(int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
		
			if(visited.containsKey(diff) && visited.get(diff) != i) {
				return new int[] {i, visited.get(diff)};
			}
		}
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15}; int target = 9;
		int[] res = twoSum(nums, target);
		for(int r : res) {
			System.out.print(r);
		}

	}

}
