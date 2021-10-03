package LinkedList;

import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class LinkedListThatIsSortedAlternately {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(9);
		ll.addLast(2);
		ll.addLast(8);
		ll.addLast(3);
		ll.addLast(7);
		ll.addLast(4);
		ll.head = sort(ll.head);
		ll.display();
	}
	static Node sort(Node node){
		if(node==null||node.next==null||node.next.next==null) return node;
		Node h1 = node;
		Node t1 = node;
		Node h2 = node.next;
		Node t2 = node.next;
		int level = 0;
		node = node.next.next;
		while(node!=null){
			Node next = node.next;
			if(level%2==0){
				t1.next = node;
				t1 = t1.next;
			}else{
				t2.next = node;
				t2 = t2.next;
			}
			node = next;
			level++;
		}
		t2.next=null;
		h2 = reverseRecuriveHelp(h2);
		t1.next = h2;
		return h1;
	}
	
	static Node reverseRecuriveHelp(Node node){
		if(node==null||node.next==null) return node;
		Node head = reverseRecuriveHelp(node.next);
		node.next.next = node;
		node.next = null;
		return head;
	}
}
