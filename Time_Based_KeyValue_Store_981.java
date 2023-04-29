import java.util.*;

public class Time_Based_KeyValue_Store_981 {
//	public static class TreeMap {
//		String val;
//		int time;
//		
//		public TreeMap(int time, String val) {
//			val = val;
//			time = time;
//		}
		
//	}

	
	public class TimeStamp {

		
		//Use hashMap for keys and to store the values use list
		//create a class of Type data
		 static Map<String, TreeMap<Integer, String>> map;
		
		public TimeStamp() {
			 map = new HashMap<>();
			
		}
		public static void set(String key, String value, int timestamp) {
			if(!map.containsKey(key)) {
				map.put(key, new TreeMap<>());
			}
			//the key exist
			map.get(key).put(timestamp, value);			
			
		} 
		
		public static String get(String key, int timestamp) {
			TreeMap<Integer, String> treemap = map.get(key);
			if(treemap == null) {
				return "";
			}
			//value close to the given key can be obtaind by floorKey method
			Integer floor = treemap.floorKey(timestamp);
			
			if(floor == null) {
				return "";
			}
			
			return treemap.get(floor);
		}   
		
		
		
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
