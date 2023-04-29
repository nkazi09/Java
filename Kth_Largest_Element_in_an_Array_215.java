import java.util.*;

public class Kth_Largest_Element_in_an_Array_215 {

	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		//store to the minHeap
		for(int num : nums) {
			minHeap.add(num);
			
			if(minHeap.size() > k) {
				minHeap.remove();
			}
		}
		return minHeap.remove();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,1,5,6,4}; 
		int k = 2;
		
		System.out.println(findKthLargest(nums, k));
	}

}
