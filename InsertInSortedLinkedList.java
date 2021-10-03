package LinkedList;
import LinkedList.LinkedList.*;
public class InsertInSortedLinkedList {
	public static void main(String[] args) {
		
	}
	public static Node sortedInsert(Node head,int data)
         {
            //add code here.
            Node node = new Node(data);
            if(head==null){
                head = node;
                head.next = head;
                return head;
            }
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            if(head.data>=data){
                node.next = head;
                head = node;
                temp.next = head;
                return head;
            }
            temp = head;
            while(temp.next!=head && temp.data<=data && temp.next.data<=data){
                temp = temp.next;
            }
            if(temp.next==head){
                temp.next = node;
                node.next = head;
            }
            else{
                Node t = temp.next;
                temp.next = node;
                node.next =t;
            }
            return head;
            
         }
}
