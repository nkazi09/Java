import java.util.*;

public class Largest_Number_179 {
	/*
    Input: nums = [10,2]
    Output: "210"
        
    we try to take the larger digit first even though 10 is bigger 2 two is larger for example. sor try to find the larger digit 
    
    Approch: Greedy approch
    - rearrange the the digits such that the number is larger
    - compare two number by its first digit whichever is bigger is the one we should go with. 
    Algo:
    1. convert the number into string and create a string array
    2. Sort the array with comparator to and append them to the resulting string to get the answer 
    
    Time: O(n)
    Space: O(n)
	*/
	
	public static String largestNumber(int[] nums) {
		String[] str = new String[nums.length];
		
		if(nums.length == 0 || nums == null) return "";
		
		for(int i = 0; i < nums.length; i++) {
	        str[i] = String.valueOf(nums[i]); // parase the 
	        
	    }
		//Step 2: Sort and implement a  string comparator 
		Arrays.sort(str, (s1, s2) -> (s2+s1).compareTo(s1+s2));
		
		//Step 3: after sorting if the first eliment is 0 the return 0
		if(str[0].equals("0")) {
			return "0";
		}
		
		//Step 4: String builder to print the string res
		StringBuilder sb = new StringBuilder();
		
		for(String s : str) {
			sb.append(s);
		}
		
		return sb.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,2};
		
		System.out.println(largestNumber(nums));
		
	}

}
