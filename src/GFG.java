public class GFG {
    public static void main(String[] args) {

        /* First and last occurrences of x test
        FirstAndLastOccurrencesOfX flox = new FirstAndLastOccurrencesOfX();
        long arr[] = new long[]{1, 3, 5, 5, 5, 5, 67, 123, 125};
        Print.print(flox.find(arr, 9, 5));
        long arr2[] = new long[]{1, 3, 5, 5, 5, 5, 7, 123, 125};
        Print.print(flox.find(arr2, 9, 7));
        */

        /* Sorted insert for circular linked list test
        SortedInsertForCircularLinkedList sifcll = new SortedInsertForCircularLinkedList();
        int arr[] = new int[]{1, 2, 4};
        Node head = createCircularLinkedList(arr);
        Print.printCircular(SortedInsertForCircularLinkedList.sortedInsert(head, 2));
        int arr2[] = new int[]{1, 4, 7, 9};
        Node head = createCircularLinkedList(arr);
        Print.printCircular(SortedInsertForCircularLinkedList.sortedInsert(head, 5));
         */
    }

    static Node createCircularLinkedList(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node trav = head;
        for(int i = 1; i < arr.length; i++){
            trav.next = new Node(arr[i]);
            trav = trav.next;
        }
        trav.next = head;
        return head;
    }
}
