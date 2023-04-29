import java.util.*;
public class Atlassian_Valid_Invalid_entry_exit {

	public static List<List<String>> validInvalidEntryExit(String[][] badgeRecords) {
        List<List<String>> result = new ArrayList<>();

        Set<String> exitedOnly = new HashSet<>();
        Set<String> entered = new HashSet<>();
        
        for(String[] e : badgeRecords){
            if(e[1].equals("exit")){               
                if(entered.contains(e[0])){
                    entered.remove(e[0]);
                }
                else{
                    exitedOnly.add(e[0]);
                }
            } else {
                entered.add(e[0]);
            }               
        }

        List<String> invalidEnteriesList = new ArrayList<>(entered);
        List<String> invalidExits = new ArrayList<>(exitedOnly);
        result.add(invalidExits);
        result.add(invalidEnteriesList);

        return result;
		
	}
	
	public static void main(String[] args) {
		Atlassian_Valid_Invalid_entry_exit invalidUsers = new Atlassian_Valid_Invalid_entry_exit();

        String [][]  logs = {
                {"Martha", "exit"},
                {"Paul", "enter"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "enter"},
                {"Paul", "enter"},
                {"Curtis", "exit"},
                {"Curtis", "enter"},
                {"Paul", "exit"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "exit"},
                {"Paul", "enter"},
                {"Paul", "enter"},
                {"Martha", "exit"}
        };
        System.out.println(invalidUsers.validInvalidEntryExit(logs));

        
	}
        // Expected output: ["Curtis", "Paul"], ["Martha", "Curtis"]

}
