package LinkedList;

import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class Add2LL {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.addLast(1);
		l2.addLast(1);
		l2.addLast(9);
		l2.addLast(9);
		l2.addLast(9);
		Node ans = add(l1.head, l2.head);
		display(ans);
	}
	static void display(Node node){
		while(node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	static Node add(Node n1, Node n2){
		n1 = reverse(n1);
		n2 = reverse(n2);
		int s1 = getSize(n1);
		int s2 = getSize(n2);
		if(s1>s2){
			add0(n2,s1-s2);
		}else{
			add0(n1,s2-s1);
		}
		int carry = 0;
		Node tail = n1;
		// display(n1);
		// display(n2);
		while(n1!=null){
			int temp = n1.data;
			n1.data = (n2.data+temp+carry)%10;
			carry = (n2.data+temp+carry)/10;
			if(n1.next==null && carry!=0){
				n1.next = new Node(carry);
				break;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		return reverse(tail);
		
	}
	static void add0(Node n, int s){
		Node temp = n;
		while(temp.next!=null){
			temp = temp.next;
		}
		while(s>0){
			temp.next = new Node(0);
			temp = temp.next;
			s--;
		}
	}
	static int getSize(Node n1){
		int ans =0 ;
		while(n1!=null){
			n1 = n1.next;
			ans++;
		}
		return ans;
	}
	static Node reverse(Node n1){
		if(n1==null||n1.next==null) return n1;
		Node node = reverse(n1.next);
		n1.next.next = n1;
		n1.next=null;
		return node;
	}
	
}
