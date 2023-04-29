import java.util.*;
public class Remove_All_Adjacent_Duplicates_In_String_1047 {

	public static String removeDuplicates(String s) {
        /*
        Approch:  String builder
        
        */
        StringBuilder sb = new StringBuilder();
       
        for(char c : s.toCharArray()) {
            int size = sb.length();
            if(size > 0 && sb.charAt(size - 1) == c) {
                sb.deleteCharAt(size - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}

}
