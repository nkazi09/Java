public class Largest_BST_Subtree_333 {	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		public TreeNode() {}
		
		public TreeNode(int val) {
			this.val = val;
		}
		
		public TreeNode(int val, TreeNode right, TreeNode left) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
		
	}
	public class Data {
		int size;
		int min;
		int max;
		
		public Data(int min, int max, int size) {
			this.min = min;
			this.max = max;
			this.size = size;
		}
		
	}
	
	/*
	 * Do postorder triversal keep track of size, min and max
	 * 
	 * */

	public static int largestBSTSubtree(TreeNode root) {
		return largestBST(root).size;
	}
	
	
	private static Data largestBST(TreeNode root) {
		if(root == null) {
			return new Data (Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
		}
		//recursion 
		Data left = largestBST(root.left);
		Data right = largestBST(root.right);
		
		//check against the root
		if(left.max < root.val && right.min > root.val) {
			return new Data(Math.min(root.val, left.min), Math.max(root.val, right.max), left.size + right.size + 1);
		}
		// Otherwise, return [-inf, inf] so that parent can't be valid BST
		return new Data(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.size, right.size));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
}

