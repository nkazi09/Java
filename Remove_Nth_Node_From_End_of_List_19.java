import java.util.*;

public class Remove_Nth_Node_From_End_of_List_19 {
	public class ListNode {
		ListNode next;
		int val;
		
		public ListNode() {}
		
		public ListNode(int val) {
			this.val = val;
		}
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		
	}
	
	//use two pointerns slow and fast
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = head;
		ListNode slow = dummy;
		ListNode fast = dummy;
		
		for(int i = 0; i <= n; i++) {
			fast = fast.next;
		}
		
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
			
		}
		
		//skip the desired node the nth node;
		slow.next = slow.next.next;
		
		return dummy.next;
	}
	
	static ListNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		Remove_Nth_Node_From_End_of_List_19 list = new Remove_Nth_Node_From_End_of_List_19();
		list.add(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		int n = 2;
		System.out.println(list.removeNthFromEnd(list.head, n));
		*/
	}

}
