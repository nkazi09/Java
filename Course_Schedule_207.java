
import java.util.*;

public class Course_Schedule_207 {

	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		//Adjeicency list
		//visited nodes
		//dfs boolean method
		ArrayList[] adj = new ArrayList[numCourses];
		
		for(int i = 0; i < numCourses; i++) {
			adj[i] = new ArrayList<>();
			
		}
		//fi;; the adjecency list
		for(int[] pre : prerequisites) {
			adj[pre[1]].add(pre[0]);
			
		}
		
		int[] visited = new int[numCourses];
		
		for(int i = 0; i < numCourses; i++) {
			if(dfs(adj, visited, i)) {
				return false;
				
			}
		}
		
		return true;
	}
	
	public static boolean dfs(ArrayList<Integer>[] adj, int[] visited, int course) {
		
		visited[course] = 1;
		
		for(int ad : adj[course]) {
			
			if(visited[ad] == 1) return true;
			if(visited[ad] == 0 && dfs(adj, visited, ad)) return true;
		}
		visited[course] = 2;
		
		
		return false;
		
	}
	public static void main(String[] args) {
		int numCourses = 2;
		int[][] prerequisites = {{1,0},{0,1}};
		boolean result =  canFinish(numCourses, prerequisites);
		if(result) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
