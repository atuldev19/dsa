package LinkedList;
import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class Merge2SortedLL {
	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		ll1.addLast(1);
		ll1.addLast(3);
		ll1.addLast(5);
		ll1.addLast(6);
		ll1.addLast(8);
		LinkedList ll2 = new LinkedList();
		ll2.addLast(2);
		ll2.addLast(4);
		ll2.addLast(7);
		
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
