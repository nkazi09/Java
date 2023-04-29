import java.util.*;

public class Delete_N_Nodes_After_M_Nodes_of_a_Linked_List_1474 {
	
	public class ListNode {
		int data;
	    ListNode next;
	 
	    ListNode(int data, ListNode next)
	    {
	        this.data = data;
	        this.next = next;
	    }
	}
		      
	
    // Helper function to print a given linked list
    public static void printList(ListNode head)
    {
        ListNode ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
    }
    /*
     * // Recursive function to delete every `n` nodes in a linked list after
    // skipping `m` nodes
    public static Node deleteNodes(Node head, int m, int n)
    {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
 
        Node prev = null, next;
        Node curr = head;
 
        // skip `m` nodes
        for (int i = 1; curr != null && i <= m; i++)
        {
            prev = curr;
            curr = curr.next;
        }
 
        // delete next `n` nodes
        for (int i = 1; curr != null && i <= n; i++)
        {
            next = curr.next;
            curr = next;
        }
 
        // link remaining nodes with the last node
        prev.next = curr;
 
        // recur for remaining nodes
        deleteNodes(curr, m, n);
 
        return head;
    }
     * */
    public static ListNode deleteNodes(ListNode head, int m, int n) {
        
        ListNode curr = head;
        ListNode prev = head;
        
        while (curr != null) {
            // initialize mCount to m and nCount to n
            int mCount = m, nCount = n;
            
            // Keep m nodes
            while (curr != null && mCount != 0) {
                prev = curr;
                curr = curr.next;
                mCount--;
            }
            //Step 2: remove the next Nodes
            while (curr != null && nCount != 0) {
                curr = curr.next;
                nCount--;
            }
            // delete n nodes
            prev.next = curr; //link the privious list to the remaining list
        }
        return head; //set the current pointer to the nextb iteration
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input keys
        int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 
        ListNode head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new ListNode(keys[i], head);
        }
 
        head = deleteNodes(head, 1, 3);
        printList(head);
	}

}
