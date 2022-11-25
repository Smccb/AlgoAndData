import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;//used for gui

public class Main {
	
	//lookup tables for encoding/ decoding
	ArrayList<Character> symbols = new ArrayList<Character>();//holding symbols
	ArrayList<String> codes = new ArrayList<String>();//holding codes calculated from tree
	
	public static void main(String[] args) {
		//Gui gui = new Gui();//call to gui class
		//gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			readFromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//reference based
	
	//-------------------------------
	
	/*notes*/
	//save in array and look up
	//only traverse once not everytime
	
	
	//char[] symbols
	//int codes[] -generate these ocnce globals
	
	
	//sybmobs(i)= roots.symbol;
	
	//codes(i) = current code;
	
	//i++; (codes for each symbol)-counter
	
	//builds lookup tables ie two arrays/ arraylists
	
	//parent is * for char and freq together
	//--------------------------------------------
	
	
	
	//read file in to letters, freq arrayLists
	public static void readFromFile() throws FileNotFoundException {
		ArrayList<Character> letters= new ArrayList<Character>();//store letters
		ArrayList<Integer> freq= new ArrayList<Integer>();//store frequencies
		
		File file = new File("LetterCountAscending.txt");
		Scanner in = new Scanner(file);

	    while(in.hasNext()){
	        String[] tokens = in.nextLine().split("\t");
	        String first = tokens[tokens.length -2];//letters string
	        String last = tokens[tokens.length - 1];//freq string
	        
	        
	        letters.add(first.charAt(0));
	        int temp = Integer.parseInt(last);
	        freq.add(temp);
	    }
		
		
	    //printing for testing
		for (int i = 0; i < letters.size(); i++) {
			System.out.println(letters.get(i));
			System.out.println(freq.get(i));
		}
	}

	public void createTree() {
		
	}
}


//using reffernce based array you can use bubble sort, need to sort because of parent nodes made.