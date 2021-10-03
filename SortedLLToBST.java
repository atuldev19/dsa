package LinkedList;

import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
import LinkedList.LinkedList.TreeNode;
public class SortedLLToBST {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(0);
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.display();
	}
	public static TreeNode convert(Node head){
		if(head==null||head.next==null) return new TreeNode(head.data);
		Node slow = head;
		Node fast = head;
		Node tail = slow;
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			tail = slow;
			slow = slow.next;
		}
		TreeNode root = new TreeNode(slow.data);
		tail.next = null;//previous of mid
		root.left = convert(head);
		root.right = convert(slow.next);
		return root;
	}
}
