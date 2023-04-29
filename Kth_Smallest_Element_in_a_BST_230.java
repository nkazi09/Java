import java.util.*;

public class Kth_Smallest_Element_in_a_BST_230 {
	
	public class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
		
	} 
	//
	private static int res = 0;
	private static int count = 0;
	
	public static int kthSmallest(TreeNode root, int k) {
	
		dfs(root, k);
		return res;
	} 
	
	public static void dfs(TreeNode root, int k) {
		if(root == null) return;
		
		dfs(root.left, k);
		count++;
		
		if(count == k) {
			res = root.val;
		}
		dfs(root.right, k);
	}

	private Kth_Smallest_Element_in_a_BST_230.TreeNode root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 1;
		
		Kth_Smallest_Element_in_a_BST_230 tree = new Kth_Smallest_Element_in_a_BST_230();
		tree.root = new TreeNode(3);
		tree.root.left = new TreeNode(1);
		tree.root.left.right = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		
		System.out.println(tree.kthSmallest(tree.root, k));
		
	}

}
