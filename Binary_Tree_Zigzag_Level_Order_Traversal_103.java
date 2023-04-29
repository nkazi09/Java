import java.util.*;

public class Binary_Tree_Zigzag_Level_Order_Traversal_103 {
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
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		boolean zigzag = false;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			List<Integer> level = new ArrayList<>();
			int size = queue.size();
			
			for(int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				
				if(zigzag) {
					level.add(0, node.val);
				} else {
					level.add(node.val);
				}
				
				if(node.left != null) {
					queue.add(node.left);
				}
				
				if(node.right != null) {
					queue.add(node.right);
				}
			}
			res.add(level);
			zigzag = !zigzag;
			
		}
		return res;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
