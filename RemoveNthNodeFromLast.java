package LinkedList;
import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class RemoveNthNodeFromLast {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(7);
		ll.addLast(2);
		ll.addLast(6);
		ll.addLast(3);
		ll.addLast(5);
		ll.addLast(4);
		ans(ll.head, 2);
		ll.display();
	}
	static Node ans(Node head, int k){
		Node slow,fast;
		slow=head;
		fast=head;
		// System.out.println(slow.data);
		while(k>=1){
			fast = fast.next;
			k--;
		}
		while(fast.next!=null){
			fast = fast.next;
			slow = slow.next;
		}
		// System.out.println(slow.data);
		if(slow.next!=null){
			slow.next = slow.next.next;
		}
		return head;
		
	}

}
