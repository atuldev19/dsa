package LinkedList;
import LinkedList.LinkedList.Node;
public class SplitLinkedListIntoParts {
	public Node[] splitListToParts(Node head, int k) {
        Node[] ans = new Node[k];
        int size = size(head);
        if(k>=size){
            int n=0;
            while(head!=null){
                Node temp = head.next;
                head.next= null;
                ans[n] = (head);
                head = temp;
                n++;
            }
            while(n<k){
                ans[n] = null;
                n++;
            }
           return ans; 
        }
        
        int rem = size%k;
        Node curr = head;
        for(int i=0;i<k;i++){
            int j =0;
            ans[i] =curr;
            Node next = curr;
            int tsize = size/k;
            if(rem>0){
                tsize += 1;
                rem--;
            }
            System.out.println(tsize);
            
            while(j<tsize-1 && next!=null){
                next = next.next;
                j++;
            }
            if(next!=null){
                curr = next.next;
                next.next = null;
            }
        }
        
        
        return ans;
    }
    public int size(Node node){
        int ans = 0;
        while(node!=null){
            ans++;
            node = node.next;
        }
        return ans;
    }
}
