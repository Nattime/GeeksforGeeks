import java.util.ArrayList;

public class GFG {
    public static void main(String[] args) {

        /* Counting elements in two arrays
        CountingElementsInTwoArrays ceita = new CountingElementsInTwoArrays();
        int arr1[] = {1, 2, 3, 4, 7, 9};
        int arr2[] = {0, 1, 2, 1, 1, 4};
        int m = 6, n = 6;
        Print.print(ceita.countEleLessThanOrEqual(arr1, arr2, m, n));
        int arr3[] = {4, 8, 7, 5, 1};
        int arr4[] = {4, 48, 3, 0, 1, 1, 5};
        int m2 = 5, n2 = 7;
        Print.print(ceita.countEleLessThanOrEqual(arr3, arr4, m2, n2));
         */

        /* BFS of graph
        BFSOfGraph bfsog = new BFSOfGraph();
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> zeroList = new ArrayList<>();
        zeroList.add(1);
        zeroList.add(2);
        zeroList.add(3);
        ArrayList<Integer> twoList = new ArrayList<>();
        twoList.add(4);
        adj.add(zeroList);
        adj.add(new ArrayList<>());
        adj.add(twoList);
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        Print.print(bfsog.bfsOfGraph(V, adj));

        int V2 = 3;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        ArrayList<Integer> zeroList2 = new ArrayList<>();
        zeroList2.add(1);
        zeroList2.add(2);
        adj2.add(zeroList2);
        adj2.add(new ArrayList<>());
        adj2.add(new ArrayList<>());
        Print.print(bfsog.bfsOfGraph(V2, adj2));
        */

        /* First and last occurrences of x
        FirstAndLastOccurrencesOfX flox = new FirstAndLastOccurrencesOfX();
        long arr[] = new long[]{1, 3, 5, 5, 5, 5, 67, 123, 125};
        Print.print(flox.find(arr, 9, 5));
        long arr2[] = new long[]{1, 3, 5, 5, 5, 5, 7, 123, 125};
        Print.print(flox.find(arr2, 9, 7));
        */

        /* Sorted insert for circular linked list
        SortedInsertForCircularLinkedList sifcll = new SortedInsertForCircularLinkedList();
        int arr[] = new int[]{1, 2, 4};
        Node head = Create.createCircularLinkedList(arr);
        Print.printCircular(SortedInsertForCircularLinkedList.sortedInsert(head, 2));
        int arr2[] = new int[]{1, 4, 7, 9};
        Node head = Create.createCircularLinkedList(arr);
        Print.printCircular(SortedInsertForCircularLinkedList.sortedInsert(head, 5));
         */

        /* Find n/k th node in Linked List
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        Node head = Create.createNodeLinkedList(arr);
        Print.print(FindNKthNodeInLinkedList.nknode(head, 2));
        int[] arr2 = new int[]{2, 7, 9, 3, 5};
        Node head2 = Create.createNodeLinkedList(arr2);
        Print.print(FindNKthNodeInLinkedList.nknode(head2, 3));
         */

        /* Multiply two linked lists
        int[] arr1 = new int[]{3, 2};
        int[] arr2 = new int[]{2};
        Node head1 = Create.createNodeLinkedList(arr1);
        Node head2 = Create.createNodeLinkedList(arr2);
        Print.print(MultiplyTwoLinkedLists.multiplyTwoLists(head1, head2));
        int[] arr1 = new int[]{1, 0, 0};
        int[] arr2 = new int[]{1, 0};
        Node head1 = Create.createNodeLinkedList(arr1);
        Node head2 = Create.createNodeLinkedList(arr2);
        Print.print(MultiplyTwoLinkedLists.multiplyTwoLists(head1, head2));
        */

        /* Operating an array
        OperatingAnArray oaa = new OperatingAnArray();
        int[] arr = new int[]{2, 4, 1, 0, 6};
        int[] ops = new int[]{1, 2, 2, 0};
        Print.print(oaa.operate(arr, ops));
        int[] arr2 = new int[]{801, 661, 730, 878, 305, 320};
        int[] ops2 = new int[]{736, 444, 0, 522};
        Print.print(oaa.operate(arr2, ops2));
         */
    }


}
