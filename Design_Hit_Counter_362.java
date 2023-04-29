import java.util.*;

public class Design_Hit_Counter_362 {
	
	public class HitCounter {
		 static Queue<Integer> hits;
		
		public  HitCounter() {
			hits = new LinkedList<>();
			
		}
		
		public static void hit(int timestamp) {
			hits.add(timestamp);
		}
		
		public static int getHits(int timestamp) {
			while(!hits.isEmpty()) {
				if(timestamp - hits.peek() >= 300) {
					return hits.remove();
				} else {
					break;
				}
				
			}
			return hits.size(); 
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	} 

}
