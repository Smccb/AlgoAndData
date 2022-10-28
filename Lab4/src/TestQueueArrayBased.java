
public class TestQueueArrayBased {
	public static void main(String[] args) {
		QueueArrayBased queue1 = new QueueArrayBased();
		//String s ="sarah";  //not palandrone test
		String s = "wow";	//is palandrone test
		
		//testing methods from QueueArrayBased
		System.out.println("Is empty: " + queue1.isEmpty());
		queue1.enqueue(100);
		queue1.enqueue(100);
		queue1.enqueue(50);
		
		//calling method in QueueArrayBased
		queue1.displayQueue(queue1);
		System.out.println("\nIs Full: " + queue1.isFull());
		System.out.println(queue1.peek());
		queue1.dequeueAll();
		System.out.println("Is empty: " + queue1.isEmpty());
		
		//palandrone method
		System.out.println("Is plandrone: " + isPal(s));
	}

	public static boolean isPal(String s) {
		QueueArrayBased tempQueue = new QueueArrayBased();
		StackReferenceBased tempStack = new StackReferenceBased();
		
		//copy string to queue and stack
		 for(int i=0; i < s.length(); i++) {
			 tempQueue.enqueue(s.charAt(i));
			 tempStack.push(s.charAt(i));
		 }
		 
		 //check if plandrone
		 boolean charAreEqual = true;
		 while(!tempQueue.isEmpty() && charAreEqual == true) {
			 //remove items till queue is empty
			 char front = (char) tempQueue.dequeue();
			 char top = (char) tempStack.pop();
			 
			 if(front != top) {//set to false if not the same letter
				 charAreEqual = false;
			 }
		 }
		 return charAreEqual;
	}
}
