import java.util.*;

public class Container_With_Most_Water_11 {

	//compute the max area till now
	public static int maxArea(int[] height) {
		int maxArea = Integer.MIN_VALUE;
		int start = 0;
		int end = height.length - 1;
		
		while(end > start) {
			
			int min = Math.min(height[start], height[end]); // height
			maxArea = Math.max(maxArea, min * (end - start)); //width can be foind end - start
		
		//find the taller height
			if(height[end] > height[start]) {
				start++;
				
			} else {
				
				end--;
			}
		}
		
		 return maxArea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
	
		System.out.println(maxArea(height));
	}

}
