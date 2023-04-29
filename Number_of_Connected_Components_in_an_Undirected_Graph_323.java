import java.util.*;

public class Number_of_Connected_Components_in_an_Undirected_Graph_323 {
	//Approch: DFS
	public static int countComponents(int n, int[][] edges) {
		ArrayList[] adj = new ArrayList[n];
		
		//initialize it
		for(int i = 0; i < n; i++) {
			adj[i] = new ArrayList();
		}
		
		//build the graph undirected
		for(int[] edge : edges) {
			adj[edge[1]].add(edge[0]);
			adj[edge[0]].add(edge[1]);
		}
			
		int[] visited = new int[n];
		int counter = 0;
		
		for(int i = 0; i < n; i++) {
			if(visited[i] == 0) {
				counter++; //keps track of the connections while dfs runs
				dfsCycle(visited, i, adj);
			}
		}
		
		return counter;
		
	}
	
	public static void dfsCycle(int[] visited, int node, ArrayList<Integer>[] adj) {
		visited[node] = 1;
		
		for(int ad : adj[node]) {
			if(visited[ad] == 0) {
				dfsCycle(visited, ad, adj);
			}
		}
		visited[node] = 2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[][] edges = {{0,1},{1,2},{3,4}};
		System.out.println(countComponents(n, edges));
	}

}
