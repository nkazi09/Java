import java.util.*;

public class Odd_Even_Linked_List_328 {

	public class ListNode {
		int val;
		ListNode next;
		
		public ListNode() {}
		
		public ListNode(int val) {
			this.val = val;
		}
		
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	/*
	 * head = [1,2,3,4,5]
	 *         |  |
	 *        odd even
	 * even and odd node
	 * odd.next = even.next
	 * odd = odd.next
	 * odd.next = eHead
	 * 
	 * */
	
	public static ListNode oddEvenList(ListNode head) {
		ListNode oddHead = head;
		ListNode evenHead = head.next;
		
		ListNode even = evenHead;
		ListNode odd = oddHead;
		
		if(head == null || head.next == null) return head;
		
		while(even != null) {
			
			if(even.next != null) {
				odd.next = even.next;
			} else {
				odd.next = evenHead;
			}
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		
		return oddHead;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
