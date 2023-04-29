import java.util.*;
public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal_105 {
	
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
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		return helperBuildTree(0, preorder, inorder, 0, inorder.length - 1);
		
	}
	
	 public static TreeNode helperBuildTree(int preStart, int[] preorder, int[] inorder, int inStart, int inEnd) {
        if(preStart > preorder.length - 1 || inStart > inEnd) return null;
        
        //root has been found
        TreeNode root = new TreeNode(preorder[preStart]); //first index is the root
        
        //Triverse inorder array: loop will find the root position in the inorder array then we can recursievely split 
        //the left and right subtrees
        int index = 0;
        for(int i = 0; i <= inEnd; i++) {
            // find where the root node is in inorder array 
            if(root.val == inorder[i]) { //if root
                //root is found
                index = i;
            }
            
        }
        //triverse left and right 
        // find where the root node is in inorder array 
        //preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]                          
        //left recurse: will be inorder beganing till root - 1 (index - 1) 
        root.left = helperBuildTree(preStart + 1, preorder, inorder, inStart, index - 1);
        //right recurse: begin at root + 1 + instart and end at index+ 1
        root.right = helperBuildTree(preStart + index - inStart + 1, preorder, inorder, index + 1, inEnd);
        return root;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(); 
        int in[] = new int[] { 9, 8, 4, 2, 10, 5, 10, 1, 6, 3, 13, 12, 7 };
        int pre[] = new int[] { 1, 2, 4, 8, 9, 5, 10, 10, 3, 6, 7, 12, 13 };
                                            
                                           
        int len = in.length;
        
        TreeNode node = tree.buildTree(pre, in);
        
        if (node == null)
            return;
 
        // first recur on left child 
        buildTree(node.left);
 
        // then print the data of node 
        System.out.print(node.val + " ");
 
        // now recur on right child 
        buildTree(node.right);
        root.buildTree(root);
    

	}

}
