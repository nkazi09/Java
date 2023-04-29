import java.util.*
public class Maximum_Level_Sum_of_a_Binary_Tree_1161 {
    class TreeNode {
    	int val = 0;
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
	
	public int maxLevelSum(TreeNode root) {
    	/*
    	 * Approch: BFS
    	 * */
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int level = 1;
		int sum  = root.val;
		int l = 1;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			int curr = 0;
			
			for(int i = 0; i < size; i++) {
				TreeNode temp = queue.remove();
				
				curr += temp.val;
				
				if(temp.left != null) {
					queue.add(temp.left);
				}
				
				if(temp.right != null) {
					queue.add(temp.right);
				}
				
			}
			if(curr > sum) {
				sum = curr;
				level = l;
			}
			l++;
			
		}
		return level;

		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
