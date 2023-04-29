import java.util.*;

public class Diameter_of_Binary_Tree_543 {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	}
	static int max = 0;
	public static int diameterOfTree(TreeNode root) {
		/*
		 * Approch: recursive
		 * Idea is to find height on both left subtree and right subtree and the diameter is nothing but the sum of(left + right)
		 * Triversal left, root and right and calsulate the max
		 * For every node, length of longest path which pass it = MaxDepth of its left subtree + MaxDepth of its right subtree.
		 * 
		 * 1. have a max variable starts at the root
		 * 2. compute whats the max diameter of the left side and max of right side
		 * 3. diameter can be computed by height of left + height of right
		 * */
		
		maxDepth(root);	
		return max;
	}
	
	public static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		max = Math.max(max, left+right);

		return Math.max(left, right) + 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
