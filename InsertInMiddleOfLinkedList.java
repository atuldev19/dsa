package LinkedList;
 import LinkedList.LinkedList.*;
public class InsertInMiddleOfLinkedList {
	public static void main(String[] args) {
		
	}
	static Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list\
        Node node = new Node(data);
        if(head==null){
            head = node;
            return head;
        }
        if(head.next==null){
            head.next = node;
            return head;
        }
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = node;
        node.next = temp;
        return head;
    }
}
