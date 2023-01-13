import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;
import javax.swing.JFrame;

public class Main {

	//static ArrayList<ArrayList> lookUpTables = new ArrayList<ArrayList>();
	static ArrayList<Character> SYMBOLS = new ArrayList<Character>();//holding symbols
	static ArrayList<String> CODES = new ArrayList<String>();//holding codes calculated from tree
	
	static char PARENT_SYMBOL = '*';

	static ArrayList<Character> letters;
	static ArrayList<Integer> freq;
	
	public static void main(String[] args) {
		//lookUpTables.add(SYMBOLS);
		//lookUpTables.add(CODES);
		Gui gui = new Gui();//call to gui class
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TreeNode root;
		try {
			readFromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!(letters == null) && !(freq == null)) {//check if null
			root = createTree();//method creates tree
			System.out.println(root.getFreq());//prints roots frequency at the end
			
			//createlookUpTables(root);//method never got fully implemented so it is commented out
		}
	}
	
	//this basically just works like bubblesort, checks if vaue on left is bigger if so it swaps the order else it itterates to next value in arraylist
	//sorts through arrayLists freq and letters
	private static void resort() {
		int smallest;
		for (int i = 0; i<freq.size()-1; i++) {
			for (int j = freq.size()-1; j>0 ; j--) {
				smallest = freq.get(j);
				if (smallest < freq.get(j - 1)) {
					swap(j, j-1);//call to swap method
				} else {
					smallest = freq.get(j-1);
				}
			}
		}
	}
	
	//used in resort to switch the two values
	private static void swap(int x, int y) {
		int tempFreq;
		char tempLetter;
		
		tempFreq = freq.get(y);
		tempLetter = letters.get(y);
		
		freq.set(y, freq.get(x));
		letters.set(y, letters.get(x));
		
		freq.set(x, tempFreq);
		letters.set(x, tempLetter);
	}
	
	
	private static TreeNode createTree() {
		TreeNode root = null;
		TreeNode newRoot = null;
		ArrayList<TreeNode> parents = new ArrayList<>();//arraylist keeps track of some parent nodes because coulding find ference to parent nodes whena new sub tree was created
		
		while (!letters.isEmpty()) {
			//System.out.println("LOOP ENTERED");
			
			//runs when new root is a parent and root is qual to null
			if (letters.get(0) == '*' && root == null) {System.out.println("Opt 1");//debugging
				root = parents.get(0);//sets root to when item 0 on parents
				parents.remove(0);System.out.println("Parent removed");//debugging
				
				//removing child nodes created
				freq.remove(0);
				letters.remove(0);
			}
			
			//runs when root is a parent node and not null
			else if (letters.get(0) == '*' && root != null) {System.out.println("Opt 2");//debugging
				newRoot = new TreeNode((root.getFreq() + freq.get(0)), PARENT_SYMBOL, root, new TreeNode(freq.get(0), letters.get(0)));
				freq.remove(0);
				letters.remove(0);
				
				freq.add(0, newRoot.getFreq()); 
				letters.add(0, newRoot.getSymbol());
				
				parents.remove(0);System.out.println("Parent removed");//debugging
				parents.add(newRoot);
				System.out.println("Parent added");//debugging
				
				resort();//resort after added parent TreeNode frequency and symbol to tables
				
				root = null;
			}
			
			//runs when root is null
			else if (root == null) {System.out.println("Opt 3");//debugging
				root = new TreeNode(freq.get(0), letters.get(0));
				freq.remove(0);
				letters.remove(0);
			}
			//runs when root is not a parent node and not null
			else {System.out.println("Opt 4");//debugging
				newRoot = new TreeNode((root.getFreq() + freq.get(0)), PARENT_SYMBOL, root, new TreeNode(freq.get(0), letters.get(0)));
				freq.remove(0);
				letters.remove(0);
				
				freq.add(0, newRoot.getFreq()); 
				letters.add(0, newRoot.getSymbol());
				
				parents.add(newRoot);
				System.out.println("Parent added");//debugging
				
				
				resort();//resort after added parent TreeNode frequency and symbol to tables
				
				root = null;
			}
			printLists();//debugging
		}
		return root;//after tree generated returns root TreeNode
	}



	//reads in text file for freq table
	private static void readFromFile() throws FileNotFoundException {
		//ArrayList<ArrayList> letterFreq = new ArrayList<ArrayList>();//store letters
		letters= new ArrayList<Character>();//store letters
		freq= new ArrayList<Integer>();//store frequencies
		
		File file = new File("LetterCountAscending.txt");//createfile
		Scanner in = new Scanner(file);//read with scanner

	    while(in.hasNext()){//while there is more to read keep looping
	        String[] tokens = in.nextLine().split("\t");
	        String first = tokens[tokens.length -2];//letters string
	        String last = tokens[tokens.length - 1];//freq string
	        
	        letters.add(first.charAt(0));
	        int temp = Integer.parseInt(last);//parse through string to turn into integer
	        freq.add(temp);
	    }
	    in.close();//closes the scanner
	}
	
	//not properly implemented as ran out of time and was confused so commented out call in main
	private static void createlookUpTables(TreeNode root) {
		//traverse through binary Tree and push to stack
		StackReferenceBased stack = new StackReferenceBased();
		/*while() {
			stack.push(root);
		}*/
		stack.push(root);
		
		
		String code = "";//code string for each Symbol
		Character letter = ' ';//each character
		TreeNode newRoot = root;
		
		
		//loop through stack and till next is equal to null then store code string in code with matching character in SYMBOLS ArrayList
		int n= 26;
		while(n > 0) {
			if(newRoot.getLeft() != null) {
				code = code + 0;
			}
			
			if(newRoot.getRight() != null) {
				code = code + 1;
			}
			if(newRoot.getRight() == null && newRoot.getLeft() == null) {
				letter = newRoot.getSymbol();
				SYMBOLS.add(letter);
				CODES.add(code);
				n--;
				newRoot = root;
				//letter gotten
			}
		}
	}
	
	/*prints out list of frequency Arrays, this was for debugging while createing the createTree method to check what was being removed from tables 
	each time*/
	private static void printLists() {
		for (int i=0; i<letters.size(); i++) {
			System.out.print(letters.get(i) + "\t");
			System.out.print(freq.get(i) + "\n");
		}
		System.out.println("\n");
	}
	
	
	//planned to implement ran out of time, also wasn't too sure how to implement 
	private static void printTree(TreeNode root) {
		
	}
	
	
	//lookUp tables dont work so commented out calls in gui
	//takes in binary message from user and finds each character by looking through lookUp arrayLists and returnsString
	static String decoding(String binUserMessage){
		int i =0;
		String s = "";
		 while(i < binUserMessage.length()) {
			String sub =  binUserMessage.substring(i);//substring users message into codes
			 if(sub == CODES.get(i)) {
				 s = s + SYMBOLS.get(i);
			 }
		 }
		 return s;//return stringed symbols
	}

	//lookUp tables dont work so commented out call in gui
	//takes in character message and using lookUp tables created finds each characters code, returns the codes in an Array out to textBox
	public static String encoding(String charUserMessage) {
		int i =0;
		String s= "";
		 while(i < charUserMessage.length()) {
			 if(charUserMessage.charAt(i) == SYMBOLS.get(i)) {//check if matches SYMBOLS
				 s = s + CODES.get(i);//ADD code to string if it does
			 }
		 }
		return s;//return stringed codes
	}
}
