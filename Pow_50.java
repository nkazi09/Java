import java.util.*;
public class Pow_50 {

	/* Approch: Divide and Concure 
	 * split the value in half and multiply
	 * Time: O(logn)
	 * Space: O(logn)
	 */	
	public static double myPow(double x, int n) {
		return helper(x, n);
		
	}
	
	public static double helper(double x, long n) {
		//Case 1: base case n == 0
		if(n == 0) return 1;
		
		//Case 2: n == 1
		if(n == 1) return x;
		
		//Case 3: when n < 0 is negative
		if(n < 0) {
			helper(1/x, -n);
		}
		
		//Case 4: when n is even or n is odd length
		double res = helper(x * x, n/2);
		
		//Case 5: when n is even or odd
		return n % 2 == 0 ? res : res * x;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2.00000;
		int n = 10;
		System.out.println(myPow(x, n));
		
		
	}

}
