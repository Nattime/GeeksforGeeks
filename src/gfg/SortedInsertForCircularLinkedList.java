package gfg;

import resources.Node;

public class SortedInsertForCircularLinkedList {
    public static Node sortedInsert(Node head,int data)
    {
        //add code here.
        if(head == null){
            return new Node(data);
        }
        Node trav = head;
        while(trav.next != head){
            if(trav.data >= data){
                Node n = new Node(trav.data);
                n.next = trav.next;
                trav.next = n;
                trav.data = data;
                return head;
            }
            trav = trav.next;
        }
        Node n = new Node(data);
        n.next = head;
        trav.next = n;
        return head.data <= data ? head : n;
    }
}
