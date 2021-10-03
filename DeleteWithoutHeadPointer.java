package LinkedList;

import LinkedList.LinkedList.*;
public class DeleteWithoutHeadPointer {
	public static void main(String[] args) {
		
	}
	static void delete(Node node){
		node.data = node.next.data;
		node.next = node.next.next;
	}
}
