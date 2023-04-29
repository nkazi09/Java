
public class Delete_Node_in_a_BST_450 {
	
	 static  class TreeNode {
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
	 
	public static TreeNode deleteNode(TreeNode root, int key) {
		/*	
	Fact to know about BST: Inorder traversal of BST is an array sorted in the ascending order.
	to compute inorder follow Left -> Root-> Right
	 
	
	Algorithm: Recursive Approch + inorder triversal
	1. If key > root.val then delete the node to delete is in the right subtree root.right = deleteNode(root.right, key).
	
	If key < root.val then delete the node to delete is in the left subtree root.left = deleteNode(root.left, key).
	
	If key == root.val then the node to delete is right here. Let's do it :
	
	If the node is a leaf, the delete process is straightforward : root = null.
	
	
	Once the node is found, have to handle the below 4 cases
	1. node doesn't have left or right - return null
	2. node only has left subtree- return the left subtree
	3. node only has right subtree- return the right subtree
	4. node has both left and right - find the minimum value in the right subtree, set that value to the currently found node, then recursively delete the minimum value in the right subtree
	
	Return root.
*/
		if(root == null) return null;
		
		//Step 1: find the node
		if(key < root.val) { //check left substree
			root.left = deleteNode(root.left, key);
		} else if (key > root.val) { //check right substree
			root.right = deleteNode(root.right, key);
		} else if (root.left == null) { 
			return root.right;
		} else if (root.right == null) { 
			return root.left;
		
		} else {
			
			//Step 2: Node has both right and left find the min
			root.val = findMin(root.right);
            root.right = deleteNode(root.right, root.val);
		}

		return root;
		
		
	}
	public static int findMin(TreeNode node) {
		while(node.left != null) {
			node = node.left;
		}
		return node.val;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
