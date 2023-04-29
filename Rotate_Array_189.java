import java.util.*;

public class Rotate_Array_189 {

	
	public static void rotate(int[] nums, int k) {
		//roverse all eliments
		//reverse first k numbers
		//reverse last eliments after k
		
		k = k % nums.length; //nums to reverse
		
		// Step1 entire array
		reverse(nums, 0, nums.length - 1);
		
		//Step2: reverse first k eliments
		reverse(nums, 0, k - 1);
		
		//step3: reverse eliments aftre k
		reverse(nums, k, nums.length - 1);
		
		
	}
	
	public static void reverse(int[] nums, int start, int end) {
		while(end > start) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
			
		}
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		
		System.out.print(rotate(nums, k));
	}

}
