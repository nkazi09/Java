import java.util.*;

public class Graph_Valid_Tree_261 {
	
	public static boolean validTree(int n, int[][] edges) {
		List<List<Integer>> adjList = new ArrayList<>();
		
		
		for(int i = 0; i < n; i++) {
			adjList.add(new ArrayList<>());	
		}
		
		for(int[] edge : edges) {
			adjList.get(edge[0]).add(edge[1]);
			adjList.get(edge[1]).add(edge[0]);
			
		}
		
		Map<Integer, Integer> parent = new HashMap<>();
		parent.put(0, -1);
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		while(!stack.isEmpty()) {
			int node = stack.pop();
			for(int neighbor : adjList.get(node)) {
				if(parent.get(node) == neighbor) {
	                continue; // Already seen this node.
	            }
				if (parent.containsKey(neighbor)) {
	                return false;
	            }
			
			stack.push(neighbor);
			parent.put(neighbor, node);
			
			}
		}
		
		return parent.size() == n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[][] edges = {{0,1},{0,2},{0,3},{1,4}};
		System.out.println(validTree(n, edges));
	}

}
