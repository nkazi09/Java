import java.util.*;
public class Sort_Color_75 {
	//Do it in place - using two pointers
	//sort 0 and 2 and 1 will automatically fall imto place
	//so put all 0's in ith place and 2 into end of the nums.length -1
	
	public static void sortColors(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		int index = 0;
		
		
		while(end >= index && end > start) {
			if(nums[index] == 0) {
				nums[index] = nums[start];
				nums[start] = 0;
				start++;
				index++;
				
			} else if(nums[index] == 2) {
				nums[index] = nums[end];
				nums[end] = 2;
				end--;
				index++;
				
			} else {
				
				index++;
			
			}
			
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{2,0,2,1,1,0};
		
		System.out.println(sortColors(nums));
	}

}
