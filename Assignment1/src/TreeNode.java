//package BinaryTrees;

public class TreeNode
{
  /*private int itemFreq;
  private char charItem;*/
  private Object item;
  private TreeNode leftChild;
  private TreeNode rightChild;

  public TreeNode(int newItem)
  {
  // Initializes tree node with item and no children.
    /*itemFreq = newItem;
    charItem = newCharItem;*/
	item = newItem;
    leftChild  = null;
    rightChild = null;
  }  // end constructor

  public TreeNode(int newItem,TreeNode left, TreeNode right)
                  {
  // Initializes tree node with item and
  // the left and right children references.
    //itemFreq = newItem;
	item = newItem;
    leftChild  = left;
    rightChild = right;
  }  // end constructor

  public Object getItem()
  {
  // Returns the item field.
    //return itemFreq;
	  return item;
  }  // end getItem

  public void setItem(int newItem)
  {
  // Sets the item field to the new value newItem.
	 // itemFreq  = newItem;
	  item = newItem;
  }  // end setItem
  /*public Object getCharItem()
  {
  // Returns the item field.
    return charItem;
  }  // end getItem

  public void setCharItem(char newCharItem)
  {
  // Sets the item field to the new value newItem.
  charItem  = newCharItem;
  }*/
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