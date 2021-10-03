package LinkedList;
import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class MergeSort {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(7);
		ll.addFirst(1);
		ll.addFirst(0);
		ll.addFirst(19);
		ll.addFirst(5);
		Node head = mergeSort(ll.head);
		ll.head = head;
		ll.display();
		
	}
	static Node mid(Node node){
		Node slow, fast;
		fast = slow = node;
		while(fast.next!=null && fast.next.next!=null){
			fast =fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	static Node mergeSort(Node node){
		if(node==null||node.next==null) return node;
		Node m = mid(node);//mid of Linked list
		Node mn = m.next;//next of mid
		m.next = null;
		Node l = mergeSort(node);
		Node r = mergeSort(mn);
		Node head = merge(l, r);
		return head;
	}
	static Node merge(Node n1, Node n2){
		if(n1==null) return n2;
		if(n2==null) return n1;
		if(n1.data<n2.data){
			n1.next = merge(n1.next, n2);
			return n1;
		}else{
			n2.next = merge(n1, n2.next);
			return n2;
		}
	}
}
