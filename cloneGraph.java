
import java.util.*;

 class Node {
	
	public int val;
	public List<Node> neighbors;
	
	
	public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
	
	
 	}


public class cloneGraph {
	
	
	public static Node cloneGraph(Node node) {
		HashMap<Node, Node> visited = new HashMap<>();
		if(node == null) return node;
		
		if(visited.containsKey(node)) {
			
			return visited.get(node);
		}
		Node cloneNode = new Node(node.val, new ArrayList<>());
				
		for(Node neighbor : node.neighbors) {
			//DFS
			cloneNode.neighbors.add(cloneGraph(neighbor));
		}
		return cloneNode;
	}
	
	public static Node buildGraph() {
		/*
		 Note : All the edges are Undirected
		    Given Graph:
		    1--2
		    |  |
		    4--3 
		 */
		Node node1 = new Node(1, null);
		Node node2 = new Node(2, null);
		Node node3 = new Node(3, null);
		Node node4 = new Node(4, null);
		List<Node> v = new ArrayList<Node>();
		v.add(node2);
		v.add(node4);
		node1.neighbors = v;
		v = new ArrayList<Node>();
		v.add(node1);
		v.add(node3);
		node2.neighbors = v;
		v = new ArrayList<Node>();
		v.add(node2);
		v.add(node4);
		node3.neighbors = v;
		v = new ArrayList<Node>();
		v.add(node3);
		v.add(node1);
		node4.neighbors = v;
		
		return node1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Node graph = new Node(0, null);
	//	Node source = graph.buildGraph();
	//	System.out.println(cloneGraph(source));
	}

	
}
