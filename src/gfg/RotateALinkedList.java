package gfg;

import resources.Node;

public class RotateALinkedList {
    public Node rotate(Node head, int k) {
        // add code here
        Node traverse = head;
        Node temp = head;
        Node h = head;
        int count = 1;
        while(traverse.next != null){
            if(count++ == k){
                h = traverse;
            }
            traverse = traverse.next;
        }
        if(count == k){
            return head;
        }else{
            head = h.next;
            h.next = null;
            traverse.next = temp;
        }
        return head;
    }
}
