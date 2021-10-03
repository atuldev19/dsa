package LinkedList;

import LinkedList.LinkedList.*;
public class DeleteAndReverseInLL {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(2);
		ll.addLast(5);
		ll.addLast(7);
		ll.addLast(8);
		ll.addLast(10);
		ll.tail.next = ll.head;
		ll.head = delete(ll.head, 8);
		display(ll.head);
	}
	static void display(Node node){
		Node temp = node;
		while(temp.next!=node){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print(temp.data+" ");

	}
	static Node delete(Node node, int data){
		if(node==null) return null;
		if(node.data==data && node.next==null) return null;
		Node temp = node;
		while(temp.next!=null && temp.next.data!=data){
			temp = temp.next;
		}
		temp.next = temp.next.next;
		Node ans =  reverse(node);
		node.next = ans;
		return ans;

	}
	static Node reverse(Node head){
		return reverseHelper(head,head);
	}
	static Node reverseHelper(Node node, Node head){
		if(node.next == head) return node;
		Node ans = reverseHelper(node.next, head);
		node.next.next = node;
		node.next = null;
		return ans;
	}
}
