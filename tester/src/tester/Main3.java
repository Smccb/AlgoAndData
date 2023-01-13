package tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import TreeNode;

public class Main3 {

	ArrayList<Character> SYMBOLS = new ArrayList<Character>();//holding symbols
	ArrayList<String> CODES = new ArrayList<String>();//holding codes calculated from tree
	static char PARENT_SYMBOL = '*';

	static ArrayList<Character> letters;
	static ArrayList<Integer> freq;
	static ArrayList<TreeNode> temp = new ArrayList<TreeNode>();
	
	public static void main(String[] args) {
		//ArrayList<TreeNode> temp = new ArrayList<TreeNode>();
		TreeNode root;
		try {
			readFromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//if (!(letters == null) && !(freq == null)) {
		//temp = createArray(temp);
			//root = createTree(temp);
			
			System.out.println(root = createTree());
		//}
	}
	
	private static TreeNode createTree() {
	
		//create array of child nodes
		while(letters.size() > 0) {
	    	TreeNode child1 = new TreeNode(freq.get(0), letters.get(0));
	    	freq.remove(0);
	    	letters.remove(0);
	    	temp.add(child1);
	    	
	    	//if there is a second element left
	    	//if(freq.size() >= 0) {
	    		TreeNode child2 = new TreeNode(freq.get(0), letters.get(0));
		    	freq.remove(0);
		    	letters.remove(0);
		    	temp.add(child2);
	    	//}
		}
		System.out.println(temp.size());
		
		TreeNode root = new TreeNode((temp.get(0).getFreq()+temp.get(1).getFreq()), PARENT_SYMBOL, temp.get(0), temp.get(1));
		//TreeNode root = new TreeNode((freq.get(0)+freq.get(1)), PARENT_SYMBOL, new TreeNode(freq.get(0), letters.get(0)), new TreeNode(freq.get(1), letters.get(1)));;
			TreeNode currentRoot = null;
			System.out.println(temp.size());
	    	while(temp.size() > 0) {
	    		System.out.println(temp.size());	
	    		currentRoot = new TreeNode((freq.get(0)+freq.get(1)), PARENT_SYMBOL, temp.get(0), temp.get(1));
	    		
	    		//System.out.println(temp.size());
	    		temp.remove(0); temp.remove(1);
	    		
	    		temp.add(0, currentRoot);
	    		System.out.println(temp);
	    		
	    		//temp = bubbleSort(temp);
	    		sortThis(temp);
	    		System.out.println(temp);
	    		
	    	}
	    	//root = currentRoot;
	    	root = currentRoot;
		return root;
	}
	
	/*public static ArrayList<TreeNode> bubbleSort(ArrayList<TreeNode> temp){
		int n = temp.size();
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
				if(temp.get(j).getFreq() > temp.get(j=1).getFreq()) {
					TreeNode tempTN = temp.get(j);
					temp.add(j, temp.get(j+1));
					temp.add(j + 1, tempTN);
				}
            }
		}
		return temp;
	}*/
	
	public static void sortThis(ArrayList<TreeNode> temp){
		int n = temp.size();
		for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - i - 1; j++) {
					if(temp.get(j).getFreq() > temp.get(j+1).getFreq()) {
					TreeNode tempTN = temp.get(j);
					temp.remove(j);
					temp.add(j+1, tempTN);
					}
				}
		}
	}
	
	/*public static void sortThis(ArrayList<TreeNode> temp ){
    	int freqTotal = temp.get(0).getFreq();
    	int counter =0;
    	
    	for(int j =1; j < freq.size() ;j++) {
    		if(temp.get(0).getFreq() < freqTotal)
    			counter++;
    	}
    	//System.out.print(counter);
    	ArrayList<TreeNode> tempSort= new ArrayList<TreeNode>();//store letters
		//ArrayList<Integer> tempF= new ArrayList<Integer>();//store frequencies
    	//freq.add(0);
    	System.out.println(counter);
    	
		int k=0;
    	for(int j =0; j < freq.size();j++) {
    		if(j == counter) {
    			//tempSort.add(k, PARENT_SYMBOL);
    			tempSort.add(k, temp.get(0));
    			k++;
    		}
    		
    			
    		
    		tempSort.add(k, temp.get(j+1));
    		k++;
    		//System.out.println(k);
    	}		
		//temp.removeAll(temp);
		temp = tempSort;
		System.out.println(temp);
		
	}*/
	
	/*public static ArrayList<TreeNode> bubbleSort(ArrayList<TreeNode> temp){
	int n = temp.size();
	for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
			if(temp.get(j).getFreq() > temp.get(j=1).getFreq()) {
				TreeNode tempTN = temp.get(j);
				temp.add(j, temp.get(j+1));
				temp.add(j + 1, tempTN);
			}
        }
	}
	return temp;
	}*/
	
	
	private static void readFromFile() throws FileNotFoundException {
		//ArrayList<ArrayList> letterFreq = new ArrayList<ArrayList>();//store letters
		letters= new ArrayList<Character>();//store letters
		freq= new ArrayList<Integer>();//store frequencies
		
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
	    in.close();
	}
}
