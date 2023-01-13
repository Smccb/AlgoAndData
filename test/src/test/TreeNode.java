package test;
//package BinaryTrees;

public class TreeNode
{
  private int freq;
  private char symbol;
  private TreeNode leftChild;
  private TreeNode rightChild;

  public TreeNode(int newFreq, char newSymbol)
  {
  // Initializes tree node with item and no children.
    freq = newFreq;
    symbol = newSymbol;
    leftChild  = null;
    rightChild = null;
  }  // end constructor
 
  public TreeNode(int newFreq, char newSymbol,
                  TreeNode left, TreeNode right)
                  {
  // Initializes tree node with item and
  // the left and right children references.
    freq = newFreq;
    symbol = newSymbol;
    leftChild  = left;
    rightChild = right;
  }  // end constructor

  public int getFreq()
  {
  // Returns the item field.
    return freq;
  }  // end getItem

  public void setFreq(int newFreq)
  {
  // Sets the item field to the new value newItem.
  freq  = newFreq;
  }  // end setItem
  
  public char getSymbol()
  {
  // Returns the item field.
    return symbol;
  }  // end getItem

  public void setSymbol(char newSymbol)
  {
  // Sets the item field to the new value newItem.
  symbol  = newSymbol;
  }

  public TreeNode getLeft()
  {
  // Returns the reference to the left child.
    return leftChild;
  }  // end getLeft

  public void setLeft(TreeNode left)
  {
  // Sets the left child reference to left.
    leftChild  = left;
  }  // end setLeft

  public TreeNode getRight()
  {
  // Returns the reference to the right child.
    return rightChild;
  }  // end getRight

  public void setRight(TreeNode right)
  {
  // Sets the right child reference to right.
    rightChild  = right;
  }  // end setRight
}  // end TreeNode