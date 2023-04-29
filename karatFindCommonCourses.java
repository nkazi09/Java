import java.util.*;

public class karatFindCommonCourses {
	/*
	#3
	You are a developer for a university. Your current project is to develop a system for students to find courses they share with friends. The university has a system for querying courses students are enrolled in, returned as a list of (ID, course) pairs.
	
	Write a function that takes in a collection of (student ID number, course name) pairs and returns, for every pair of students, a collection of all courses they share.
	
	Sample Input:
	hmap<Int,HashSet<String>>
	58: LA,Eco,Mech
	17: SD,PS,LA
	94: OSAH
	
	HashSet<Integer> 
	58,94,17,25
	
	58-17, 58-94, 58-25
	
	student_course_pairs_1 = [
	  ["58", "Linear Algebra"],
	  ["94", "Art History"],
	  ["94", "Operating Systems"],
	  ["17", "Software Design"],
	  ["58", "Mechanics"],
	  ["58", "Economics"],
	  ["17", "Linear Algebra"],
	  ["17", "Political Science"],
	  ["94", "Economics"],
	  ["25", "Economics"],
	  ["58", "Software Design"],
	]
	
	Sample Output (pseudocode, in any order):
	
	find_pairs(student_course_pairs_1) =>
	{
	  "58,17": ["Software Design", "Linear Algebra"]
	  "58,94": ["Economics"]
	  "58,25": ["Economics"]
	  "94,25": ["Economics"]
	  "17,94": []
	  "17,25": []
	}

 */
	public static void findCommonCourses(String[][] enrollments) {
		String[][] enrollments1 = {
                {"58", "Linear Algebra"},
                {"94", "Art History"},
                {"94", "Operating Systems"},
                {"17", "Software Design"},
                {"58", "Mechanics"},
                {"58", "Economics"},
                {"17", "Linear Algebra"},
                {"17", "Political Science"},
                {"94", "Economics"},
                {"25", "Economics"},
                {"58", "Software Design"},
             };
		 Map<String,Set<String>> output = new HashMap<>();
		  Map<String,Set<String>> eIdCourses = new HashMap<>();
		  
		  for(String[] enrollment:enrollments) {
		    eIdCourses.putIfAbsent(enrollment[0],new HashSet<String>());
		    eIdCourses.get(enrollment[0]).add(enrollment[1]);
		  }
		  
		  List<String> enrolList = new ArrayList<>(eIdCourses.keySet());
		  
		  for(int i=0;i<enrolList.size();i++) {
		    for(int j=i+1;j<enrolList.size();j++) {
		      output.putIfAbsent(enrolList.get(i)+","+enrolList.get(j),new HashSet<String>());
		      Set<String> input1 = new HashSet<>(eIdCourses.get(enrolList.get(i)));
		      Set<String> input2 = new HashSet<>(eIdCourses.get(enrolList.get(j)));
		      input1.retainAll(input2);
		      output.get(enrolList.get(i)+","+enrolList.get(j)).addAll(input1);
		    }
		  }
		  
		  Map<String,Set<String>> output = findCommonCourses(enrollments);
		  output.forEach((k,v)->System.out.println(k+","+v));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] enrollments1 = {
		                          {"58", "Linear Algebra"},
		                          {"94", "Art History"},
		                          {"94", "Operating Systems"},
		                          {"17", "Software Design"},
		                          {"58", "Mechanics"},
		                          {"58", "Economics"},
		                          {"17", "Linear Algebra"},
		                          {"17", "Political Science"},
		                          {"94", "Economics"},
		                          {"25", "Economics"},
		                          {"58", "Software Design"},
		                       };
		
	

		
		karatFindCommonCourses cc = new karatFindCommonCourses();
		cc.findCommonCourses(enrollments1);
	}

}
