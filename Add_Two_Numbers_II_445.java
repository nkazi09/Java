import java.util.*;

public class Add_Two_Numbers_II_445 {
	
	static class ListNode {
		   int val;
		   ListNode next;
		   ListNode() {}
		   ListNode(int val) { this.val = val; }
		   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	/*
	 Approch: Use 2 stacks 
     store l1 and l2 to 2 different stacks as you pop the eliments keep adding to result 
     and take % of the sum to keep count of the remainder   
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 /*
	    Approch: Use 2 stacks 
	    store l1 and l2 to 2 different stacks as you pop the eliments keep adding to result and take % of the sum to keep count of the remainder    
	    
	    Time: O(n1+n2)
	    Spcae: O(max(n1, n2))
	    */
	    
	    Stack<Integer> s1 = new Stack<>();
	    Stack<Integer> s2 = new Stack<>();
	    int carry = 0;
	    ListNode head = null;
	        
	        while(l1 != null) {
	            s1.push(l1.val);
	            l1 = l1.next;
	        }
	    
	       while(l2 != null) {
	            s2.push(l2.val);
	            l2 = l2.next;
	        }
	        

	        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
	            int sum = carry;
	            if(!s1.isEmpty()) sum += s1.pop();
	            if(!s2.isEmpty()) sum += s2.pop();

	            ListNode node = new ListNode(sum % 10);
	            node.next = head;
	            head = node;
	            carry = sum / 10;
	        }
	        
	        return head;
	        
		
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode('2');
	    ListNode l2 = new ListNode('4');
	    ListNode l3 = new ListNode('3');
	    ListNode l4 = new ListNode('5');
	    ListNode l5 = new ListNode('4');
	    ListNode l6 = new ListNode('6');
	
	    l1.next = l2;
	    l2.next = l3;
	    l3.next = null;
	    
	    l4.next = l5;
	    l5.next = l6;
	    l6.next = null;
	    
		 System.out.println(addTwoNumbers(l1, l4));
   
	
	}

}
