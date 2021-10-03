package LinkedList;
import LinkedList.LinkedList.Node;
public class KReverseVariantII {
	public static void main(String[] args) {
		
	}
	static Node reverse(Node head, int k){
		if(head==null||head.next==null) return head;
		Node curr = head;
		Node next = head;
		Node prev = null;
		int count = 0;
		while(count<k && curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(next!=null) reverse(curr, k);
		return prev;
	}
}
