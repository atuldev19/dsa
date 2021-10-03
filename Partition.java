package LinkedList;
import LinkedList.LinkedList.Node;
public class Partition {
	public static void main(String[] args) {
		
	}
	static Node partition(Node head, int x){
		if(head==null||head.next==null) return head;
        Node h1 = null;
        Node t1 = null;
        Node h2 = null;
        Node t2 = null;
        while(head!=null){
            Node next = head.next;
            head.next = null;
            if(head.data<x){
                if(h1==null){
                    h1 = new Node(head.data);
                    t1 = h1;
                }else{
                    t1.next = new Node(head.data);
                    t1 = t1.next;
                }
            }else{
                if(h2==null){
                    h2 = new Node(head.data);
                    t2 = h2;
                }else{
                    t2.next = new Node(head.data);
                    t2 = t2.next;
                }
            }
            head = next;
        }
        if(t1!=null){
             t1.next = h2;
        }
        return h1==null?h2:h1;
	}
}
