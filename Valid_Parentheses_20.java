import java.util.*;
public class Valid_Parentheses_20 {
	
	public static boolean isValidParenthesis(String s) {
		if(s.length() == 0 || s == null) return false;
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				
				if(stack.isEmpty()) {
					return false;
				}
				if(s.charAt(i) == ')' && stack.pop() != '(') {
					return false;
				} else if(s.charAt(i) == '}' && stack.pop() != '{') {
					return false;
				} if(s.charAt(i) == ']' && stack.pop() != '[') {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		System.out.println(isValidParenthesis(s));
	}

}
