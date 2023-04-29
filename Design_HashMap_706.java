import java.util.*;

public class Design_HashMap_706 {
	/*
	Questions to ask:
	- what are the apis you need? example remove, put, get methods etc
	For simplicity, are the keys integers only? whats the data type
	Can we assume inputs are valid or do we have to validate them?
	- is there a range?
	- can i use a differ set? like a TreeSet?

	When we insert the pair (10, 20) and then (10, 30), there is technically no collision involved. We are just replacing the old value with the new value for a given key 10, since in both cases, 10 is equal to 10 and also the hash code for 10 is always 10.
	Collision happens when multiple keys hash to the same bucket. In that case, we need to make sure that we can distinguish between those keys. Chaining collision resolution is one of those techniques which is used for this.

	Algorithm: Array 
	- Create array of size 1000001
	- Adding number n is setting arr[key] = value 
	- removing number n is frssing arr[key] = -1
	- contains a number n is return arr[key]

	Time complexity: O(1) - for all get(),put() and remove() methods.
	Space complexity: O(n) - where n is the maximum possible value for the key.
	*/
	
	static int[] map;
    public Design_HashMap_706() {
    	map = new int[1000001];
    	Arrays.fill(map, -1);
    }
	
    public static void put(int key, int value) {
    	map[key] = value;
    }
    
    public static int get(int key) {
    	return map[key];
    }
	
    
    public static void remove(int key) {
    	map[key] = -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
