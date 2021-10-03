package LinkedList;
import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class Reverse {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		ll.display();
		reverseRecursive(ll);
		ll.display();
	}
	static void reverseIterative(LinkedList ll){
		Node prev, curr, next;
		prev = null;
		curr=next=ll.head;
		ll.tail = curr;
		while(curr!=null ){
			next = next.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		ll.head = prev;

	}
	static void reverseRecursive(LinkedList ll){
		Node temp = ll.head;
		ll.head = reverseRecuriveHelp(ll.head);
		ll.tail = temp;
	}
	static Node reverseRecuriveHelp(Node node){
		if(node==null||node.next==null) return node;
		Node head = reverseRecuriveHelp(node.next);
		node.next.next = node;
		node.next = null;
		return head;
	}

}
