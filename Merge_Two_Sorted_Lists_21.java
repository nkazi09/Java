
public class Merge_Two_Sorted_Lists_21 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
		public static ListNode mergeTwoLists(ListNode l1, ListNode l2 ) {
			if(l1 == null) return l2;
			if(l2 == null) return l1;
			
			ListNode head = new ListNode(-1);
			
			if(l1.val <= l2.val) {
				head = l1;
				l1 = l1.next;
			} else {
				head = l2;
				l2 = l2.next;
			
			}
			
			//recursively build yhe list
			head.next = mergeTwoLists(l1, l2);
		
		
			return head;
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
