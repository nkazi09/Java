import java.util.*;
public class Shifting_Letters_848 {
	
	public static String shiftingLetters(String s, int[] shifts) {
		int shift = 0;
		char[] str = s.toCharArray();
		
		//First pass counts the number of shifts
		//add it from the right to left
		for(int i = s.length() - 1; i >= 0; i--) {
			//Sum up the shifts and mod by 26
			//compute the shifts needed for each position
			shift = (shift + shifts[i] % 26);
			//add sum to the a'th character 
			str[i] = (char)((str[i] - 'a' + shift) % 26 + 'a');
		}
		return new String(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc"; int[] shifts = {3,5,9};
		
		System.out.println(shiftingLetters(s, shifts));
	}

}
