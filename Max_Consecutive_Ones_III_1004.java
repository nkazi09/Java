import java.util.*;

public class Max_Consecutive_Ones_III_1004 {
	public static int longestOnes(int[] nums, int k) {
		/*
		 * Approch: sliding window approch 
		 * Find the longest subarray with at most K zeros.

		 * */
		
		int i = 0; //i is the pointer that goest the furthest
		int j = 0; //keeps track of the beganing of the sliding window
		
		while(nums.length > i) {
			if(nums[i] == 0) { 
				k--;
			}
			
			//keep decrementing k when you see k = 2 but there are 3 zeros
			if(k < 0) { //increment j
			
				if(nums[j] == 0) { //when the sliding window has k zeros
					k++; //compute the new sliding window
				} 
				j++; //this is the end of the sliding window
			}
			
			i++;
		}
		
		return i-j;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		
		System.out.println(longestOnes(nums, k));
	}

}
