
public class Convert_Binary_Number_in_a_Linked_List_to_Integer_1290 {
	static class ListNode {
		static int val;
		static ListNode next;
		 
		public ListNode() {}
		public ListNode(int val) {
			this.val = val;
		}
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	public static int getDecimalValue(ListNode head) {
		/*
		 *  head = [1, 0, 1]
		 *  read the given input from left to right
		 *  multiply *  to head.val and keep adding the next node
		 * */
		
		int res = head.val;
		
		while(head.next != null) {
			 res = res * 2 + head.next.val;
			 head = head.next;
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ListNode a = new ListNode('1');
	    ListNode b = new ListNode('0');
	    ListNode c = new ListNode('1');
	    
	    a.next = b;
	    b.next = c;
	    c.next = null;
		
		System.out.println(getDecimalValue(a));
		
	}

}
