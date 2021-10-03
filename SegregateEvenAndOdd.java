package LinkedList;
import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class SegregateEvenAndOdd {
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
		display(ll.head);
		ll.head = separate(ll.head);
		display(ll.head);
	}
	static void display(Node head){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	static Node separate(Node head){
		if(head==null || head.next==null) return head;
		Node eh = null;
		Node ev = head;
		Node oh = null;
		Node ot = head;
		Node curr = head;
		Node next = head;
		while(next!=null){
			next = curr.next;
			if(curr.data%2==0){
				// add after ev
				if(eh==null){
					eh = curr;
					ev = curr;
				}else{
					ev.next = curr;
					ev = ev.next;
				}	

			}else{
				if(oh==null){
					oh = curr;
					ot = curr;
					curr.next = null;
				}
				// add at tail
				else{
					ot.next = curr;
					curr.next = null;
					ot = ot.next;
				}

			}
			curr = next;
		}
		ev.next = oh;
		ot.next = null;
		return eh;
	}
}
