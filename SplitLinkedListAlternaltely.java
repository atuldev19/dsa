package LinkedList;

import LinkedList.LinkedList.LinkedList;
import LinkedList.LinkedList.Node;
public class SplitLinkedListAlternaltely {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(0);
		ll.addLast(1);
		ll.addLast(0);
		ll.addLast(1);
		ll.addLast(0);
		ll.addLast(1);
		ll.addLast(0);
		ll.addLast(1);
		split(ll.head);
		display(n1);
		display(n2);
	}
	static void display(Node node){
		while(node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	static Node n1 = null;
	static Node n2 = null;
	static void split(Node node){
		if(node==null||node.next==null) return;
		int level = 0;
		n1 = node;
		n2 = node.next;
		Node t1 = n1;
		Node t2 = n2;
		while(node!=null){
			Node next = node.next;
			node.next=null;
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
		
	}
}
