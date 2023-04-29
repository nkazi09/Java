
public class Product_of_Array_Except_Self_238 {

	public static int[] productExceptSelf(int[] nums) {
		int[] res = new int[nums.length];
		//int[] left = new int[nums.length];
		//int[] right = new int[nums.length];
		
		res[0] = 1;
		//left[0] = 1;
		//right[nums.length - 1] = 1;
		
		for(int i = 1; i < nums.length; i++) {
			//res[i] = res[i-1] * nums[i-1];
			//left[i] = left[i-1] * nums[i-1];
			
			res[i] = res[i-1] * nums[i-1];
			
		}
		
		int right = 1;
		
		for(int i = nums.length - 1; i >= 0; i--) {
			//res[i] = res[i] * right;
			//right = right * nums[i];
			// right[i] = right[i+1] * nums[i+1];
			res[i] = res[i] * right;
			right = right * nums[i];
		}
		
		/*
		 * for(int i = 0; i < nums.length; i++) {
		 
			res[i] = right[i] * left[i];		
		}
	 * */
	
		return res;   
	}
	
	
	public static void main(String[] args) {

		int[] arr = {1,2,3,4};
		int[] res = productExceptSelf(arr);
		for(int ar : res) {
			System.out.println(ar);	
		}		
	}

}
