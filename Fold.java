package LinkedList;
import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;

public class Fold {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		ll.display();
		fold(ll);
		ll.display();

	}
	static void fold(LinkedList ll){
		left = ll.head;
		foldHelp(ll.head,0,ll.size());
		ll.tail = left;
		left.next = null;
	}
	static Node left;
	static void foldHelp(Node right,int level,int size){
		if(right==null) return;
		foldHelp(right.next,level+1,size);
		if(level>size/2){
			Node temp = left.next;
			left.next = right;
			right.next = temp;
			left = temp;
		}else if(level==size/2){
			left=right;
		}
	}
	
	
}
