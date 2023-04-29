
public class Construct_Binary_Tree_from_String_536 {
	public static class TreeNode {
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
	static private int index;
    public static TreeNode str2tree(String s) {
    	/*
    	build the binary tree from the String given
        Approch: Recursion

        Time: O(n)
        Space: O(n)
        */
    	 index = 0;
         if(s.length() == 0 || s == null) return null;
             
         return deserialize("(" + s + ")");
    	
    }
    
    private static TreeNode deserialize(String s) {
    	 int sign = 1;
         TreeNode root = new TreeNode();
         
         //Step1: check for open
         if(s.charAt(index) != '(') {
             return null;
         }
         index++; //char is "("
         
         //Step 2: check for sign
         if(s.charAt(index) == '-') {
             sign = -1;
             index++;
         }
         //Step3: check if digit build the digit
         while(Character.isDigit(s.charAt(index))) {
             root.val = root.val * 10 + s.charAt(index) - '0'; 
             index++;
         }
         //Step 4: add the sign
         root.val *= sign;
         
         //Step 5: Build the tree by going left then right recursively
         root.left = deserialize(s);
         root.right = deserialize(s);
         index++;
         return root;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
