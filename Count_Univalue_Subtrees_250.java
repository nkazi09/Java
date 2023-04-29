
public class Count_Univalue_Subtrees_250 {
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
	static int count = 0;
    public static int countUnivalSubtrees(TreeNode root) {
    	isUni(root);
    	return count;
    }
    
    public static boolean isUni(TreeNode root) {
    	if(root == null) return true;
    	
    	boolean left = usUni(root.left);
    	boolean right = usUni(root.right);
    	
    	if(left && right) {
    		if(root.left != null && root.left.val != root.val) {
    			return false;
    		} 
    		if(root.right != null && root.right.val != root.val) {
    			return false;
    		}
    		
			return true; 
			count++;
    		
    	}
    	return false;

    	
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}