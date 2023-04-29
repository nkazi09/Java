
public class separate_the_files_hackerrank {

	pubi
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		BufferedReader bufReader = new BufferedReader(new FileReader("file.txt"));
	    ArrayList<String> listOfLines = new ArrayList<>();

	    String line = bufReader.readLine();
	    while (line != null) {
	      listOfLines.add(line);
	      line = bufReader.readLine();
	    }

	    bufReader.close();
	    
	    
	    
	    Writer writer_c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filename.txt"), "utf-8"));
	    Writer writer_cpp = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filename.txt"), "utf-8"));
	    Writer writer_cs = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filename.txt"), "utf-8"));
	       writer_cs.close);
	}

	
	File file_c = new File("c_" + baseFileName);
	file_c.createNewFile();
	File file_cpp = new File("cpp_" + baseFileName);
	file_cpp.createNewFile();
	File file_cs = new File("cs_" + baseFileName);
	file_cs.createNewFile();

	FileWriter writer_c = new FileWriter("c_" + baseFileName);
	FileWriter writer_cpp = new FileWriter("cpp_" + baseFileName);
	FileWriter writer_cs = new FileWriter("cs_" + baseFileName);
	
	
}

File myObj = new File("filename.txt");
myObj.createNewFile(
