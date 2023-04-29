import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_Interval_57 {
/*
Non overlapping intervals -> add to the res Input: intervals = [[1,3],[6,9]], newInterval = [2,5] Output: [[1,5],[6,9]]
                         |  |
 
 - found some gaps insert a interval

Approch: List<int[]> and variable index++
two cases:
    1. overlapping tervals found remover overlapping
    2. no overlap interval - go ahead and add the intervals
    3. check if there still eliments in teh intervals and add it to the result
  
 
 Time: O(n)
 Space: O(n)
*/
	
	
	public static int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> res = new ArrayList<>();
	    
	    int[] merged = newInterval;
	    
	     for(int[] interval:intervals){
	        //Case: 1: non-overlapping intervals
	         if(merged[1] < interval[0]){
	            
	            res.add(merged);
	            merged = interval;
	        }else if(interval[1] < merged[0]){
	            res.add(interval);
	        }else{
	            //Case 2: Overlapping intervals found
	            merged[0] = Math.min(merged[0], interval[0]);
	            merged[1] = Math.max(merged[1], interval[1]);
	        }
	    }
	    
	    res.add(merged);

	    return res.toArray(new int[res.size()][2]);
	    
	}
	
	

	
	
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//int[][] intervals = new int[][]{{0, 30},{5, 10},{15, 20}};
	
	
		int[][] intervals = new int[][]{{1, 3},{6, 9}};
	
		int[] merge = new int[] {2,5};

		
        int ans[][] = insert(intervals, merge);

        System.out.print("[");
        for (int interval[] : ans) {
          System.out.print(Arrays.toString(interval));
        }
        System.out.println("]");

	}

}
