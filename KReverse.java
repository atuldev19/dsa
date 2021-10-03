package LinkedList;
import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;


public class KReverse {
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
		ll.addLast(9);
		ll.head = kReverse(ll.head, 2);
		display(ll.head);

	}
	static void display(Node node){
		while(node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	static int length(Node node){
		int ans=0;
		while(node!=null){
			ans++;
			node=node.next;
		}
		return ans;
	}
	static Node th = null;
	static Node tt = null;
	static void addFirstNode(Node node){
		if(th==null){
			th=node;
			tt = node;
		}else{
			node.next = th;
			th = node;
		}
	}
	static Node kReverse(Node head, int k){
		if(head==null||head.next==null||k<=0) return head;
		// if k==1, reverse the whole list
		int len = length(head);
		Node oh = null, ot= null;
		Node curr = head;
		while(len>=k){
			int tempK = k;
			while(tempK>0){
				Node forw = curr.next;
				curr.next = null;
				addFirstNode(curr);
				curr = forw;
				tempK--;
			}
			len-=k;
			if(oh==null){
				oh = th;
				ot = tt;
			}else{
				ot.next = th;
				ot = tt;
			}
			th = null;
			tt = null;
		}
		ot.next = curr;// whatever's left
		return oh;
	}
}
