package LinkedList;

import LinkedList.LinkedList.Node;
public class SplitACircularLinkedListInto2Halves {
	public static void main(String[] args) {
		
	}
	static Node n1 = null;
	static Node n2 = null;
	static void split(Node node){
		if(node==null) return;
		Node fast = node;
		Node slow = node;
		while(fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		// fast.next.next = null -> even length LL
		// fast.next = null -> odd length LL
		if(fast.next.next != null){
			fast = fast.next;// end of LL
		}
		n1 = node;
		if(node.next!=node){
			n2 = slow.next;//next of mid
		}
		slow.next = n1;
		fast.next = n2;
	}
}
