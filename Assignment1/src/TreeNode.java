//package BinaryTrees;

public class TreeNode
{
  private int item;
  private char charItem;
  private TreeNode leftChild;
  private TreeNode rightChild;

  public TreeNode(int newItem, char newCharItem)
  {
  // Initializes tree node with item and no children.
    item = newItem;
    charItem = newCharItem;
    leftChild  = null;
    rightChild = null;
  }  // end constructor

  public TreeNode(int newItem, char newCharItem,
                  TreeNode left, TreeNode right)
                  {
  // Initializes tree node with item and
  // the left and right children references.
    item = newItem;
    leftChild  = left;
    rightChild = right;
  }  // end constructor

  public Object getItem()
  {
  // Returns the item field.
    return item;
  }  // end getItem

  public void setItem(int newItem)
  {
  // Sets the item field to the new value newItem.
	  item  = newItem;
  }  // end setItem
  public Object getCharItem()
  {
  // Returns the item field.
    return charItem;
  }  // end getItem

  public void setCharItem(char newCharItem)
  {
  // Sets the item field to the new value newItem.
  charItem  = newCharItem;
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