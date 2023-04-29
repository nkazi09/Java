import java.util.*;

public class Simplify_Path_71 {

	public static String simplifyPath(String str) { 	
	/*
	idea is to read the string only push charats when you see one and if you see".." popnthe eliment other dont matter
	Approch: Stack
	two rules that matters:
	1. when we get /.. -> pop the eliment from the stack
	2. when we get /name -> push the eliment to the stack

	To calculate the path concatinate the eliments in teh stack and keep adding / as you add the eliments. eliments will be poped in reversed order so at the end need to reverse it back 
	*/
	
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		String[] s = str.split("/"); //initially split the paths into directory
		
		for(int i = 0; i < s.length; i++) {
			if(!stack.isEmpty() && s[i] == "..") {
				
				stack.pop();
			} else if(!s[i].equals("") && !s[i].equals("..") && !s[i].equals(".")) {
				stack.push(s[i]);
			} 
		}
		//Base casse
		if(stack.isEmpty()) return "/";
		
		//reverse the order
		while(!stack.isEmpty()) {
			sb.insert(0, stack.pop()).insert(0, "/");
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "/home/";
		System.out.println(simplifyPath(s));
	}

}
