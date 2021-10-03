package LinkedList;
import LinkedList.LinkedList.*;
public class AddInADoublyLL {
	public static void main(String[] args) {
		
	}
	static void insert(DLL head_ref, int x, int data){
		DLL node = new DLL(data);
		if(head_ref==null){
		    head_ref = node;
		}
		if(x==0){
		    node.next = head_ref;
		    head_ref.prev = node;
		    head_ref = node;
		}
		DLL temp = head_ref;
		while(temp!=null && x>0){
		    temp = temp.next;
		    x--;
		}
		if(temp!=null){
		    if(temp.next==null){
		        node.prev = temp;
		        temp.next = node;
		    }
		    else{
		        temp.next.prev = node;
		        node.next = temp.next;
		        node.prev = temp;
		        temp.next = node;
		      //  node.next.prev = node;
		    }
		}
	}
}
