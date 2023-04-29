import java.util.*;

public class karat_AllCoursesCanbeTaken {
/*
Students may decide to take different "tracks" or sequences of courses in the Computer Science curriculum. There may be more than one track that includes the same course, but each student follows a single linear track from a "root" node to a "leaf" node. In the graph below, their path always moves left to right.
Write a function that takes a list of (source, destination) pairs, and returns the name of all of the courses
that the students could be taking when they are halfway through their track of courses.
Sample input 1: (arbitrarily ordered)
pairs1 = [
	["Foundations of Computer Science", "Operating Systems"],
	["Data Structures", "Algorithms"],
	["Computer Networks", "Computer Architecture"],
	["Algorithms", "Foundations of Computer Science"],
	["Computer Architecture", "Data Structures"],
	["Software Design", "Computer Networks"]
]
	
	In this case, the order of the courses in the program is:
	Software Design
	Computer Networks
	Computer Architecture
	Data Structures
	Algorithms
	Foundations of Computer Science
	Operating Systems


 * */
	public static String halfway_course(String[][] pairs) {
		Map<String,String> inputMap = new HashMap<>();
	    List<String> outputList = new ArrayList<>();
	    String output ="";
	    for(String[] pair:pairs) {
	      inputMap.put(pair[0],pair[1]);      
	    }
	    List<String> keyList = new ArrayList<>(inputMap.keySet());
	    List<String> valueList = new ArrayList<>(inputMap.values());
	    keyList.removeAll(valueList);
	    String start = keyList.get(0);
	    outputList.add(start);
	    while(start!="" && outputList.size()<inputMap.size()) {
	      start=inputMap.get(start);
	      outputList.add(start);
	    }
	    return outputList.get((outputList.size()/2));
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		karat_AllCoursesCanbeTaken prereq = new karat_AllCoursesCanbeTaken();
		String[][] pairs1 = {
			{"Foundations of Computer Science", "Operating Systems"},
			{"Data Structures", "Algorithms"},
			{"Computer Networks", "Computer Architecture"},
			{"Algorithms", "Foundations of Computer Science"},
			{"Computer Architecture", "Data Structures"},
			{"Software Design", "Computer Networks"}
		};
		
		System.out.println(prereq.halfway_course(pairs1));

	}

}
