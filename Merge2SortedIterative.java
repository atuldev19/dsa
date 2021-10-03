package LinkedList;
import LinkedList.LinkedList.Node;
// import LinkedList.LinkedList.LinkedList;
public class Merge2SortedIterative {
	public static void main(String[] args) {
		
	}
	static Node merge(Node h1, Node h2){
		if(h1==null){
			return h2;
		}
		if(h2==null){
			return h1;
		}
		if(h1.data<h2.data){
			return mergeUtil(h1,h2);
		}
		return mergeUtil(h2, h1);
	}
	static Node mergeUtil(Node h1, Node h2){
		if(h1.next==null){
			//only one node in h1
			h1.next = h2;
			return h1;
		}
		Node curr1 = h1, next1 = h1.next;
		Node curr2 = h2, next2 = h2.next;
		while(next1!=null && curr2!=null){
			if(curr2.data>=curr1.data && curr2.data<=next1.data){
				next2 = curr2.next;
				curr1.next = curr2;
				curr2.next = next1;
				curr1 = curr2;
				curr2 = next2;
			}else{
				if(next1.next!=null){
					next1 = next1.next;
					curr1 = curr1.next;
				}else{
					next1.next = curr2;
					return h1;
				}
			}
		}
		return h1;
	}

}
