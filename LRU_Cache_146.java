import java.util.*; 

public class LRU_Cache_146 {
	class Node {
		int val;
		int key;
		Node next;
		Node prev;
		
		public Node(int key, int value) {
			key = key;
			val = value;
		}
	}
	private int capacity;
	private Map<Integer, Node> map;
	private Node head;
	private Node tail;
	
	public LRU_Cache_146(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<>(0, 0);
		head.next = tail;
		tail.prev = head;
		
	}
	//remove from front and add to the end of linkedlist
	public int get(int key) {
		if(map.containsKey(key)) {
			Node node = map.get(key);
			remove(node);
			add(node);
			return node.val;
		} else {
			 return -1;
		}
		
		
	}
	
	public void put(int key, int val) {
		if(map.containsKey(key)) {
			remove(map.get(key));
		}
		//check capacity
		if(capacity == map.size()) {
			remove(tail.prev); 
		}
		add(new Node(key, val));
	}
	
	public void remove(Node node) {
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
	
	public void add(Node node) {
		map.put(node.key, node);
		Node next_head = head.next;
		head.next = node;
		node.prev = head;
		next_head.prev = node;
		node.next = next_head;
		
		
	}
	/*
	
	private int capacity; 
	private Node head = new Node(0 ,0);
	private Node tail = new Node(0 ,0);
	private Map<Integer, Node> cache = new HashMap<>();
	
	public class Node {
		Node prev;
		Node next;
		int value;
		int key;
		
		public Node(int key, int value) {
			this.key = key;
			this.value = value;
			
		}
	
	}
	
	public LRU_Cache_146(int capacity) {
		this.capacity = capacity;
		head.next = tail;
		tail.prev = head;
		
	}
	
	public int get(int key) {
		if(cache.containsKey(key)) {
			remove(cache.get(key));
			add(cache.get(key));
			return cache.get(key).value;
		}
		
		
		return -1;
	}
	
	public void put(int key, int value) {
		if(cache.containsKey(key)) {
			remove(cache.get(key));
		}
		if(capacity == cache.size()) {
			remove(tail.prev);
		}
		//add a new node
		add(new Node(key, value));
	}
	
	public void add(Node node) {
		cache.put(node.key, node);
		Node next_head = head.next;
		head.next = node;
		node.prev = head;
		next_head.prev = node;
		node.next = next_head;
		
		
		
	}
	
	public void remove(Node node) {
		cache.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
		
	}
	
	*/
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
