import java.util.*;

public class Binary_Tree_Right_Side_View_199 {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		
		TreeNode() {}
		
		TreeNode(int val) {
			this.val = val;
		}
		
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}		
	}
	public Binary_Tree_Right_Side_View_199.TreeNode root;

	
	//Static TreeNode root;
	//BFS
	public static List<Integer> rightSideView(TreeNode root) {
		
		List<Integer> res = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				TreeNode level = queue.remove();
				
				if(i == size - 1) {
					res.add(level.val);
				}
				
				//process left and right
				if(root.left != null) {
					queue.add(root.left);
					
				}
				if(root.right != null) {
					queue.add(root.right);
					
				}
			}
		}
		
		return res;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);	//	tree.root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right = new TreeNode(4);
		rightSideView(root);
		
	}

}
