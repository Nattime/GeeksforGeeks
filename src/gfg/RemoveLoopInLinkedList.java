package gfg;

import resources.Node;

public class RemoveLoopInLinkedList {
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow = head;
        Node fast = head;
        while(fast != null && slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                if(slow == head){
                    while(slow != fast.next){
                        fast = fast.next;
                    }
                }else{
                    slow = head;
                    while(slow.next != fast.next){
                        slow = slow.next;
                        fast = fast.next;
                    }
                }
                fast.next = null;
            }
        }
    }
}
