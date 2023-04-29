import java.util.*;
public class Merge_k_Sorted_Lists_23 {
	
	public class ListNode {
		ListNode next;
		int val;
		
		public ListNode() {}

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.next = next;
			this.val = val;
		}

	}
	
	public ListNode mergeKLists(ListNode[] list) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(ListNode head : list) {
			while(head != null) {
				pq.add(head.val);
				head = head.next;
			}
		}
		
		ListNode dummy = new ListNode(-1);
		ListNode head  = dummy;
		
		while(!pq.isEmpty()) {
			head.next = new ListNode(pq.remove());
			head = head.next;
		}
		
		return dummy.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
