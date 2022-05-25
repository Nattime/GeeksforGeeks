package gfg;

import resources.Node;

public class FindNKthNodeInLinkedList {
    public static int nknode(Node head, int k)
    {
        // add your code here
        if(head == null){
            return -1;
        }
        if(head.next == null){
            return head.data;
        }
        int count = 1;
        Node trav = head.next;
        while(trav != null){
            if(count % k == 0){
                head = head.next;
            }
            count++;
            trav = trav.next;
        }
        return head.data;
    }
}
