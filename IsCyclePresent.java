package LinkedList;
import LinkedList.LinkedList.Node;
public class IsCyclePresent {
	public static void main(String[] args) {
		
	}
	static boolean hasCycle(Node node){
		if(node==null||node.next == null) return false;
		Node fast = node;
		Node slow = node;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast){
				return true;
			}
		}
		return false;
	
	}
}
