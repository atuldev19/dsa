package LinkedList;
import LinkedList.LinkedList.Node;
public class RemoveDuplicate1 {
	public static void main(String[] args) {
		
	}
	static Node remove(Node head){
		Node node = new Node(Integer.MIN_VALUE);
		Node t1 = node.next;
		Node t2 = head;
		while(t2!=null){
			if(t1.data!=t2.data){
				t1.next = new Node(t2.data);
				t1 = t1.next;
			}
			t2 = t2.next;
		}
		return node.next;
	}
	static Node removeII(Node head){
		Node curr = head;
        Node next = head;
        Node prev = head;
        while(curr!=null){
            next = curr.next;
            if(next!=null && curr.data==next.data){
                curr = next;
            }
            else{
                prev.next = curr;
                prev = curr;
                curr = next;
            }
        }
        return head;
	}
}
