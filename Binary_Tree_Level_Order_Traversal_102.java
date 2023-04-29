import java.util.*;



public class Binary_Tree_Level_Order_Traversal_102 {

//BFS: level by level from left to right
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {};
		TreeNode(int val) {			
			this.val = val;
		}
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.left = left;
			this.right = right;
			this.val = val;
			
		}
		
	}
	
  public static List<List<Integer>>levelOrder(TreeNode root) {
	  
	  List<List<Integer>> list = new ArrayList<>();
	  
	  Queue<TreeNode> queue = new LinkedList<>();
	  queue.add(root);
	  
	  
	  while(!queue.isEmpty()) {
		  int size = queue.size();
		  List<Integer> level = new ArrayList<>();
		  
		  for(int i = 0; i < size; i++) {
			  TreeNode node = queue.poll();
			  level.add(node.val);
			  
			  
			  //process left and right
			  while(node.left != null) {
				  queue.add(node.left);
			  }
			  
			  while(node.right != null) {
				  queue.add(node.right);
			  }
		  }
		  list.add(level);
		  
	  }
	  
	  return list;
  }
	
	
	public static void main(String[] args) {
	    /*
		TreeNode node = new TreeNode();
		node.root = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
		
        System.out.print(node.printnode());
	*/
	}

}
