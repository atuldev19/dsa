package LinkedList;

import LinkedList.LinkedList.*;
public class SortADoublyLinkedList {
	public static void main(String[] args) {
		
	}
	static DLL sort(DLL node){
		if(node==null||node.next==null) return node;
		DLL mid = mid(node);
		DLL left = sort(node);
		DLL right = sort(mid);
		return merge(left, right);
	}
	static DLL merge(DLL n1,DLL n2){
		if(n1==null) return n2;
		if(n2==null) return n1;
		if(n1.data>n2.data){
			n1.next = merge(n1.next, n2);
			n1.next.prev = n1;//updating previous link of next node;
			n1.prev=null;// first node 
			return n1;
		}else{
			n2.next = merge(n1, n2.next);
			n2.next.prev = n2;//updating previous link of next node;
			n2.prev=null;// first node 
			return n2;
		}
	}
	static DLL mid(DLL node){
		if(node==null) return null;
		DLL fast = node;
		DLL slow = node;
		while(fast.next!=null && fast.next.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		DLL temp = slow.next;
		slow.next = null;
		return temp;
	}

}
