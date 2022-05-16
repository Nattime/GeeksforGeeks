import resources.Node;

public class ReverseASublistLfALinkedList{
    public static Node reverseBetween(Node head, int m, int n){
        //code here
        if(m > 1){
            head.next = reverseBetween(head.next, m - 1, n - 1);
        }
        if(m == 1){
            Node tail = head;
            Node tailHead = tail;
            Node trav = tail.next;
            while(m < n){
                Node temp = trav;
                m++;
                trav = trav.next;
                temp.next = tailHead;
                tailHead = temp;
            }
            tail.next = trav;
            head = tailHead;
        }
        return head;
    }
}
