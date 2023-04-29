import java.util.*;
public class Copy_List_with_Random_Pointer_138 {

	public class Node {
		Node next;
		Node random;
		int val;
		
		public Node() {}
		
		public Node(int val) {
			this.val = val;
		}
		public Node(int val, Node next, Node random) {
			this.val = val;
			this.next = next;
			this.random = random;
		}	
	}
	
	/*
	 * Create a hashMap to hold old node and new node
	 * iterate over the list and assgn next and random pointers
	 * 
	 */
	public static Node copy(Node root) {
		HashMap<Node, Node> visited = new HashMap<>();
		
		if(root == null) return null;
		
		//return the visited node if it has been processed already
		if(visited.containsKey(root)) {
			return visited.get(root);
		}
		
		//Create a new node with old and new val
		Node node = new Node(root.val, null);
		//Save the values in the hashmap
		visited.put(root, node); //put old and new nodes in the map
		
		//now recursievely add the next and random pointers
		node.next = copy(root.next);
		node.random = copy(root.random);
		
		return node;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
