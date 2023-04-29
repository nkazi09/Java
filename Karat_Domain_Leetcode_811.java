import java.util.*;

public class Karat_Domain_Leetcode_811 {
/*
 * We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, 
 * (in the same format as the input, and in any order), that explicitly counts the number of visits to 
 * each subdomain. 
 * Example 1:
Input: 
["9001 discuss.leetcode.com"]
Output: 
["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]

Example 2:
Input: 
["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
Output: 
["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]


 * https://www.jianshu.com/p/fdbcba5fe5bc
*/
	public static List<String> findDomains(String[] cpdomains) {
		List<String> res = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		if(cpdomains.length == 0 || cpdomains == null) return null;
		
		for(String domain : cpdomains) {
			int space = domain.indexOf(' ');
			int visit  = Integer.valueOf(domain.substring(0, space));
			String subDomain = domain.substring(space+1);
			map.put(subDomain, map.getOrDefault(subDomain, 0) + visit);
		
			//split the subdomain 
			for(int i = 0; i < subDomain.length(); i++) {
				if(subDomain.charAt(i) == '.') {
					String subSubDomain = subDomain.substring(i+1);
					map.put(subSubDomain, map.getOrDefault(subSubDomain, 0) + visit);
				} 
			}
		}
		
		for(String s : map.keySet()) {
			res.add(String.valueOf(map.get(s)) + ' ' + s);
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] domains = {"9001 discuss.leetcode.com"};	
		System.out.print(findDomains(domains));
	}

}
