import java.util.Stack;

public class GFG {
    public static void main(String[] args) {

        EarthquakeAndThePaintShop eatps = new EarthquakeAndThePaintShop();
        String[] arr = {"2234597891 zmxvvxbcij 8800654113 jihgfedcba", "1234567891 zxyabcvapo 0123434908 padmadngaa", "1234567891 abcdefghij 9876543219 jihgfedcba", "2234597891 zmxvvxbcij 8800654113 jihgfedcba", "9120121291 zmxvvxbcij 0912114113 mnvxbedcba"};
        Print.print(eatps.sortedStrings(5, arr), true);
        String[] arr2 = {"3122049353 onafrnbhtr 9822827304 yzfhdgzcvx", "3077357272 tojkoumxxs 0732733933 hbivwmrjhj", "2992299540 lpvkgykmlk 6946169466 vdqwvywwgg", "3077357272 tojkoumxxs 0732733933 hbivwmrjhj"};
        Print.print(eatps.sortedStrings(4, arr2), true);


        /* Clone a stack without using extra space
        CloneAStackWithoutUsingExtraSpace caswues = new CloneAStackWithoutUsingExtraSpace();
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7};
        Stack<Integer> s = Create.createStack(arr);
        Stack<Integer> cloned = new Stack<>();
        Print.print(s);
        Print.print(cloned);
        caswues.clonestack(s, cloned);
        Print.print(s);
        Print.print(cloned);

         */


        /* Insertion Sort for Singly Linked List
        int[] arr = {30, 23, 28, 30, 11, 14, 19, 16, 21, 25};
        Node root = Create.createNodeLinkedList(arr);
        Print.print(InsertionSortForSinglyLinkedList.insertionSort(root));
        int[] arr2 = {19, 20, 16, 12, 29, 30};
        Node root2 = Create.createNodeLinkedList(arr2);
        Print.print(InsertionSortForSinglyLinkedList.insertionSort(root2));

         */


        /* Remove loop in Linked List
        RemoveLoopInLinkedList rlill = new RemoveLoopInLinkedList();

         */


        /* Level order traversal in spiral form
        LevelOrderTraversalInSpiralForm lotisf = new LevelOrderTraversalInSpiralForm();
        int[] arr = {1, 3, 2};
        Node root = Create.createBinaryTree(arr);
        Print.print(lotisf.findSpiral(root));
        int[] arr2 = {9, 8, 11, 4, -1, 10, 12, 3, 7, -1, -1, -1, -1, 2, -1, 6, -1, 1, -1, 5, -1, 0};
        Node root2 = Create.createBinaryTree(arr2);
        Print.printBinaryTree(root2);
        Print.print(lotisf.findSpiral(root2));

         */


        /* Clone a Binary Tree
        CloneABinaryTree cabt = new CloneABinaryTree();
        int[][] matrix = {{6, 3, 8, -1}, {3, 1, 5, -1}, {8, -1, -1, -1}, {1, -1, -1, 3}, {5, -1, -1, 6}};
        Tree root = Create.createRandomTree(matrix);
        Print.printRandomTree(root);
        Print.printRandomTree(cabt.cloneTree(root));

         */


        /* Postorder Traversal (Iterative)
        PostorderTraversalIterative pti = new PostorderTraversalIterative();
        int[] arr = {1, 2, 3, 4, 5};
        Node root = Create.createBinaryTree(arr);
        Print.print(pti.postOrder(root));
        int[] arr2 = {8, 1, 5, -1, 7, 10, 6, -1, -1, -1, 10, 6};
        Node root2 = Create.createBinaryTree(arr2);
        Print.print(pti.postOrder(root2));

         */


        /* Preorder traversal (Iterative)
        PreorderTraversalIterative pti = new PreorderTraversalIterative();
        int[] arr = {1, 2, 3, 4, 5};
        Node root = Create.createBinaryTree(arr);
        Print.print(pti.preOrder(root));
        int[] arr2 = {8, 1, 5, -1, 7, 10, 6, -1, -1, -1, 10, 6};
        Node root2 = Create.createBinaryTree(arr2);
        Print.printBinaryTree(root2);
        Print.print(pti.preOrder(root2));

         */


        /* Inorder Traversal (Iterative)
        InorderTraversalIterative iti = new InorderTraversalIterative();
        int[] arr = {1, 2, 3, 4, 5};
        Node root = Create.createBinaryTree(arr);
        Print.print(iti.inOrder(root));
        int[] arr2 = {8, 1, 5, -1, 7, 10, 6, -1, -1, -1, 10, 6};
        Node root2 = Create.createBinaryTree(arr2);
        Print.printBinaryTree(root2);
        Print.print(iti.inOrder(root2));

         */


        /* Make Binary Tree From Linked List
        int[] arr = {10, 12, 15, 25, 30, 36};
        Node node = Create.createNodeLinkedList(arr);
        Print.print(node);
        Print.printBinaryTree(MakeBinaryTreeFromLinkedList.convert(node, null));
        int[] arr2 = {5, 4, 3, 2, 1};
        Node node2 = Create.createNodeLinkedList(arr2);
        Print.print(node2);
        Print.printBinaryTree(MakeBinaryTreeFromLinkedList.convert(node2, null));

         */


        /* Height of Binary Tree
        HeightOfBinaryTree hobt = new HeightOfBinaryTree();
        int[] arr = {1, 2, 3};
        Node root = Create.createBinaryTree(arr);
        Print.printBinaryTree(root);
        Print.print(hobt.height(root));
        int[] arr2 = {2, -1, 1, -1, -1, 3};
        Node root2 = Create.createBinaryTree(arr2);
        Print.printBinaryTree(root2);
        Print.print(hobt.height(root2));

         */


        /* Merge two BST
        MergeTwoBST mtbst = new MergeTwoBST();
        int[] arr1 = {5, 3, 6, 2, 4};
        int[] arr2 = {2, 1, 3, 7, 6};
        Node root1 = Create.createBST(arr1);
        Node root2 = Create.createBST(arr2);
        Print.printLevelOrder(root1);
        Print.printLevelOrder(root2);
        Print.print(mtbst.merge(root1, root2));
        int[] arr3 = {12, 9, 6, 11};
        int[] arr4 = {8, 5, 10, 2};
        Node root3 = Create.createBST(arr3);
        Node root4 = Create.createBST(arr4);
        Print.printLevelOrder(root3);
        Print.printLevelOrder(root4);
        Print.print(mtbst.merge(root3, root4));

         */


        /* Rotate a Linked List
        RotateALinkedList rall = new RotateALinkedList();
        int[] arr = {2, 4, 7, 8, 9};
        Node root = Create.createNodeLinkedList(arr);
        Print.print(rall.rotate(root, 3));
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        Node root2 = Create.createNodeLinkedList(arr2);
        Print.print(rall.rotate(root2, 4));

         */


        /* Valid Substring
        Print.print(ValidSubstring.findMaxLen("(()("));
        Print.print(ValidSubstring.findMaxLen("()(())("));

         */


        /* Equilibrium point
        long[] arr = {1L, 3L, 5L, 2L, 2L};
        Print.print(EquilibriumPoint.equilibriumPoint(arr, 5));
        long[] arr2 = {1L};
        Print.print(EquilibriumPoint.equilibriumPoint(arr2, 1));

         */


        /* Integer to Words
        IntegerToWords itw = new IntegerToWords();
        Print.print(itw.convertToWords(438237764L));
        Print.print(itw.convertToWords(1000L));

         */


        /* Check if array is sorted
        CheckIfArrayIsSorted ciais = new CheckIfArrayIsSorted();
        int[] arr = {10, 20, 30, 40, 50};
        Print.print(ciais.arraySortedOrNot(arr, 5));
        int[] arr2 = {90, 80, 100, 70, 40, 30};
        Print.print(ciais.arraySortedOrNot(arr2, 6));

         */

        /* Winner of an election
        String[] arr = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"};
        Print.print(WinnerOfAnElection.winner(arr, 13));
        String[] arr2 = {"andy", "blake", "clark"};
        Print.print(WinnerOfAnElection.winner(arr2, 3));

         */


        /* Searching a number
        SearchingANumber san = new SearchingANumber();
        int[] arr = {9, 7, 2, 16, 4};
        Print.print(san.search(arr, 5, 16));
        int[] arr2 = {1, 22, 57, 47, 34, 18, 66};
        Print.print(san.search(arr2, 7, 98));

         */


        /* Even Odd
        EvenOdd eo = new EvenOdd();
        eo.evenOdd(2, 3);
        eo.evenOdd(5, 2);

         */


        /* Two Repeated Elements
        TwoRepeatedElements tre = new TwoRepeatedElements();
        int[] arr = {1, 2, 1, 3, 4, 3};
        Print.print(tre.twoRepeated(arr, 4));
        int[] arr2 = {1, 2, 2, 1};
        Print.print(tre.twoRepeated(arr2, 2));

         */


        /* Ancestors in Binary Tree
        int[] arr = {1, 2, 3, 4, 5, -1, -1, 7};
        Node root = Create.createBinaryTree(arr);
        Print.printLevelOrder(root);
        Print.print(AncestorsInBinaryTree.Ancestors(root, 7));
        int[] arr2 = {1, 2, 3};
        Node root2 = Create.createBinaryTree(arr2);
        Print.printLevelOrder(root2);
        Print.print(AncestorsInBinaryTree.Ancestors(root2, 2));

         */


        /* Check whether BST contains Dead End
        CheckWhetherBSTContainsDeadEnd cwbstcde = new CheckWhetherBSTContainsDeadEnd();
        int[] arr = {8, 5, 9, 2, 7, 1};
        Node root = Create.createBST(arr);
        Print.print((cwbstcde.isDeadEnd(root) ? 1 : 0));
        int[] arr2 = {8, 7, 10, 9, 13, 2};
        Node root2 = Create.createBST(arr2);
        Print.print((cwbstcde.isDeadEnd(root2) ? 1: 0));

         */


        /* Move all negative elements to end
        MoveAllNegativeElementsToEnd manete = new MoveAllNegativeElementsToEnd();
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        manete.segregateElements(arr, 8);
        Print.print(arr);
        int[] arr2 = {-5, 7, -3, -4, 9, 10, -1, 11};
        manete.segregateElements(arr2, 8);
        Print.print(arr);

         */


        /* Counting elements in two arrays
        CountingElementsInTwoArrays ceita = new CountingElementsInTwoArrays();
        int[] arr1 = {1, 2, 3, 4, 7, 9};
        int[] arr2 = {0, 1, 2, 1, 1, 4};
        int m = 6, n = 6;
        Print.print(ceita.countEleLessThanOrEqual(arr1, arr2, m, n));
        int[] arr3 = {4, 8, 7, 5, 1};
        int[] arr4 = {4, 48, 3, 0, 1, 1, 5};
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
