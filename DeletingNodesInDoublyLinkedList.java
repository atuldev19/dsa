package LinkedList;

import LinkedList.LinkedList.*;
public class DeletingNodesInDoublyLinkedList {
	public static void main(String[] args) {
		
	}
	static DLL delete(DLL node, int x){
		{
		// Your code here
		 DLL temp = node;
			if(node==null) return null;
			while(node!=null && x>1){
				node = node.next;
				x--;
			}
			if(node!=null && node.next!=null && node.prev!=null){
				DLL t = node.prev;
				node.prev.next = node.next;
				node.next.prev = t;
			}
			else if(node.prev==null){
				temp = node.next;
				node.next=null;
			}
			else if(node.next==null){
				node.prev.next = null;
			}
			return temp;

	}
}}
