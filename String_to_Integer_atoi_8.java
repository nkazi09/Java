import java.util.*;

public class String_to_Integer_atoi_8 {
	
	/*
	 * Approch:
	 * read the string 
	 * 1. ignore whitespace
	 * 2. check +/- sign
	 * 3. read digit chars
	 * 4. convert string digit to int
	 * 5. check if its within the range 
	 * */
	public static int stringToInt(String s) {
		int sign = 1;
		int index = 0;
		int res = 0;
		//1: whitespace
		while(s.length() > index && s.charAt(index) == ' ') {
			index++;
			
		}
		//Check sign
		if(s.length() > index && s.charAt(index) == '-') {
			sign = -1;
			index++;
		} else if(s.length() > index && s.charAt(index) == '+'){
			sign = +1;
			
			
		}
		
		while(s.length() > index && Character.isDigit(s.charAt(index))) {
			int digit = s.charAt(index) - '0';
			
			
			if(res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10  || digit > Integer.MAX_VALUE % 10) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;  
			}
			
			
			res = res * 10 + digit;
			index++;
		}
		
		
		return sign * res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "   -42";
		
		System.out.println(stringToInt(s));
		
	}

}
