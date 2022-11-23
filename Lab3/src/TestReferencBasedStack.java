
public class TestReferencBasedStack {
	public static void main(String[] args) {
		StackReferenceBased stack1 = new StackReferenceBased();
		//String s = "{123{}";
		String s = "{ { } }";
		//String s = " ";
		//String s = "{ ";
		
		System.out.println("Is empty: " + stack1.isEmpty());
		stack1.push("Hello");
		stack1.push("World");
		stack1.push("!");
		System.out.println("Is empty: " + stack1.isEmpty());
		System.out.println("Peek stack: " + stack1.peek());
		stack1.pop();
		System.out.println("Peek stack: " + stack1.peek());
		stack1.displayStack(stack1);
		stack1.popAll();
		System.out.println("Is empty: " + stack1.isEmpty());
		
		isBalanced(s);
	}
	
	//is balanced
	  public static void isBalanced(String s) {
		  StackReferenceBased isBalanced = new StackReferenceBased();
		  
		  
		  boolean balancedSoFar = true;
		  int i=0;
		  
		  while(balancedSoFar == true  && i < s.length()) {
			  char ch = s.charAt(i);
			  i++;
			  if(ch == '{') {
				  isBalanced.push('{');
			  }
			  else if(ch == '}') {
				  if(!isBalanced.isEmpty()){
					  Object openBrace = '{';
					  openBrace = isBalanced.pop();
				  }
				  else {
					  balancedSoFar =false;
				  }
			  }
		  }
		  
		  if(balancedSoFar == true && isBalanced.isEmpty()) {
			  System.out.println("String has balanced brackets");
		  }
		  
		  else {
			  System.out.println("String does not have balanced brackets");
		  }
	 }
}
