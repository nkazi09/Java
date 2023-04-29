import java.util.*;

public class Design_a_Stack_With_Increment_Operation_1381 {
	
	//Insert, search O(n)
	public static CustomStack {
		static int size;
		static int[] inc;
		static int index;
		
		//constructor
		public static CustomStack(int maxSize) {
			size = maxSize;
			inc = new int[size];
			index = 0;
		}
		
		
		public static void push(int x) {
			 if(size > index) {
				 inc[index++] = x;
			 }
			
		}
		
		public static int pop() {
			//remove the top
			if(index == 0) return -1;
			return inc[--index];
		}
		
		//increment bottom/last eliments
		public static void inc(int k, int val) {
			if(inc.length == 0) return;
			//bottom eliments are at the top of the stack or array so update first k eliments
			for(int i = 0; i < k && i < inc.length; i++) {
				inc[i] = inc[i] + val;
			}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	}
}
