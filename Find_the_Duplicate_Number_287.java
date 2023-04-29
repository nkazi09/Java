import java.util.*;
public class Find_the_Duplicate_Number_287 {
	
	//floyeds cycle detection
	public static int findDuplicate(int[] nums) {
		
		int slow = nums[0];
		int fast = nums[nums[0]];
		
		
		while(slow != fast) {
			slow = nums[slow];
			fast = nums[nums[fast]]; //moves 2 steps
			
		}
		
		//after they meet set fast to 0
		fast = 0;
		
		while(slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		
		return fast;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}

}
