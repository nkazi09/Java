import java.util.*;


public class Lowest_Common_Ancestor_of_a_Binary_Tree_236 {
	public class TreeNode {
		
		int val;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int _val) {
			val = _val;
		}
		
	}
	static TreeNode root;
	static TreeNode p;
	static TreeNode q;
	
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		//base	
		if(root == null || p == root || q == root) return root;
		//recurse both substrees
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		return left == null ? right : right == null ? left : root;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lowest_Common_Ancestor_of_a_Binary_Tree_236 tree = new Lowest_Common_Ancestor_of_a_Binary_Tree_236();
		tree.root = new TreeNode(3);
		tree.root.left = new TreeNode(5);
		tree.root.left.left = new TreeNode(6);
		tree.root.left.right = new TreeNode(2);
		tree.root.right = new TreeNode(1);
		tree.root.right.left = new TreeNode(0);
		tree.root.right.right = new TreeNode(8);
		TreeNode p =  new TreeNode(5);
		TreeNode q =  new TreeNode(5);;
		TreeNode t = tree.lowestCommonAncestor(root, p, q);
		
		
		System.out.println("LCA of " + p.val + "and" + q.val + "are" + t.val);
		
		
		
		
	}
	

}
