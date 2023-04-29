import java.util.*;
public class Daily_Temperatures_739 {
	/*
	 * Input: temperatures = [73,74,75,71,69,72,76,73]
	 * Output: [1,1,4,2,1,1,0,0]
	 * 
	 * Stack stores the indexes
	 * */
	
	public static int[] dailyTemperatures(int[] temp) {
		Stack<Integer> stack = new Stack<>();
		int[] res = new int[temp.length];
		
		for(int i = 0; i < temp.length; i++) {
			//compare the index and not the temp
			while(!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
				int index = stack.pop();
			
				res[index] = i - index;
			}
			stack.push(i); //push the indexes
			
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temps = {30, 40, 50, 60};
		System.out.println(Arrays.toString(dailyTemperatures(temps)));

	}

}
