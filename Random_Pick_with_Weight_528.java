import java.util.*;

public class Random_Pick_with_Weight_528 {
	private static int[] w_cum;
	private static int sum;
	
	public Random_Pick_with_Weight_528(int[] w) {
		sum = 0;
		w_cum = new int[w.length];
		for(int i; i < w.length; i++) {
			w_cum += w[i];
			this.w_cum[i] = w_cum;
		}
		this.sum = w_cum;
	}
	
	public static int[] randomPicks(int[] w) {
		int idx = ((int)Math.random() * sum); //lie betweel 0 to sum - 1
		return binarySearch(idx + 1);
	}
	
	public static int binarySearch(int idx) {
		
		int left = 0;
		int right = w_cum.length - 1;
		
		while(right > left) {
			
			int mid = left + (right - left)/2;
		
			if(w_cum[mid] < idx) { //shift right
				left = mid+1
			} else {
				right = mid;
			}
		}
		return left;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
