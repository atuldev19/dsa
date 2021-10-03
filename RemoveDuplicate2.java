package LinkedList;
import LinkedList.LinkedList.Node;
public class RemoveDuplicate2 {
	public static void main(String[] args) {
		
	}
	static Node remove(Node head){
		Node dummy = new Node(-1);// head can also be duplicate
			dummy.next = head;
			Node curr = dummy;
			while(curr.next !=null && curr.next.next!=null){
				if(curr.next.data==curr.next.next.data){
				int val = curr.next.data;
				curr.next = curr.next.next;
					while(curr.next!=null && curr.next.data==val){
						curr.next = curr.next.next;
					}
				}else{
					curr = curr.next;
				}
			}
			return dummy.next;
		}
}
