package LinkedList;

import LinkedList.LinkedList.LinkedList;
import LinkedList.LinkedList.Node;

public class MergeListsAlternately {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.addLast(1);
		l1.addLast(1);
		l1.addLast(1);
		l1.addLast(1);
		l1.addLast(1);
		l1.addLast(1);
		l2.addLast(2);
		l2.addLast(2);
		l2.addLast(2);
		l2.addLast(2);
		l1.head = merge(l1.head, l2.head, 0);
		l1.display();
	}
	static Node merge(Node n1, Node n2, int level){
		if(n1==null) return n2;
		if(n2==null) return n1;
		if(level%2==0){
			n1.next = merge(n1.next, n2, level+1);
			return n1;
		}else{
			n2.next = merge(n1, n2.next, level+1);
			return n2;
		}
	}
}
