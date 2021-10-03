package LinkedList;
import LinkedList.LinkedList.Node;
public class SwapNodesOfLL {
	public Node swapNodes(Node head, int k) {
        if(head==null|| head.next==null) return head; 
        int size = size(head);
        if(k>size/2){
            k = size-k+1;
        }
        if(k==1){
            Node prev2 = kth(head,k);
            Node curr2 = prev2.next;
            prev2.next = head;
            curr2.next = head.next;
            head.next=null;
            head = curr2;
            return head;
            
        }
        Node prev2 = kth(head,k);
        Node prev1 = head;
        while(k>2){
            prev1 = prev1.next;
            k--;
        }
        Node curr1 = prev1.next;
        Node curr2 = prev2.next;
        Node next1 = curr1.next;
        Node next2 = curr2.next;
        // System.out.println(curr1.data+" "+curr2.data);
        if(curr1!=prev2){
            prev1.next = curr2;
            curr2.next = next1;
            prev2.next = curr1;
            curr1.next = next2;
        }else{
            prev1.next = curr2;
            curr1.next = next2;
            curr2.next = curr1;
        }
        return head;
    }
    public int size(Node node){
        int ans = 0;
        while(node!=null){
            ans++;
            node = node.next;
        }
        return ans;
    }
    public Node kth(Node node, int k){
        Node slow = node;
        Node fast = node;
        Node tail = slow;
        while(k>1){
            fast = fast.next;
            k--;
        }
        while(fast.next!=null){
            tail = slow;
            slow = slow.next;
            fast = fast.next;
        }
        return tail;
    }
}
