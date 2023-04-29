import java.util.*;

public class Design_Add_and_Search_Words_Data_Structure_211 {

	public class WordDictionary{
		
		private WordDictionary[] children;
		boolean isWord;
		
		 public WordDictionary() {
		        children = new WordDictionary[26];
		        isWord = false;
	    }
	    
		
		public static void addWord(String word) {
			WordDictionary curr = this;
			for(char c : word.toCharArray()) {
				if(curr.children[c - 'a'] == null) {
					curr.children[c - 'a'] = new WordDictionary();
				}
				curr = curr.children[c - 'a'];
	
			}
			curr.isWord = true;
		}
	
	
		public static boolean search(String word) {
			WordDictionary curr = this;
			for(int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if(c == '.') {
					for(WordDictionary ch : curr.children) {
						if(ch != null && ch.search(word.substring(i+1))) return true;
						
					return false;
					}
					if(curr.children[c - 'a'] == null) return false;
					curr = curr.children[c - 'a'];
				}
				return curr != null && curr.isWord;
			}
			
			
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
