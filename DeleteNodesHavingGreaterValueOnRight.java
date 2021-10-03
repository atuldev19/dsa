package LinkedList;
import LinkedList.LinkedList.*;
public class DeleteNodesHavingGreaterValueOnRight {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(12);
		ll.addLast(15);
		ll.addLast(10);
		ll.addLast(11);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(2);
		ll.addLast(3);
		ll.head = delete(ll.head);
		ll.display();
	}
	static Node delete(Node node){
		//elegant solution
		if(node==null||node.next==null) return node;
		Node temp = delete(node.next);//returns max node value on right
		if(temp.data>node.data) return temp;
		else{
			node.next = temp;
			return node;
		}
	}
}
