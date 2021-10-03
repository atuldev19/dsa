package LinkedList;

import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class SubtractionUsingLL {
	public static void main(String[] args) {
		// Assumption 1st ll > 2nd ll
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.addLast(1);
		l1.addLast(2);
		l1.addLast(3);
		l1.addLast(4);
		l1.addLast(5);
		l1.addLast(6);
		l1.addLast(7);
		l2.addLast(7);
		l2.addLast(8);
		l2.addLast(9);
		l1.head = subtract(l1.head, l2.head);
		display(l1.head);
	}
	static void display(Node node){
		while(node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	static Node subtract(Node n1, Node n2){
		n1 = reverse(n1);
		n2 = reverse(n2);
		int s1 = getSize(n1);
		int s2 = getSize(n2);
		if(s1>s2){
			add0(n2,s1-s2);
		}else{
			add0(n1,s2-s1);
		}
		display(n1);
		display(n2);
		int carry = 0;
		Node temp = n1;
		Node tail = n1;
		while(n1!=null){
			if(n1.data-n2.data<0){
				n1.data =((n1.data+10+carry)-n2.data);	
				carry=-1;
			}else{
				n1.data = (n1.data+carry-n2.data);
				carry = 0;
			}
			if(n1.next==null){
				tail = n1;
			}
			n1  = n1.next;
			n2 = n2.next;
		}
		if(carry==-1){
			tail.data = tail.data*-1;
		}
		return reverse(temp);
		
		
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
