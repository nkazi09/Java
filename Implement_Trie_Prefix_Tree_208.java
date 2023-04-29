
import java.util.*;

public class Implement_Trie_Prefix_Tree_208 {

	////Trie is usually used to autocomplete words spellchecker  etc
	
	
	public class TrieNode{
		public char val;
		public boolean isWord;
		public TrieNode[] children = new TrieNode[26];
		
		public TrieNode() {}
		
		public TrieNode(char c) {
			TrieNode root = new TrieNode();
			root.val = c;			
		}
		
	}
	
	
	public class Trie {
		
		public static TrieNode root;
		
		public Trie() {
			root = new TrieNode();
			root.val  = ' ';
		}
		
		public static void insert(String word) {
			TrieNode ws = root;
			for(int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				
				if(ws.children[c - 'a'] == null) {
	                ws.children[c - 'a'] = new TrieNode(c);
				}
				ws = ws.children[c - 'a'];
			}
			ws.isWord = true; 
			
		}
		
		
		public static boolean search(String word) {
			TrieNode ws = root;
			
			for(int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if(ws.children[c - 'a'] == null) return false;
				ws = ws.children[c - 'a'];
				
			}
			
			return ws.isWord;
		} 
		
		public static boolean startsWith(String prefix)  {
			TrieNode ws = root;
			
			for(int i = 0; i < prefix.length(); i++) {
				char c = prefix.charAt(i);
				if(ws.children[c - 'a'] == null) return false;
				ws = ws.children[c - 'a'];
				
			}
						
			return true;
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
