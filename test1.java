import java.util.*;

public class test1 {
/*
 * 
 * Non overlapping intervals -> add to the res
 * 
 * 
 * */
	
	
	public static int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> res = new ArrayList<>();
		
		int n = intervals.length;
		int i = 0;
		
		//Case: 1: non-overlapping intervals
		if(intervals[i][1] < newInterval[0]) {
			res.add(intervals[i++]);
			
		}
		//int[] merged = newInterval;
		
		//Case 2: Overlapping intervals found
		/*
		for(int[] interval : intervals) {
			if(interval[1] >= merged[0]) {
				merged[0] = Math.min(interval[0], merged[0]);
				merged[1] = Math.max(interval[1], merged[1]);
				
			}
			res.add(merged);
			
			int index = 0;
			while(intervals.length > 0) {
				res.add(interval);
				index++;
			}
		*/
		//Case 2:overlapping Interval found
        //merge it. take min or newInterval or curr interval and take max of curr or new interval  
        int[] mergedInterval = newInterval;
        while(n > i && intervals[i][0] <= newInterval[1]) {
           mergedInterval[0] = Math.min(mergedInterval[0], intervals[i][0]);
           mergedInterval[1] = Math.max(mergedInterval[1], intervals[i++][1]);
            
        }
        res.add(mergedInterval);
        
        //Case 3: if intervals still have eliments add to the result   
        while(n > i) {
            res.add(intervals[i++]);
            
        }
	
	
		
		
		
       // System.out.print(res);
        
		return res.toArray(new int[res.size()][]);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] intervals = new int[][]{{0, 30},{5, 10},{15, 20}};
		int[] merge = new int[] {1,2};
        
		
        int ans[][] = insert(intervals, merge);

        System.out.print("[");
        for (int interval[] : ans) {
          System.out.print(Arrays.toString(interval));
        }
        System.out.println("]");

	
	}

}
