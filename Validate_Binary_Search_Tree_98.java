import java.util.*;


public  class Validate_Binary_Search_Tree_98 {
	public static class TreeNode {
		
		public TreeNode left;
		public TreeNode right;
		

		public int val;
		
		
		public TreeNode() {}

		public TreeNode(int _val) {
			this.val = _val;
		}

		
		public TreeNode(int _val, TreeNode left, TreeNode right) {
			this.val = _val;
			this.left = left;
			this.right = right;	
		}
		
		
	}	
	
	static TreeNode root;
	
	public static boolean isValidBST(TreeNode root) {
		
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isBST(TreeNode root, Integer min, Integer max) {
		if(root == null) return true;
		
		if(max != null && root.val >= max || min != null && min >= root.val) {
			return false;
		}
		return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
		
		
	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validate_Binary_Search_Tree_98 tree = new Validate_Binary_Search_Tree_98();
		tree.root = new TreeNode(2);
		tree.root.left = new TreeNode(1);
		tree.root.right = new TreeNode(3);
		
		if(tree.isValidBST(root)) {
			
			System.out.println("is BST");
			
		} else {
			System.out.println("Not a BST");
			
		}
		
		
		
	}

}
