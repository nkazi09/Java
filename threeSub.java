
import java.util.*;

public class threeSub {

	/*
	 * 1. Sort to detect any duplicates
	 * 2. fix one number and find other 2 by triversing the array
	 * 3. Use a hashmap ?
	 * 4. store it in a list of list
	 * */
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		
		//Step 1:
		Arrays.sort(nums);
		

		
		//Step 2: fix a number i
		//use left and right pointers
		
		for(int i = 0; i < nums.length - 2; i++) {
			//check for duplicate
			if( i == 0 || i > 0 && nums[i] != nums[i-1]) {
				int left = i+1; //start at one over
				int right = nums.length - 1;
				int sum = 0 - nums[i]; //sum the fixed value i
				
				//find two other value sums updto zero
				while(right > left) {
					if(nums[left] + nums[right] == sum) {
						res.add(Arrays.asList(nums[left], nums[right], nums[i]));
						
						
						//if left has duplicate
						while(right > left && nums[left] == nums[left + 1]) {
							left++;
						}
						
						//if right has duplicate
						while(right > left && nums[right] == nums[right - 1]) {
							right--;
						}
						
						//otherwise keep pointers moving
						left++;
						right--;
					
					
						//otherwise sum is too smaller or bigger
					} else if(nums[left] + nums[right] < sum) {
						left++;
					
					
					} else {
						right--;
					}
				}
			}
		}
		
		return res; 
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
		
		System.out.println(threeSum(nums));


	}
}
