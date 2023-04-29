
public class Search_in_Rotated_Sorted_Array_33 {

	//two things to consider find the point at which array has been rotate and the index val match the target
	//binary search two pointerts start and end and mid adjust 
	public static int search(int[] nums, int target) {
		int start = 0;
		int end  = nums.length - 1;
		int mid = 0;
		
		if(nums.length == 1 && nums == null) return -1;
		
		
		while(end >= start) {
			mid = start + (end - start) / 2;
			
			if(nums[mid] == target) {
				
				return mid;
				
			} else if(nums[start] < nums[mid]) {
				
				if(nums[start] <= target && nums[mid] > target) {
					
					end = mid-1;
							
				} else {
					start = mid+1;
					
				}
				
			} else { //strat > mid
				
				if(nums[start] >= target && nums[mid] > target) {
					start = mid+1;
					
				} else {
					end = mid-1;
					
				}
				
				
			}
		}
	
		
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		
		System.out.println(search(nums,target));
	}

}
