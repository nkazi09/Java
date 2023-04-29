import java.util.*;
public class eBay_interview {

	/* Given s =  thisIsMyString
	 * Print each word on its won line
	 * Note: use regex
	 * */
	public static void printWord(String s) {
		String[] str = s.split("(?=\\p{Upper})");
		//String[] x = "thisIsMyString".split("(?=[A-Z])");
		int start = 0;
		int end = str.length;
		
		String res = "";
		
		
		/*for(String st : str) {
			
			System.out.println(st);
		}*/
			
		//print in reverse order
		Collections.reverse(Arrays.asList(str));
		
		for(String st : str) {
		
			System.out.println(Arrays.asList(st));
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MyNameIsAllen";
		printWord(s);
		
	}

}
