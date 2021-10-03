package LinkedList.LinkedList;


public class LinkedList {
	public Node head,tail;
	int size;
	public LinkedList(){
		head=tail=null;
		size=0;
	}
	// add
	// Add First
	public void addFirst(int data){
		Node node = new Node(data);
		size++;
		if(head==null){
			tail = head = node;
			return;
		}
		node.next = head;
		head = node;
	}
	public void addLast(int data){
		Node node = new Node(data);
		size++;
		if(head==null){
			head = tail = node;
			return;
		}
		tail.next = node;
		tail = node;
	}
	public void addPosition(int data, int pos) throws Exception{
		if(pos>size){
			throw new Exception("The Linked List doesn't have these many notes");
		}
		if(head==null && pos!=0){
			throw new Exception("The linked list is Empty, can't insert at that position");
		}
		if(head==null){
			addFirst(data);
			return;
		}
		if(pos==size){
			addLast(data);
			return;
		}
		Node node = new Node(data);
		Node temp = head;
		while(pos>1){
			temp = temp.next;
			pos--;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
	}
	// delete
	public void deleteFirst() throws Exception{
		if(head==null){
			throw new Exception("Linked List is Empty");
		}
		head = head.next;
		size--;
	}
	public void deleteLast() throws Exception{
		if(head==null){
			throw new Exception("Linked List is Empty");
		}
		Node temp = head;
		while(temp.next!=tail){
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
		size--;
	}
	public void deleteAtPosition(int pos) throws Exception{
		if(head==null){
			throw new Exception("List is Empty");
		}
		if(pos<0 || pos>=size){
			throw new Exception("Invalid Index");
		}
		Node temp = head;
		if(pos==0){
			deleteFirst();
			return;
		}
		if(pos==size-1){
			deleteLast();
			return;
		}
		while(pos>1){
			temp= temp.next;
			pos--;
		}
		temp.next = temp.next.next;
	}
	// size
	public int size(){
		return this.size;
	}
	// display
	public void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public Node get(int x){
		Node temp = head;
		while(x>0){
			x--;
			temp = temp.next;
		}
		return temp;
	}
}
