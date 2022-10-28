import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
	}
	
	//read file in + create tree node object
	public TreeNode readFromFile() {
		
		BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
		String numLinesStr = reader.readLine();
		if (numLinesStr == null) throw new Exception("invalid file format");
		List<String> lines = new ArrayList<String>();
		int numLines = Integer.parseInt(numLinesStr);
		for (int i=0; i<numLines; i++) {
		  lines.add(reader.readLine());
		}
		
		return null;
	}
	
	
	public void createTree() {
		
	}
}
