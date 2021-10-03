package LinkedList;
import LinkedList.LinkedList.Node;
public class MergeKSortedLLUsingDNC {
	public static void main(String[] args) {
		
	}
	// T(k) = 2T(k/2) + kN(List obtained from left tree = k/2 and right tree = k/2) 
	// TC = O(K*N*log(k)) -> 5*(10^8)*log2(10 )
	static Node mergeKList(Node[] lists){
		if(lists.length==0) return null;
		return mergeKList(lists, 0, lists.length-1);
	}
	static Node mergeKList(Node[] lists, int si, int ei){
		if(ei<si) return null;
		if(ei==si) return lists[si];
		int mid = (ei+si)/2;
		Node l = mergeKList(lists, si, mid);
		Node r = mergeKList(lists, mid+1, ei);
		return merge2SortedLL(l, r);

	}
	// APPROACH1 - O(N*k*k)-> 10^13 time, wont work
	// APPROACH2 - O(N*k*logk) 
	static Node merge2SortedLL(Node n1,Node n2){
		if(n1==null) return n2;
		if(n2==null) return n1;
		if(n1.data>n2.data){
			n2.next = merge2SortedLL(n1, n2.next);
			return n2;
		}else{
			n1.next = merge2SortedLL(n1.next, n2);
			return n1;
		}
	}
	static Node merge2SortedLL2(Node n1, Node n2){
		if(n1==null) return n2;
		if(n2==null) return n1;
		Node dummy = new Node(-1);//head of the new LL
		Node prev = dummy;//new LL
		Node c1 = n1, c2 = n2;
		while(c1!=null && c2!=null){
			if(c1.data<c2.data){
				prev.next = c1;
				c1 = c1.next;
			}else{
				prev.next = c2;
				c2 = c2.next;
			}
			prev = prev.next;
		}
		if(c1!=null) prev.next = c1;
		else if(c2!=null) prev.next = c2;
		return dummy.next;

	}
}
