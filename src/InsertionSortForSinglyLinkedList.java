import resources.Node;

public class InsertionSortForSinglyLinkedList {
    public static Node insertionSort(Node head_ref)
    {
        //code here
        Node curr = head_ref;
        while(curr != null){
            Node smallest = curr;
            Node trav = curr.next;
            while(trav != null){
                if(trav.data < smallest.data){
                    smallest = trav;
                }
                trav = trav.next;
            }
            int temp = curr.data;
            curr.data = smallest.data;
            smallest.data = temp;
            curr = curr.next;
        }
        return head_ref;
    }
}
