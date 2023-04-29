import java.util.*;

public class meeting_rooms_253 {

	public static int metting_rooms_Two(int[][] intervals) {
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], a[0]));
		PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> Integer.compare(a[1], b[1]));
		for(int[] interval : intervals) {
			//if no - overlaps: we can reuse the meeting rooms 
			if(queue.size() == 0 || interval[0] < queue.peek()[1]) {
					queue.add(interval);
			} else { //overlaps need another interval
				int[] earliest = queue.remove();
				queue.add(interval);
			}
			
		}
		return queue.size();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{0,30},{5,10},{15,20}};
		System.out.println(metting_rooms_Two(intervals));
	}

}
