
public class Middle_of_the_Linked_List_876 {
	public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
		     
		     /*
		      * Have a fast and slow pointers 
		      * fast will go all the way till the end slow will reach tillthe middle and return the middle node
		      * */
		     public static ListNode middleNode(ListNode head) {
		    	 if(head == null) return null;
		    	 
		    	 ListNode fast = head;
		    	 ListNode slow = head;
		    	
		    	 
		    	 while(fast != null && fast.next != null) {
		    		 slow = slow.next;
		    		 fast =fast.next.next;
		    	
		    	 }
		    	
		    	 return slow;
		     }
		     
		     
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
