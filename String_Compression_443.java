import java.util.*;
public class String_Compression_443 {
	//two pointer approch. fast and slow, and index
	/*
	 * chars = ["a","a","b","b","c","c","c"]
     *           |      		
	 * */
	public static int compress(char[] s) {
		int index = 0;
		int fast = 0;
		int slow = 0;
		
		while(s.length > slow) {
			fast = slow;
			while(s.length > fast && s[fast] == s[slow]) {
				fast++; //count the occurances of the char
				
			}
			//counts the last char we saw
			s[index++] = s[slow]; //last occurance we saw 
			
			if(fast - slow > 1) {
				String res = fast - slow + ""; //append the count to the res string
			
			
				//now append the char to the number of occurances
				for(char c : res.toCharArray()) {
					s[index++] = c;
				}
			
			
			
			}
			slow = fast;
			
		}
		return index;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = {'a','a','b','b','c','c','c'};
		System.out.println(compress(chars));
	}

}
