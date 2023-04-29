import java.util.*;

public class Reverse_Integer_7 {

    public static int reverse(int x) {
    	boolean negative = false;
    	long reverse = 0;
    	
    	if(x < 0) {
    		x *= -1;
    		negative = true;
    	}
    	
    	
    	while(x > 0) {
    		
    		reverse = 10 * reverse + x % 10;
    		x /= 10;
    		
    		
    		if(reverse  > Integer.MAX_VALUE) {
    			return 0;
    		} 
    	}
    	
    	return negative ? (int) (-1 * reverse) : (int)reverse;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 123;
		System.out.println(reverse(x));
	}

}
