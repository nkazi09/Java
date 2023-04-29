import java.util.*;

public class Maximum_Value_at_a_Given_Index_in_a_Bounded_Array_1802 {
	/*
	 * n = 4, index = 2 and maxSize = 6 output: 2
	 * maximize nums[index] given
	 * find the array where we can have the max
	 * eliments are ateast value 1
	 * Binary searcj
	 * */
	public static int maxValue(int n, int index, int maxSum) {
		
		  maxSum -= n;
	        int left = 0, right = maxSum, mid;
	        
	        while (left < right) {
	            mid = (left + right + 1) / 2;
	            if (getSum(n, index, mid) <= maxSum)
	                left = mid;
	            else
	                right = mid - 1;
	        }
	        return left + 1;
	    }
	    
	    private long getSum(int n, int index, int a) {
	        int b = Math.max(a - index, 0); //on the left
	        long res = (long)(a + b) * (a - b + 1) / 2;
	        b = Math.max(a - ((n - 1) - index), 0); //on the right
	        res += (long)(a + b) * (a - b + 1) / 2;
	        return res - a;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
