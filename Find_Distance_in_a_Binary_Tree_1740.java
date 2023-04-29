
public class Find_Distance_in_a_Binary_Tree_1740 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
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
	
	/*
	 * Recursion/DFSFine the lowest common ancestor
	 * 
	 * */
	
	public static int findDistance(TreeNode root, int p, int q) {
		TreeNode lca = LCA(root, p, q);
		
		return distance(lca, p, 0) + distance(lca, q, 0);
	
	}
	
	public int distance(TreeNode root, int target, int travel) {
		if(root == null) return -1;
		
		if(root.val == target) {
			return target;
		}
		
		int travelLeft = distance(root.left, target, travel+1);
		
		if(travelLeft == -1) {
			return distance(root.right, target, travel+1);
		}
		
		return travelLeft;
	 
	}
	
	public TreeNode LCA(TreeNode root, int p, int q) {
		if(root == null) return null;
		
		TreeNode left = LCA(root.left, p, q);
		TreeNode right = LCA(root.right, p, q);
		
		//root is LCA
		if(root.val == p || root.val == q || left != null && right != null) {
			return root;
		}
		return left != null ? left : right;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
