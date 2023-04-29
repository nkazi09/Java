
public class Swap_Nodes_in_Pairs_24 {
	
	public class ListNode {
		int val;
		ListNode next;
		
		public ListNode() {}
		
		public ListNode(int val) {
			this.val = val;
		}
		
		public ListNode(int val, ListNode next) {
			this.next = next;
			this.val = val;
		}
	}
	//have dummy node swap the nodes 
	public static ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode curr = dummy;
		
		
		while(curr.next != null && cur.next.next != null) {
			
			ListNode swap1 = curr.next; //head
			ListNode swap2 = curr.next.next; //nead.next
			curr.next = swap2; //head-> head.next
			swap1.next = swap2.next;
			swap2.next = swap1;
			curr = swap1;
		}
		
		return dummy.next;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
