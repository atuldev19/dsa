package LinkedList;

import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class ReverseInRange {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		ll.addLast(8);
		ll.addLast(9);
		ll.head = reverse(ll.head, 3, 7);
		display(ll.head);

	}
	static void display(Node node){
		while(node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	static Node reverse(Node node, int start, int end){
		Node head = null;
		Node curr = node;
		Node prev = null;
		Node next = curr;
		int count = 1;
		while(count<start-1){
			curr = curr.next;
			count++;
		}
		head = curr;
		Node currT = curr.next;
		curr = curr.next;
		count++;
		while(count<=end){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		head.next = prev;
		currT.next = next;
		return node;
	}
}
