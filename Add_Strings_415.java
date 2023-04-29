import java.util.*;
public class Add_Strings_415 {
	
	public static String addNumbers(String num1, String num2) {
		/*  
		 * read from right to left and keep track of carry
		 * */
	
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		
		while(i >= 0 || j >= 0) {
			int sum = carry; //start by adding the carry which os 0;
			
			if(i >= 0) {
				sum += num1.charAt(i--) - '0'; //converts it to int 
			}
			if(j >= 0) {
				sum += num2.charAt(j--) - '0'; //converts it to int 
			}
			
			sb.append(sum % 10); //result has be always between 0 t0 9 inclusive
			carry = sum / 10; 
		}
		
		if(carry != 0) {
			
			sb.append(carry);
			
		}
		
		return sb.reverse().toString();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "11"; 
		String num2 = "123";
		
		System.out.println(addNumbers(num1, num2));
	}

}
