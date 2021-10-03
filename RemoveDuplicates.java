package LinkedList;

import LinkedList.LinkedList.*;
public class RemoveDuplicates {
	static Node removeDup(Node node){
        if(node==null||node.next==null) return node;
        Node prev = null;
        Node curr = node;
        Node next = node;
        while(curr!=null){
            next = curr.next;
            if(next!=null && next.data==curr.data){
                curr = next;
            }else{
                if(prev==null){
                    prev = curr;
                    node = prev;
                }else{
                    prev.next = curr;
                    prev = curr;
                }
                curr = next;
            }
        }
        return node;
    }
}
