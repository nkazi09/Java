import java.util.*;
public class Boundary_of_Binary_Tree_545 {
	public class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode() {}
		
		public TreeNode(int val) {
			this.val = val;	
		}
		
		public TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
			
		}
		
	}
	
	
	
	//Pre order triversal
	static List<Integer> res = new ArrayList<>();
	public static List<Integer> boundaryOfBinaryTree(TreeNode root) {
		if(root == null) return res;
		
		res.add(root.val);
		leftBoundary(root.left);
		leaves(root.left);
		leaves(root.right);
		rightBoundary(root.right);
	} 
	
	
	public static void leftBoundary(TreeNode root) {
		if(root == null || root.left == null && root.right == null) return;
		
		res.add(root.val);
		
		if(root.left == null) {
			leftBoundary(root.right);
		} else {
			leftBoundary(root.left);
		}
		
	}
	
	public static void leaves(TreeNode root) {
		if(root == null) return;
		
		if(root.left == null && root.right == null) {
			res.add(root.val);	
		} else {
			leaves(root.left);
			leaves(root.right);

		}
	}
	
	public static void rightBoundary(TreeNode root) {
		if(root == null || root.left == null && root.right == null) return;
		
		
		
		if(root.right == null) {
			rightBoundary(root.left);
		} else {
			rightBoundary(root.right);
		}
		res.add(root.val); //add after the child visits
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
