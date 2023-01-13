package test;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<TreeNode> temp  = new ArrayList<TreeNode>();
		
		TreeNode n1  = new TreeNode(5, '*');
		TreeNode n2  = new TreeNode(4, '*');
		TreeNode n3  = new TreeNode(2, '*');
		TreeNode n4  = new TreeNode(8, '*');
		TreeNode n5  = new TreeNode(1, '*');
		TreeNode n6  = new TreeNode(3, '*');
		
		
		temp.add(n1); temp.add(n2); temp.add(n3); temp.add(n4); temp.add(n5);temp.add(n6);
		
		for(int k = 0; k < temp.size() ;k++)
			System.out.print(temp.get(k).getFreq());
		
		bubbleSort(temp);
		
		System.out.println();
		
		
		
	}
	public static ArrayList<TreeNode> bubbleSort(ArrayList<TreeNode> temp){
		TreeNode []copy = new TreeNode[temp.size()];
		
		for(int k =0; k < copy.length; k++) {
			copy[k] = temp.get(k);
		}
		
		/*int n = temp.size();
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
				if(temp.get(j).getFreq() > temp.get(j=1).getFreq()) {
					TreeNode tempTN = temp.get(j);
					temp.add(j, temp.get(j+1));
					temp.add(j + 1, tempTN);
					System.out.println(temp.get(i).getFreq());
				}
            }
		}*/
		int n = temp.size();
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
				if(copy[j].getFreq() > copy[j=1].getFreq()) {
					TreeNode tempTN = copy[j];
					copy[j] =  copy[j+1];
					copy[j + 1] =  tempTN;
				}
            }
           // System.out.println("hellor");//Doesn't get this far
		}
		
		for(int k =0; k < copy.length; k++) {
			temp.removeAll(temp);
			//copy[k] = temp.get(k);
			temp.add(k,  copy[k]);
		}
		
		for(int k = 0; k < temp.size() ;k++)
			System.out.print(temp.get(k).getFreq());
		
		return temp;
	}
}
