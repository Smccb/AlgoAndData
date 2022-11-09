import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try {
			readFromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//read file in + create tree node object
	public static TreeNode readFromFile() throws Exception {
		List<String> treeNodeList = new ArrayList();
		
		BufferedReader reader = new BufferedReader(new FileReader("LetterCountAscending.txt"));
		
		
		Object st;
		st = reader.readLine();
		
		char charItem = ((String) st).charAt(0);
		/*int i=1, j=0; char [] temp = null;
		while(i < st.length()) {
			
			if(st.charAt(i) != '	') {
				
				System.out.println("character: "+ st.charAt(i));
				
				temp[j] = st.charAt(i);
				j++;
			}
			i++;
		}*/
		 
		
		//int itemFreq = ;
		//TreeNode  name= new TreeNode(itemFreq, charItem);
		
		/*list.add();
		
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		return null;
	}
	
	
	public void createTree() {
		
	}
}
