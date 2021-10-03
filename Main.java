package LinkedList.LinkedList;

public class Main {
	public static void main(String[] args)throws Exception{
		LinkedList ll = new LinkedList();
		ll.addFirst(12);
		// ll.deleteFirst();
		ll.addLast(100);
		ll.addFirst(45);
		// System.out.println(ll.size);
		ll.addPosition(122, 3);
		ll.display();
		ll.deleteAtPosition(2);
		// System.out.println(ll.size);
		// ll.display();
		// ll.deleteLast();
		ll.display();
	}
}
