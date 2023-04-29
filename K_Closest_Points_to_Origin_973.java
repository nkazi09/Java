import java.util.*;

public class K_Closest_Points_to_Origin_973 {
	//use a max heap store the k most eliments in the queue and store in the array and return that
	//remove from root when the heap gets greater than k
	
	public static int[][] kClosestPoints(int[][] points, int k) {
		
		//result array is lengtj of k and 2
		int[][] result = new int[k][2];
		
		//store them based on closest points
		PriorityQueue<int[]> queue = new PriorityQueue<>((p1, p2) -> (p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] + p1[1] * p1[1]));
		
		//keep adding to the queue 
		for(int[] point : points) {
			queue.add(point);
		
			//remove anything above k
			if(queue.size() > k) {
				queue.remove();
			}
		}
		
		//k things 2 eliments
		while(k > 0) {
			result[--k] = queue.remove();
		}
		return result;	
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 2;
		int[][] points = new int[][] {
			{3,3},{5,-1},{-2,4}};
			
		int[][] res = kClosestPoints(points, k);
			for(int[] re : res) {
				System.out.println(Arrays.toString(re));
			}
	}

}
