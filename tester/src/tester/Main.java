package tester;

import java.util.ArrayList;

public class Main {

	private static ArrayList<Character> letters = new ArrayList<>();
	private static ArrayList<Integer> freq = new ArrayList<>();
	
	public static void main(String[] args) {

		letters.add('a');letters.add('b');letters.add('c');
		letters.add('x');letters.add('y');letters.add('z');
		letters.add('m');
		
		freq.add(1890);freq.add(722);freq.add(936);
		freq.add(122);freq.add(593);freq.add(322);
		freq.add(638);
		
		System.out.println("Pre Sort\n");
		printLists();
		
		resort();
		
		System.out.println("\nPost Sort\n");
		printLists();
	}

	private static void resort() {
		int smallest;
		for (int i = 0; i<freq.size()-1; i++) {
			for (int j = freq.size()-1; j>0 ; j--) {
				smallest = freq.get(j);
				if (smallest < freq.get(j - 1)) {
					swap(j, j-1);
				} else {
					smallest = freq.get(j-1);
				}
			}
		}
	}
	
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
	
	private static void printLists() {
		for (int i=0; i<letters.size(); i++) {
			System.out.print(letters.get(i) + "\t");
			System.out.print(freq.get(i) + "\n");
		}
		System.out.println("\n");
	}

}

