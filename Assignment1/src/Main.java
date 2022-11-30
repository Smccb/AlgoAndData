import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;//used for gui



/*Error handling for if user inputs not valid things into the text box*/

public class Main {
	
	//lookup tables for encoding/ decoding
	ArrayList<Character> SYMBOLS = new ArrayList<Character>();//holding symbols
	ArrayList<String> CODES = new ArrayList<String>();//holding codes calculated from tree
	static char PARENT_SYMBOL = '*';
	
	public static void main(String[] args) {
		//Gui gui = new Gui();//call to gui class
		//gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ArrayList<TreeNode> tn = new ArrayList<TreeNode>();//store letters
		
		try {
			tn = readFromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//createTree(letterFreq);
		
		
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
	//need to use bubble sort at end cause while making tree nodes your gonna mess up the order with parent nodes and need to reorder
	//--------------------------------------------
	
	
	
	//read file in to letters, freq arrayLists
	public static ArrayList<TreeNode> readFromFile() throws FileNotFoundException {
		//ArrayList<ArrayList> letterFreq = new ArrayList<ArrayList>();//store letters
		ArrayList<TreeNode> tn = new ArrayList<TreeNode>();
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
	    
	    int i = 0; 
	    //create leaf nodes
	    while(letters.size() > 0) {

	    	TreeNode child1 = new TreeNode(freq.get(i), letters.get(i));
	    	freq.remove(i);
	    	letters.remove(i);
	    	tn.add(child1);
	    	
	    	//if there is a second element left
	    	if(freq.size() >= 0) {
	    		TreeNode child2 = new TreeNode(freq.get(i), letters.get(i));
		    	freq.remove(i);
		    	letters.remove(i);
		    	tn.add(child2);
	    	}
	    	i++;
	    }  
	    return tn;
	}
	
	
	  /*  
	    int i = 0, freq1 = 0, freq2 = 0, freqTotal =0;
	    
	    while(letters.size() > 0) {
	    	//System.out.println(letters+" "+i);//check what is in letters array
	    	
	    	//create leaf nodes/child nodes
	    	TreeNode child1 = null;
	    	TreeNode child2 = null;
	    	freq1 = freq.get(i);
	    	child1 = new TreeNode(freq1, letters.get(i));
	    	freq.remove(i);
	    	letters.remove(i);
	    	tn.add(child1);
	    	
	    	//if there is a second element left
	    	if(freq.size() >= 0) {
	    		freq2 = freq.get(i);
		    	child2 = new TreeNode(freq2, letters.get(i));
		    	freq.remove(i);
		    	letters.remove(i);
		    	tn.add(child2);
	    	}
	    	
	    	freqTotal = freq1 + freq2;//get frequencies added for parent node
	    	
	    	int counter =0;
	    	for(int j =0; j < freq.size() ;j++) {
	    		if(freq.get(j) < freqTotal)
	    			counter++;
	    	}
	    	//System.out.print(counter);
	    	ArrayList<Character> tempL= new ArrayList<Character>();//store letters
			ArrayList<Integer> tempF= new ArrayList<Integer>();//store frequencies
	    	//freq.add(0);
	    	System.out.println(counter);
	    	
			int k=0;
	    	for(int j =0; j < freq.size();j++) {
	    		if(j == counter) {
	    			tempL.add(k, PARENT_SYMBOL);
	    			tempF.add(k, freqTotal);
	    			k++;
	    		}
	    		
	    			
	    		tempL.add(k, letters.get(j));
	    		tempF.add(k, freq.get(j));
	    		k++;
	    		//System.out.println(k);
	    	}
	    	
	    	freq = tempF;
	    	letters = tempL;
	    	
	    	System.out.println(freq);
	    }*/

	public static void createTree(ArrayList <TreeNode> tn) {
	   int i = 0, freq1 = 0, freq2 = 0, freqTotal =0;
	
	   while(tn.size() == 0) {
		   
		   
		   
		   i++;
	   }
	
	
	
	}
	   /* while(letters.size() > 0) {
	    	//System.out.println(letters+" "+i);//check what is in letters array
	    	
	    	//create leaf nodes/child nodes
	    	TreeNode child1 = null;
	    	TreeNode child2 = null;
	    	freq1 = freq.get(i);
	    	child1 = new TreeNode(freq1, letters.get(i));
	    	freq.remove(i);
	    	letters.remove(i);
	    	tn.add(child1);
	    	
	    	//if there is a second element left
	    	if(freq.size() >= 0) {
	    		freq2 = freq.get(i);
		    	child2 = new TreeNode(freq2, letters.get(i));
		    	freq.remove(i);
		    	letters.remove(i);
		    	tn.add(child2);
	    	}
	    	
	    	freqTotal = freq1 + freq2;//get frequencies added for parent node
	    	
	    	int counter =0;
	    	for(int j =0; j < freq.size() ;j++) {
	    		if(freq.get(j) < freqTotal)
	    			counter++;
	    	}
	    	//System.out.print(counter);
	    	ArrayList<Character> tempL= new ArrayList<Character>();//store letters
			ArrayList<Integer> tempF= new ArrayList<Integer>();//store frequencies
	    	//freq.add(0);
	    	System.out.println(counter);
	    	
			int k=0;
	    	for(int j =0; j < freq.size();j++) {
	    		if(j == counter) {
	    			tempL.add(k, PARENT_SYMBOL);
	    			tempF.add(k, freqTotal);
	    			k++;
	    		}
	    		
	    			
	    		tempL.add(k, letters.get(j));
	    		tempF.add(k, freq.get(j));
	    		k++;
	    		//System.out.println(k);
	    	}
	    	
	    	freq = tempF;
	    	letters = tempL;
	    	
	    	System.out.println(freq);
	    }
	}
	
	//sort frequency for array
	/*public static void bubbleSort(char[] letter, int[] freq){
        int n = freq.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (freq[j] > freq[j+1]) {
                    // swap arr[j+1] and arr[j]
                   int temp = freq[j];
                   char tempL = letter[j];
                   freq[j] = freq[j + 1];
                   letter[j] = letter[j + 1];
                   freq[j + 1] = temp;
                    letter[j + 1] = tempL;
                }
            }
        }
        for (int i = 0; i < freq.length-1; i++) {
			System.out.println(letter);
			System.out.println(freq);
		}
    }*/
	
	public void createLookUpTables() {
		
	}
	
	//takes in message and encodes into binary string, using look Up Tables
	public void encodeMessage(){
		
	}
	
	//takes in binary string and decodes it into a character message, using look Up Tables
	public void decodeMessage() {
		
	}
}


//using reffernce based array you can use bubble sort, need to sort because of parent nodes made.