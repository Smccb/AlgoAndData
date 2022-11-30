public class StackReferenceBased implements StackInterface
{
  private TreeNode root;

  public StackReferenceBased()
  {
    root = null;
  }  // end default constructor
  //============================================================================
  //============================================================================
  //============================================================================

  public boolean isEmpty()
  {
    return root ==  null;
  }  // end isEmpty
//============================================================================
//============================================================================
//============================================================================

  public void push(TreeNode newTreeNode)
  {
    root = new TreeNode(newTreeNode, root);
  }  // end push
  //============================================================================
  //============================================================================
  //============================================================================

  public Object pop() throws StackException
  {
    if (!isEmpty())
    {
      TreeNode temp = root;
      root = root.getNext();
      return temp.getItem();
    }
    else
    {
      throw new StackException("StackException on " + "pop: stack empty");
    }  // end if
  }  // end pop
  //============================================================================
  //============================================================================
  //============================================================================

  public void popAll()
  {
    root = null;
  }  // end popAll

//============================================================================
//============================================================================
//============================================================================
  public Object peek() throws StackException
  {
    if (!isEmpty())
    {
      return root.getItem();
    }
    else
    {
      throw new StackException("StackException on " + "peek: stack empty");
    }  // end if

  } // end peek
//============================================================================
//============================================================================
//============================================================================

  
  //display stack
  public void displayStack(StackReferenceBased stack1) {
	  Node current = root;
	  while(current != null) {
		  System.out.println(current.getItem());
		  current = current.getNext();
	  }
  }
  
}  // end StackReferenceBased