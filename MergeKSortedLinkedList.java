package LinkedList;
import LinkedList.LinkedList.Node;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLinkedList {
	public static void main(String[] args) {
		
	}
	static Node merge(int k, Node[] l){
		PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){

			@Override
			public int compare(Node o1, Node o2) {
				return o1.data-o2.data;
			}
			
		});	
		for(Node n:l){
			if(n!=null){
				pq.add(n);
			}
		}
		Node head = new Node(0);
		Node point = head;
		while(!pq.isEmpty()){
			point.next = pq.poll();
			point = point.next;
			Node next = point.next;
			if(next!=null){
				pq.add(next);
			}
		}
		return head.next;
		
	}
}
