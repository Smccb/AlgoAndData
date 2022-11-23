import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		//Gui gui = new Gui();
		//gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		
		
		
		/*st = reader.readLine();
		
		char charItem = ((String) st).charAt(0);
		int i=1, j=0; char [] temp = new char[26];
		while(i < ((String) st).length()) {
			
			if(((String) st).charAt(i) != '	') {
				
				System.out.println("character: "+ ((String) st));
				
				temp[j] = ((String) st).charAt(i);
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
