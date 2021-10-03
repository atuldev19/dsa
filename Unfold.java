package LinkedList;
import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class Unfold {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(5);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.display();
		unfold(ll);
		display(ll.head);
	}
	static void unfold(LinkedList ll){
		unfoldHelp(ll.head);
	}
	static void unfoldHelp(Node node){
		if(node==null|| node.next==null){
			return;
			//nothing to unfold in a list of size 0 or 1
		}
		Node fh = node;//first head
		Node fp = fh;// first previous

		Node sh = node.next;// second head
		Node sp = sh;//second previous

		while(sp!=null && sp.next!=null){
			// backup
			Node f = sp.next;
			// links
			fp.next = f;
			sp.next = f.next;
			// move
			fp = fp.next;
			sp = sp.next;
		}
		fp.next = null;
		sh = Reverse.reverseRecuriveHelp(sh);
		fp.next = sh; 
	}
	static void display(Node node){
		while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
}
