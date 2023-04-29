import java.util.*;

public class Longest_Consecutive_Sequence_128 {
	//store all eliments in a set
	// check if the eliment has a left and right neightbor
	//compute the maxLength
	public static int longestConsecutive(int[] nums) {
		int longest = 0;
		int curr = 0;
		int currLength = 0;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int n : nums) {
			set.add(n);
		}
		
		for(int num : nums) {
			//check if the num has a left neightbor exist 
			//if doesnt exist in the set then start a new sequence and check for right side
			
			if(!set.contains(num - 1)) {
				curr = num;
				currLength = 1;
			}
			
			//check for right neighbot
			while(set.contains(curr+1)) {
				curr += 1;
				currLength += 1;
			}
			longest = Math.max(longest, currLength);
		}
		
		return longest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100,4,200,1,3,2};
		
		System.out.println(longestConsecutive(nums));

	}

}
