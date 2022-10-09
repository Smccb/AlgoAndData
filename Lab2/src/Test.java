
public class Test {
	public static void main(String[] args) {
		ListReferenceBased list = new ListReferenceBased();
		
		System.out.println("Is list Empty: " + list.isEmpty());
		list.add(1, 20);
		list.add(2, 100);
		list.add(3, 10);
		System.out.println("Is list Empty: " + list.isEmpty());
		System.out.println("list size is " + list.size());
		System.out.println("Item at index 2 is: " + list.get(2));
		list.displayList(list);
		System.out.println(list.listLargest(list));
		list.remove(2);
		System.out.println("list size is " + list.size());
		list.removeAll();
		System.out.println("list size is " + list.size());
	}
}
