import java.util.*;

public class Asteroid_Collision_735 {
	/*
	 * Approch: Stack
	 * push positive ints into the stack check if negative remove smaller one
	 * */
	public static int[] asteroidCollision(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i : nums) {
			if(i > 0) { //is
				stack.push(i);
			} else {
				while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(i)) {
					stack.pop();
				}
				
				if(stack.isEmpty() || stack.peek() < 0) { //empty or same direction
					stack.push(i);
				} else if(i + stack.peek() == 0) { // both equal
					stack.pop();
				}
			}
			
		}
		int[] res = new int[stack.size()];
		int i = 0;
		while(!stack.isEmpty()) {
			res[i++] = stack.pop();
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,10,-5};
		int[] res = asteroidCollision(nums);
		for (int r : res) 
			System.out.println(r);
	}

}
