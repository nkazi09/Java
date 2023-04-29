import java.util.*;
public class Combination_Sum_39 {
	//backtracking approch pick only values that subs up to the target
	//backtrack otherwise
	//
	public static List<List<Integer>> combinationSum(int[] candidate, int target) {
		List<List<Integer>> list = new ArrayList<>();
		
		recursion(candidate, new ArrayList<>(), target, list, 0);
				
		return list;
	}
	
	public static void recursion(int[] candidate, List<Integer> curr, int target, List<List<Integer>> list, int index) {
		if(target < 0) {
		
			return;
		
		} else if (target == 0) {
			
			list.add(new ArrayList<>(curr));
			
		} else { // target is > 0
			for(int i = 0; i < candidate.length; i++) {
				curr.add(candidate[i]);
				recursion(candidate, curr, target - candidate[i], list, i);
				curr.remove(curr.size() - 1);
			}
			
		}
				
	} 
	
	
	public static void main(String[] args) {
		int[] arr = {2,3,6,7};

        int sum = 7;
 
        List<List<Integer>> ans = combinationSum(arr, sum);

        for (int i = 0; i < ans.size(); i++) {
 
            System.out.print("(");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print(")");
        }
	}

}
