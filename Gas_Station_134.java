
public class Gas_Station_134 {

	/*
	 * gas = [1,2,3,4,5], 
	 * cost = [3,4,5,1,2]
	 *  to start postion gas[i] >= cost[i] 
	 * keep a delta where we keep track of gas[i] - cost[i] > cost[i+1]
	 * if delta is negatieve we reset the start position
	 * */
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		
		int startDelta = 0;
		int currDelta = 0;
		int totalDelta = 0;
		
		for(int i = 0; i < gas.length; i++) {
			currDelta += gas[i] - cost[i];
			totalDelta += gas[i] - cost[i];
			
			if(currDelta < 0) {
				currDelta = 0;
				startDelta = i+1;
			}
			
		}
		
		return currDelta < 0 ? -1 : startDelta;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
	
		System.out.println(canCompleteCircuit(gas, cost));
	}

}
