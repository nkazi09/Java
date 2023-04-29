import java.util.*;

public class Move_Zeroes_283 {
	public static void moveZeroes(int[] nums) {
		int index = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
		
		for(int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		
		
	}

}
