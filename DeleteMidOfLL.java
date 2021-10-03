package LinkedList;

import LinkedList.LinkedList.*;
public class DeleteMidOfLL {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.head = delete(ll.head);
		ll.display();
	}
	static Node delete(Node node){
		if(node==null||node.next==null) return null;
		Node slow = node;
		Node fast = node;
		Node tail = slow;
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			tail = slow;
			slow = slow.next;
		} 
		tail.next = slow.next;
		return node;
	}
}
