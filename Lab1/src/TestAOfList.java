
public class TestAOfList {
	public static void main(String[] args) {
		ListArrayBased aList = new ListArrayBased();
		
		//testing isEmpty
		System.out.println("Is aList Empty: " + aList.isEmpty());
		aList.add(1, "milk");
		aList.add(2, "hello");
		aList.add(3, "world");
		System.out.println("Is aList Empty: " + aList.isEmpty());
		System.out.println("aList size is " + aList.size());
		displayList(aList);
		aList.remove(1);
		System.out.println("item removed");
		displayList(aList);
		System.out.println("remove all items");
		aList.removeAll();
		
	}
	
	public static void displayList(ListArrayBased aList) {
		for (int i = 1; i <= aList.size(); i++) {
			System.out.println("item at index " + i + " is "+ aList.get(i));
		}
	}
}
