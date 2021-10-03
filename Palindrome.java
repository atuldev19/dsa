package LinkedList;
import LinkedList.LinkedList.Node;
import LinkedList.LinkedList.LinkedList;
public class Palindrome {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		head = ll.head;
		System.out.println(isPalindrome(ll.head));
	}
	static Node head;
	static boolean isPalindrome(Node node){
		if(node==null) return true;
		if(!isPalindrome(node.next)) return false;
		boolean flag = true;
		if(head.data!=node.data){
			flag = false;
		}
		head = head.next;
		return flag;
	}
}
