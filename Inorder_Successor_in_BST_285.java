
public class Inorder_Successor_in_BST_285 {
	 public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int x) { val = x; }
		TreeNode(int x, TreeNode left, TreeNode right) { 
			val = x; 
			this.left = left;
			this.right = right;
		}
	}
	
	
	//Perform in-order triversal- left->root->right
	 public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
		 if(root == null) return null;
		 TreeNode successor = null;
		 
		 while(root != null) {
			 if(p.val <= root.val) {
				 root = root.right;
			 } else {
				 successor = root;
				 root = root.right;
			 }
		 }
		 
		 return root;
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
