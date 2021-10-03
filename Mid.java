package LinkedList;

import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;

public class Mid {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		// ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		System.out.println(mid(ll).data);
	}
	public static Node mid(LinkedList ll){
		Node fast=ll.head;
		Node slow = ll.head;
		while(fast.next!=null && fast.next.next!=null){
			fast =fast.next.next;
			slow = slow.next;
		}
		return slow;

	}
}
