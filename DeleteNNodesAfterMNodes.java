package LinkedList;

import LinkedList.LinkedList.*;
public class DeleteNNodesAfterMNodes {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(9);
		ll.addLast(1);
		ll.addLast(3);
		ll.addLast(5);
		ll.addLast(9);
		ll.addLast(4);
		ll.addLast(10);
		ll.addLast(1);
		ll.head = delete(ll.head, 2, 1);
		ll.display();
	}
	static Node delete(Node node , int m, int n){
		if(m==0 && n==0) return node;
		if(m==0) return null;
		Node head = node;
		while(head!=null){
			int skip = m;
			// skipping
			while(head!= null && skip>1){
				head = head.next;
				skip--;
			}
			Node prev = head;
			if(head!=null){
				head = head.next;
			}
			int del = n;
			//delting
			while(head!=null && del>1){
				head = head.next;
				del--;
			}
			if(head!=null){
				Node next = head.next;
				head = head.next;
				prev.next = next;
			}else{
				prev.next = null;
			}
		}
		return node;
	}
}
