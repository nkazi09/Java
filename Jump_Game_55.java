import java.util.*;

public class Jump_Game_55 {
	 public static boolean canJump(int[] nums) {
		 if(nums.length == 0 || nums == null) return true;
		 int last = nums.length - 1;
		 
		 for(int i = nums.length - 1; i >= 0; i --) {
			 if(i + nums[i] >= last) {
				 last = i;
			 }
			 
		 }
		 
		 return last == 0; //if index reach 0 will retun true
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,1,0,4};
		System.out.println(canJump(nums));
	}

}
