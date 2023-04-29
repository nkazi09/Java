import java.util.*;

public class Merge_Intervals_56 {
	//in order to find overlapping intervals sort them first
	public static int[][] mergeInterval(int[][] intervals) {
		
		if(intervals.length == 0 || intervals == null) return intervals;
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		List<int[]> merged = new ArrayList<>();
		int[] curr = intervals[0];
		merged.add(curr);

		
		for(int[] interval : intervals) {
			int currStart = curr[0];
			int currEnd = curr[1];
			int nextStart = interval[0];
			int nextEnd = interval[1];
			
		
			
			if(nextStart <= currEnd) {
				 curr[1] = Math.max(nextEnd, currEnd);
			} else {
				curr = interval; 
				merged.add(curr);
			}
			
			
		}
		return merged.toArray(new int[merged.size()][]);
	
	} 
	
	public static void main(String[] args) {
		int[][] intervals = new int[][]{{1,3}, {2,6}, {8,10}, {15,18}};
		
		int[][] res = mergeInterval(intervals);
		
		for(int[] re : res) {
			System.out.println(Arrays.toString(re));
		}
	}

}
