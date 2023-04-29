import java.util.*;

public class Evaluate_Reverse_Polish_Notation_150 {
	public static int evalRPN(String[] tokens) {
		//use stack
		/*tokens = ["2","1","+","3","*"] 
                |
                3.  3
                
		Questions: is there any other special chars letters , . in the string?
		
		given a string evalue to int after executing the operatuions
		- Use a stack to store all the values in the stack
		- And once we see a operation pop the last two eliments all the last eliments 
		- and perform the operations? store the resulted value in the stack and proceed reading and perform the next operations seen
		
		Time: O(n)
		Sapce: O(n)
		
		*/
		int a, b; //to store the operatiosn res in variables
		Stack<Integer> stack = new Stack<>();
		
		for(String token : tokens) {
			if(token.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			} else if(token.equals("/")) {
				b = stack.pop();
				a = stack.pop();
				stack.push(a/b);
			} else if(token.equals("*")) {
				b = stack.pop();
				a = stack.pop();
				stack.push(a * b);
			} else if(token.equals("-")) {
				
				b = stack.pop();
				a = stack.pop();
				stack.push(a - b);
			} else {
				stack.push(Integer.parseInt(token));
			}
		}
		
		return stack.pop();
		
		
		/*
		Stack<Integer> stack = new Stack<>();
		int a = 0;
		int b = 0;
		
		for(String s : tokens ) {
			
			if(s.equals("+")) {
				
				stack.add(stack.pop() + stack.pop());
				
			} else if(s.equals("/")) {
				b = stack.pop();
				a = stack.pop();
				stack.add(b/a);
				
			} else if(s.equals("-")) {
				
				stack.add(stack.pop() - stack.pop());

			} else if(s.equals("*")) {
				b = stack.pop();
				a = stack.pop();
				stack.add(b*a);
				
				
			} else {
				stack.add(Integer.parseInt(s));
				
			}
			
		}
		
		return stack.pop();*/
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = {"2","1","+","3","*"};
		System.out.println(evalRPN(tokens));

	}

}
