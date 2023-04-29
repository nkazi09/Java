import java.util.*;

public class Decode_String_394 {
	//use two stacks approch
	//one for int and 2nd for chars between the []
	//iterate through the string 
	public static String decodeString(String s) {
	
		
		String res = new String();
		Stack<Integer> countStack = new Stack<>();
		Stack<String> resStack = new Stack<>();
		int index = 0;
		
		while(s.length() > index) {
           //four types of chars in the input string
			if(Character.isDigit(s.charAt(index))) {
				//count the number of digits
				int count = 0;
				while(Character.isDigit(s.charAt(index))) {
					count = 10 * count + s.charAt(index) - '0';
					index++;
				}
				countStack.push(count);
			} else if(s.charAt(index) == '[') {
				
				resStack.push(res);
				res = ""; //resset the res string
				index++;
				
			} else if(s.charAt(index) == ']') { //pop from the stack and build the string
				StringBuilder sb = new StringBuilder(resStack.pop());
				int repeatTimes = countStack.pop();
				
				for(int i = 0; i < repeatTimes; i++) {
					sb.append(res);
				}
				res = sb.toString();
				index++;
						
			} else {
				res += s.charAt(index++);
			}
		}
		return res;
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3[a]2[bc]";
		System.out.println(decodeString(s));

	}

}
