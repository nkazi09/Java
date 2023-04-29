import java.util.*;

public class Course_Schedule_II_210 {
	//do topolocgical sort using stack
	// DFS to detect cycle
	public static int[] findOrderin(int[][] prerequisites, int numCourses) {
		int[] res = new int[numCourses];
		ArrayList[] adj = new ArrayList[numCourses];
		
		for(int i = 0; i < numCourses; i++) {
			adj[i] = new ArrayList();
		}
		
		//build the graph
		for(int[] pre : prerequisites) {
			adj[pre[1]].add(adj[0]);
		}
		
		int[] visited = new int[numCourses];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < numCourses; i++) {
			if(visited[i] == 0 && dfsCycle(adj, i, stack, visited)) {
				return new int[0]; //means cycle detected
			}
		}
		int index = 0;
		
		while(!stack.isEmpty()) {
			res[index++] = stack.pop();
		}
		
		return res;
		
	} 
	
	public static boolean dfsCycle(ArrayList<Integer>[] adj, int node, Stack<Integer> stack, int[] visited) {
		visited[node] = 1;
		
		for(int ad : adj[node]) {
			if(visited[ad] == 1) return true;
			if(visited[ad] == 0 && dfsCycle(adj, ad, stack, visited)) return true;
			
 		}
		visited[node] = 2;
		stack.push(node); //if not a cycle
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCourses = 4;
		int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
		
		System.out.println(findOrderin(prerequisites, numCourses));
		
	}

}
