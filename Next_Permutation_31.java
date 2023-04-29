import java.util.*;
public class Next_Permutation_31 {
	// Obervation: the number starts changes as we see from right to left. if we see increase in number we change and swap with one on right
	public static void nextPermutation(int[] nums) {
		
		int i = nums.length - 2;
		
		//step 1: find the first decresing sequence from right to left
		while(i >= 0 && nums[i+1] <= nums[i]) {
			i--; ////keep decrementing untill found decrease sequence
		}
		
		//Step2: found decrese sequence
		if(i >= 0) {
			int j = nums.length - 1;
		
			while(nums[j] <= nums[i]) {
				j--;
			}
			swap(nums, i, j);
			
		}
		//Step3: reverse the remaining array
		reverse(nums, i+1);
	}
	
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}
	public static void reverse(int[] nums, int start) {
		int i = start;
		int j = nums.length - 1;
		
		while(j > i) {
			swap(nums, i, j);
			i++;
			j--;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
	}

}
