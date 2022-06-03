import gfg.*;
import resources.Create;
import resources.Node;
import resources.Print;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GFG{
    public static void main(String[] args){

        /* Tom and String
        Print.print(TomAndString.hashString("aA1 b"));
        Print.print(TomAndString.hashString("aa BB cc DD"));

         */


        /* Check if all levels of two trees are anagrams or not
        int[] arr1 = {1, 3, 2, -1, -1, 5, 4};
        int[] arr2 = {1, 2, 3, 4, 5};
        Node root1 = Create.createBinaryTree(arr1);
        Node root2 = Create.createBinaryTree(arr2);
        Print.print(CheckIfAllLevelsOfTwoTreesAreAnagramsOrNot.areAnagrams(root1, root2));

         */


        /* Java Date and Day
        Print.print(JavaDateAndDay.findDay(17, 03, 2017));
        Print.print(JavaDateAndDay.findDay(29, 11, 2021));

         */


        /* Corona Vaccine
        int[] arr = {1, 2, 3, -1, -1, -1, 4, -1, 5, -1, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};
        Node root = Create.createBinaryTree(arr);
        Node root2 = Create.createBinaryTree(arr2);
        Node root3 = Create.createBinaryTree(arr3);
        Print.printBinaryTree(root);
        Print.printBinaryTree(root2);
        Print.printBinaryTree(root3);
        Print.print(CoronaVaccine.supplyVaccine(root));
        Print.print(CoronaVaccine.supplyVaccine(root2));
        Print.print(CoronaVaccine.supplyVaccine(root3));

         */


        /* Total Number Of Spanning Trees In A Graph
        int[][] graph = {{0, 3}, {0, 1}, {1, 2}, {1, 5}, {3, 4}};
        Print.print(TotalNumberOfSpanningTreesInAGraph.countSpanningTrees(graph, 6, 5));
        int[][] graph2 = {{0, 1}, {1, 3}, {2, 3}, {2, 5}, {2, 8}, {3, 6}, {4, 7}, {5, 9}, {7, 8}};
        Print.print(TotalNumberOfSpanningTreesInAGraph.countSpanningTrees(graph2, 10, 9));

         */


        /* Inorder Traversal and BST
        int[] arr = {2, 4, 5};
        Print.print(InorderTraversalAndBST.isRepresentingBST(arr, arr.length));
        int[] arr2 = {2, 4, 1};
        Print.print(InorderTraversalAndBST.isRepresentingBST(arr2, arr2.length));

         */


        /* Height of Heap
        int[] arr = {1, 3, 6, 5, 9, 8};
        Print.print(HeightOfHeap.heapHeight(arr.length, arr));
        int[] arr2 = {3, 6, 9, 2, 15, 10, 14, 5, 12};
        Print.print(HeightOfHeap.heapHeight(arr2.length, arr2));

         */


        /* Valentine Sum
        int[] arr = {1, 2, 9, 4, -1, 5, 7, 8, 19, -1, -1, 20, 11, 30, 40, 50};
        Node root = Create.createBinaryTree(arr);
        Print.printBinaryTree(root);
        Print.print(ValentineSum.sum_at_distK(root, 9,1)); // 22
        Print.print(ValentineSum.sum_at_distK(root, 9,2)); // 55
        Print.print(ValentineSum.sum_at_distK(root, 40,2)); // 82
        Print.print(ValentineSum.sum_at_distK(root, 40,3)); // 103
        Print.print(ValentineSum.sum_at_distK(root, 40,1)); // 48

         */


        /* Remove BST keys outside given range
        RemoveBSTKeysOutsideGivenRange rbstkogr = new RemoveBSTKeysOutsideGivenRange();
        Integer[] arr = {6, -13, 14, -8, 13, 15, 7};
        Node root = Create.createBST(arr);
        Print.printTree(rbstkogr.removekeys(root, -10, 13), false);
        Integer[] arr2 = {14, 4, 16, 2, 8, 15, null, -8, 3, 7, 10};
        Node root2 = Create.createBST(arr2);
        Print.printTree(root2, false);
        Print.printTree(rbstkogr.removekeys(root2, 2, 6), false);

         */


        /* Largest subtree sum in a tree
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Node root = Create.createBinaryTree(arr);
        Print.print(LargestSubtreeSumInATree.findLargestSubtreeSum(root));
        int[] arr2 = {5, 5, -1, 4, 10, -1, 8, 5, -1, -1, 8, 8, -1, 6}; // 5 5 N 4 10 N 8 5 N N 8 8 N 6
        Node root2 = Create.createBinaryTree(arr2);
        Print.print(LargestSubtreeSumInATree.findLargestSubtreeSum(root2));

         */


        /* Maximum Sum LCM
        Print.print(MaximumSumLCM.maxSumLCM(2));
        Print.print(MaximumSumLCM.maxSumLCM(5));

         */


        /* Confused pappu
        ConfusedPappu cp = new ConfusedPappu();
        Print.print(cp.findDiff(56L));
        Print.print(cp.findDiff(66L));

         */


        /* Toppers Of Class
        ToppersOfClass toc = new ToppersOfClass();
        int[] arr = {2, 2, 1, 3, 1};
        ToppersOfClass.node[] nodeArr = ToppersOfClass.makeNode(arr);
        toc.kTop(nodeArr, nodeArr.length);
        ToppersOfClass.print(nodeArr, 3);
        int[] arr2 = {1, 2, 3, 4};
        ToppersOfClass.node[] nodeArr2 = ToppersOfClass.makeNode(arr);
        toc.kTop(nodeArr2, nodeArr2.length);
        ToppersOfClass.print(nodeArr2, 1);

         */


        /* Matrix Operations
        int[][] matrix = {{0, 1}, {1, 0}};
        Print.print(MatrixOperations.endPoints(matrix, 2, 2));
        int[][] matrix2 = {{0, 1, 1, 1, 0}, {1, 0, 1, 0, 1}, {1, 1, 1, 0, 0}};
        Print.print(MatrixOperations.endPoints(matrix2, 3, 5));

         */


        /* Minimum Sum of Absolute Differences of Pairs
        MinimumSumOfAbsoluteDifferencesOfPairs msoadop = new MinimumSumOfAbsoluteDifferencesOfPairs();
        int[] A = {4, 1, 8, 7};
        int[] B = {2, 3, 6, 5};
        Print.print(msoadop.findMinSum(A, B, 4));
        int[] A2 = {4, 1, 2};
        int[] B2 = {2, 4, 1};
        Print.print(msoadop.findMinSum(A2, B2, 3));

         */


        /* Possible Timings
        Print.print(PossibleTimings.numberOfPossibleTimings("78"));
        Print.print(PossibleTimings.numberOfPossibleTimings("05"));

         */

//        Create.test();

        /* Operations on PriorityQueue
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 1};
        int[] op = {1, 3, 2, 9, 10};
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b - a);
        for(int iter : arr){
            gfg.OperationsOnPriorityQueue.insert(pq, iter);
        }
        for(int iter : op){
            if(gfg.OperationsOnPriorityQueue.find(pq, iter)){
                System.out.println("1");
                System.out.println(gfg.OperationsOnPriorityQueue.delete(pq));
            }else{
                System.out.println("-1");
            }
        }

         */


        /* N Digit numbers with digits in increasing order
        Print.print(gfg.NDigitNumbersWithDigitsInIncreasingOrder.increasingNumbers(3));
        Print.print(gfg.NDigitNumbersWithDigitsInIncreasingOrder.increasingNumbers(4));

         */


        /* Unusual String Sort
        Print.print(gfg.UnusualStringSort.stringSort("bAwutndekWEdkd"));
        Print.print(gfg.UnusualStringSort.stringSort("AiBFR"));

         */


        /* Print the pattern
        Print.print(gfg.PrintThePattern.pattern(3), true);

         */


        /* Swap the closest and farthest digits
        gfg.SwapTheClosestAndFarthestDigits stcafd = new gfg.SwapTheClosestAndFarthestDigits();
        gfg.SwapTheClosestAndFarthestDigits.Str n1 = new gfg.SwapTheClosestAndFarthestDigits.Str("1234");
        gfg.SwapTheClosestAndFarthestDigits.Str n2 = new gfg.SwapTheClosestAndFarthestDigits.Str("5678");
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        stcafd.swapDigits(n1, n2);
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        gfg.SwapTheClosestAndFarthestDigits.Str n3 = new gfg.SwapTheClosestAndFarthestDigits.Str("555");
        gfg.SwapTheClosestAndFarthestDigits.Str n4 = new gfg.SwapTheClosestAndFarthestDigits.Str("55");
        System.out.println(n3.toString());
        System.out.println(n4.toString());
        stcafd.swapDigits(n3, n4);
        System.out.println(n3.toString());
        System.out.println(n4.toString());

         */


        /* Product is even or odd
        gfg.ProductIsEvenOrOdd pieoo = new gfg.ProductIsEvenOrOdd();
        Print.print(pieoo.gfg.EvenOdd("12", "15"));
        Print.print(pieoo.gfg.EvenOdd("123", "457"));

         */


        /* Sum of large numbers
        gfg.SumOfLargeNumbers soln = new gfg.SumOfLargeNumbers();
        Print.print(soln.add("63457", "645"));
        Print.print(soln.add("101", "102"));

         */


        /* Minimum number of Coins
        Print.print(gfg.MinimumNumberCfCoins.minPartition(43));
        Print.print(gfg.MinimumNumberCfCoins.minPartition(1000));

         */


        /* Flatten binary tree to linked list
        int[] arr = {1, 2, 5, 3, 4, -1, 6};
        Node root = Create.createBinaryTree(arr);
        Print.printBinaryTree(root);
        gfg.FlattenBinaryTreeToLinkedList.flatten(root);
        Print.printBinaryTree(root);

         */


        /* Queue using stack
        gfg.QueueUsingStack qus = new gfg.QueueUsingStack();
        qus.enqueue(2);
        qus.enqueue(3);
        Print.print(qus.dequeue());
        qus.enqueue(4);
        Print.print(qus.dequeue());
        gfg.QueueUsingStack qus2 = new gfg.QueueUsingStack();
        qus2.enqueue(2);
        Print.print(qus2.dequeue());
        Print.print(qus2.dequeue());

         */


        /* Height Using Parent Array
        int[] arr = {-1, 0, 0, 1, 1, 3, 5};
        Print.print(gfg.HeightUsingParentArray.findHeight(7, arr));

         */


        /* Pattern for Reverse Character Bridge
        Print.print(gfg.PatternForReverseCharacterBridge.revCharBridge(5));
        Print.print(gfg.PatternForReverseCharacterBridge.revCharBridge(4));

         */


        /* Reverse a sublist of a linked list
        int[] arr = {1, 7, 5, 3, 9, 8, 10, 2, 2, 5};
        Node head = Create.createNodeLinkedList(arr);
        Print.printNodeLinkedList(gfg.ReverseASublistLfALinkedList.reverseBetween(head, 1, 8));
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        Node head2 = Create.createNodeLinkedList(arr2);
        Print.printNodeLinkedList(gfg.ReverseASublistLfALinkedList.reverseBetween(head2, 2, 4));

         */


        /* Encoding names
        Print.print(gfg.EncodingNames.encodeTheName("Soni"));
        Print.print(gfg.EncodingNames.encodeTheName("Pawan"));

         */


        /* Mean of range in array
        gfg.MeanOfRangeInArray moria = new gfg.MeanOfRangeInArray();
        int[] arr = {1, 2, 3, 4, 5};
        int[] queries = {0, 2, 1, 3, 0, 4};
        Print.print(moria.findMean(arr, queries, arr.length, queries.length));
        int[] arr2 = {6, 7, 8, 10};
        int[] queries2 = {0, 3, 1, 2};
        Print.print(moria.findMean(arr2, queries2, arr2.length, queries2.length));

         */


        /* Perfect Square String
        Print.print(gfg.PerfectSquareString.isSquare("d"));
        Print.print(gfg.PerfectSquareString.isSquare("1Qy"));

         */


        /* Alternative Sorting
        gfg.AlternativeSorting as = new gfg.AlternativeSorting();
        long[] arr = {7, 1, 2, 3, 4, 5, 6};
        Print.print(as.alternateSort(arr, 7));
        long[] arr2 = {1, 6, 9, 4, 3, 7, 8, 2};
        Print.print(as.alternateSort(arr2, 8));

         */


        /* Geek and Strings
        String[] li = {"abracadabra", "geeksforgeeks", "abracadabra", "geeks", "geeksthrill"};
        String[] query = {"abr", "geeks", "geeksforgeeks", "ge", "gar"};
        Print.print(gfg.GeekAndStrings.prefixCount(5, 5, li, query));

         */

//        Print.print("Hi");


        /* Hungry Pizza Lovers
        int[][] arr = {{4, 1}, {6, 2}, {7, 6}, {8, 1}, {1, 3}};
        resources.Print.print(gfg.HungryPizzaLovers.permute(arr, 5));
        int[][] arr2 = {{1, 1}, {1, 1}, {1, 1}};
        resources.Print.print(gfg.HungryPizzaLovers.permute(arr2, 3));

         */


        /* Sort in specific order
        gfg.SortInSpecificOrder siso = new gfg.SortInSpecificOrder();
        long[] arr = {1L, 2L, 3L, 5L, 4L, 7L, 10L};
        siso.sortIt(arr, 7);
        resources.Print.print(arr);
        long[] arr2 = {0, 4, 5, 3, 7, 2, 1};
        siso.sortIt(arr2, 7);
        resources.Print.print(arr2);

         */


        /* Upper case conversion
        gfg.UpperCaseConversion ucc = new gfg.UpperCaseConversion();
        resources.Print.print(ucc.transform("i love programming"));

         */


        /* Sort The Array
        gfg.SortTheArray sta = new gfg.SortTheArray();
        int[] arr = {1, 5, 3, 2};
        resources.Print.print(sta.sortArr(arr, 4));
        int[] arr2 = {3, 1};
        resources.Print.print(sta.sortArr(arr2, 2));

         */


        /* Count Alphabets
        resources.Print.print(gfg.CountAlphabets.Count("adjfjh23"));
        resources.Print.print(gfg.CountAlphabets.Count("n0ji#k$"));

         */


        /* Permutations in array
        gfg.PermutationsInArray pia = new gfg.PermutationsInArray();
        long[] a = {2, 1, 3};
        long[] b = {7, 8, 9};
        resources.Print.print(pia.isPossible(a, b, a.length, 10L));
        long[] a2 = {1, 2, 2, 1};
        long[] b2 = {3, 3, 3, 4};
        resources.Print.print(pia.isPossible(a2, b2, a2.length, 5L));

         */


        /* Adding Ones
        int[] a = {0, 0, 0};
        int[] updates = {1, 1, 2, 3};
        gfg.AddingOnes.update(a, 3, updates, 4);
        resources.Print.print(a);
        int[] a2 = {0, 0};
        int[] updates2 = {1, 1, 1};
        gfg.AddingOnes.update(a2, 2, updates2, 3);
        resources.Print.print(a2);

         */


        /* Last index of a character in the string
        gfg.LastIndexOfACharacterInTheString lioacits = new gfg.LastIndexOfACharacterInTheString();
        resources.Print.print(lioacits.LastIndex("Geeks", 'e'));
        resources.Print.print(lioacits.LastIndex("okiyh", 'z'));

         */


        /* Check if divisible by 5
        resources.Print.print(gfg.CheckIfDivisibleByFive.divisibleBy5("5"));
        resources.Print.print(gfg.CheckIfDivisibleByFive.divisibleBy5("1000001"));

         */


        /* Count Substrings
        gfg.CountSubstrings cs = new gfg.CountSubstrings();
        resources.Print.print(cs.countSubstr("10101"));
        resources.Print.print(cs.countSubstr("100"));

         */


        /* Sum of distinct elements for a limited range
        gfg.SumOfDistinctElementsForALimitedRange sodefalr = new gfg.SumOfDistinctElementsForALimitedRange();
        long[] arr = {5, 1, 2, 4, 6, 7, 3, 6, 7};
        resources.Print.print(sodefalr.sumOfDistinct(arr, arr.length));
        long[] arr2 = {1, 1, 1};
        resources.Print.print(sodefalr.sumOfDistinct(arr2, arr2.length));

         */


        /* Sort the string in descending order
        gfg.SortTheStringInDescendingOrder stsido = new gfg.SortTheStringInDescendingOrder();
        resources.Print.print(stsido.ReverseSort("geeks"));
        resources.Print.print(stsido.ReverseSort("for"));

         */


        /* Pattern-1
        resources.Print.print(gfg.Pattern1.findThePattern(4));
        resources.Print.print(gfg.Pattern1.findThePattern(6));

         */


        /* Perfect Reversible String
        gfg.PerfectReversibleString prs = new gfg.PerfectReversibleString();
        resources.Print.print(prs.isReversible("ab", 2));
        resources.Print.print(prs.isReversible("aba", 3));

         */


        /* Triangular Number
        gfg.TriangularNumber tn = new gfg.TriangularNumber();
        resources.Print.print(tn.isTriangular(55));
        resources.Print.print(tn.isTriangular(56));

         */


        /* Can Make Triangle
        gfg.CanMakeTriangle cmt = new gfg.CanMakeTriangle();
        int[] A = {1, 2, 2, 4};
        resources.Print.print(cmt.canMakeTriangle(A, A.length));
        int[] A2 = {2, 10, 2, 10, 2};
        resources.Print.print(cmt.canMakeTriangle(A2, A2.length));

         */


        /* Arya's Long String
        resources.Print.print(gfg.AryasLongString.fun("WLRBBMQBHCDARZOWKKYHIDDQSCDXRJMOWFRXSJYBLDBEFSARCBYNECDYGGXXPKLORELLNMPAPQFWKHOPKMCOQHNWNKUEWHSQMGBBUQCLJJIVSWMDKQTBXIXMVTRRBLJPTNSNFWZQFJMAFADRRWSOFSBCNUVQHFFBSAQXWPQCACEHCHZVFRKMLNOZJKPQPXRJXKITZYXACBHHKICQCOENDTOMFGDWDWFCGPXIQVKUYTDLCGDEWHTACIOHORDTQKVWCSGSPQOQMSBOAGUWNNYQXNZLGDGWPBTRWBLNSADEUGUUMOQCDRUBETOKYXHOACHWDVMXXRDRYXLMNDQTUKWAGMLEJUUKWCIBXUBUMENMEYATDRMYDIAJXLOGHIQFMZH", 67621, 19144651, 'V'));
        resources.Print.print(gfg.AryasLongString.fun("ABA", 3, 7, 'B'));
        resources.Print.print(gfg.AryasLongString.fun("MMM", 2, 4, 'M'));

         */


        /* Ordering of strings
        gfg.OrderingOfStrings oos = new gfg.OrderingOfStrings();
        String[] arr = {"a", "ab", "abc"};
        resources.Print.print(oos.orderString(arr, 3));
        String[] arr2 = {"abc", "abc"};
        resources.Print.print(oos.orderString(arr2, 2));

         */


        /* Starting Point
        gfg.StartingPoint sp = new gfg.StartingPoint();
        int[][] matrix = {{1, 0}, {0, 1}, {1, 1}};
        resources.Print.print(sp.findStartingPoint(2, 2, matrix));
        int[][] matrix2 = {{1, 1}};
        resources.Print.print(sp.findStartingPoint(1, 2, matrix2));

         */


        /* Triangle growing downwards
        gfg.TriangleGrowingDownwards.printTriangleDownwards("geeks");
        gfg.TriangleGrowingDownwards.printTriangleDownwards("thisi");

         */


        /* Find duplicates under given constraints
        gfg.FindDuplicatesUnderGivenConstraints fdugc = new gfg.FindDuplicatesUnderGivenConstraints();
        int[] A = {1, 1, 1, 1, 1, 5, 7, 10, 20, 30};
        resources.Print.print(fdugc.findDuplicate(A));
        int[] A2 = {1, 2, 3, 3, 3, 3, 3, 5, 9, 10};
        resources.Print.print(fdugc.findDuplicate(A2));

         */


        /* Ishwar and his proposals
        gfg.IshwarAndHisProposals iahp = new gfg.IshwarAndHisProposals();
        int[] arr = {1, 2, 3, 4};
        resources.Print.print(iahp.acceptedProposals(arr, 4));
        int[] arr2 = {6, 9, 1, 4, 8};
        resources.Print.print(iahp.acceptedProposals(arr2, 5));

         */


        /* Maximum Winning score
        int[] arr = {4, 2, 8, 2, 1, 3, 4};
        resources.Node root = resources.Create.createBinaryTree(arr);
        resources.Print.print(gfg.MaximumWinningScore.findMaxScore(root));
        int[] arr2 = {10,7,5,-1,-1,-1,1};
        resources.Node root2 = resources.Create.createBinaryTree(arr2);
        resources.Print.print(gfg.MaximumWinningScore.findMaxScore(root2));

         */


        /* Recursively print all sentences that can be formed from list of word lists
        String[][] list = {{"you", "we"}, {"have", "are"}};
        resources.Print.print(gfg.RecursivelyPrintAllSentencesThatCanBeFormedFromListOfWordLists.sentences(list));
        String[][] list2 = {{"bowl", "walk", "sunflower", "movie"},{"table", "bottle", "fan", "sleep"}};
        resources.Print.print(gfg.RecursivelyPrintAllSentencesThatCanBeFormedFromListOfWordLists.sentences(list2));

         */


        /* Maximum Diamonds
        int[] A = {2, 1, 7, 4, 2};
        resources.Print.print(gfg.MaximumDiamonds.maxDiamonds(A, 5, 3));
        int[] A2 = {7, 1, 2};
        resources.Print.print(gfg.MaximumDiamonds.maxDiamonds(A2, 3, 2));

         */


        /* Addition of two square matrices
        gfg.AdditionOfTwoSquareMatrices aotsm = new gfg.AdditionOfTwoSquareMatrices();
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{4, 3}, {2, 1}};
        aotsm.Addition(matrixA, matrixB);
        resources.Print.print(matrixA);
        int[][] matrixA2 = {{2, 2}, {2, 2}};
        int[][] matrixB2 = {{3, 3}, {3, 3}};
        aotsm.Addition(matrixA2, matrixB2);
        resources.Print.print(matrixA2);

         */


        /* Square Divisors
        resources.Print.print(gfg.SquareDivisors.squareFactor(36));
        resources.Print.print(gfg.SquareDivisors.squareFactor(60));

         */


        /* Jumpy Ball
        resources.Print.print(gfg.JumpyBall.jumpyBall(10));
        resources.Print.print(gfg.JumpyBall.jumpyBall(20));

         */


        /* Maximum Possible Sum of Products
        gfg.MaximumPossibleSumOfProducts mpsop = new gfg.MaximumPossibleSumOfProducts();
        long[] A = {1, 2, 3};
        long[] B = {4, 5, 1};
        resources.Print.print(mpsop.MaxSum(A, B, 3));
        long[] A2 = {1, 2};
        long[] B2 = {4, 4};
        resources.Print.print(mpsop.MaxSum(A2, B2, 2));

         */


        /* Pattern of Strings
        gfg.PatternOfStrings pos = new gfg.PatternOfStrings();
        resources.Print.print(pos.pattern("Geek"));
        resources.Print.print(pos.pattern("G*g"));

         */


        /* Triangle shrinking downwards
        resources.Print.print(gfg.TriangleShrinkingDownwards.triDownwards("Geeks"));
        resources.Print.print(gfg.TriangleShrinkingDownwards.triDownwards("@io30"));

         */


        /* Rope Cutting
        int[] arr = {5, 1, 1, 2, 3, 5};
        resources.Print.print(gfg.RopeCutting.ropeCutting(arr, 6));
        int[] arr2 = {5, 1, 6, 9, 8, 11, 2, 2, 6, 5};
        resources.Print.print(gfg.RopeCutting.gfg.RopeCutting(arr2, 10));


        /* Reverse alternate words
        gfg.ReverseAlternateWords raw = new gfg.ReverseAlternateWords();
        resources.Print.print(raw.reverseAlternate("geeks for geeks"));
        resources.Print.print(raw.reverseAlternate("hello there peter pan"));

         */


        /* Maximum sum leaf to root path
        int[] arr = {1, 2, 3};
        resources.Node root = resources.Create.createBinaryTree(arr);
        resources.Print.print(gfg.MaximumSumLeaftoRootPath.maxPathSum(root));
        int[] arr2 = {10, -2, 7, 8, -4};
        resources.Node root2 = resources.Create.createBinaryTree(arr2);
        resources.Print.print(gfg.MaximumSumLeaftoRootPath.maxPathSum(root2));

         */


        /* Palindromic Subsequences
        gfg.PalindromicSubsequences ps = new gfg.PalindromicSubsequences();
        resources.Print.print(ps.MinRemove(5, "10001"));
        resources.Print.print(ps.MinRemove(8, "10001001"));

         */


        /* Kronecker Product
        gfg.KroneckerProduct kp = new gfg.KroneckerProduct();
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{0, 5}, {6, 7}};
        resources.Print.print(kp.kroneckerProduct(2, 2, 2, 2, A, B));

         */


        /* Check if divisible by 4
        gfg.CheckIfDivisibleByFour cidb4 = new gfg.CheckIfDivisibleByFour();
        resources.Print.print(cidb4.divisibleBy4("1124"));
        resources.Print.print(cidb4.divisibleBy4("7"));

         */


        /* Flipping bits in Binary Format
        gfg.FlippingBitsInBinaryFormat fbibf = new gfg.FlippingBitsInBinaryFormat();
        resources.Print.print(fbibf.flipBits(1L));
        resources.Print.print(fbibf.flipBits(2L));

         */


        /* Sort a String
        gfg.SortAString sas = new gfg.SortAString();
        resources.Print.print(sas.sort("edcab"));
        resources.Print.print(sas.sort("xzy"));

         */


        /* Nth Pentagonal Number
        resources.Print.print(gfg.NthPentagonalNumber.getNthPentagonalNum(1L));
        resources.Print.print(gfg.NthPentagonalNumber.getNthPentagonalNum(2L));

         */


        /* Sum of dependencies in a graph
        gfg.SumOfDependenciesInAGraph sodiag = new gfg.SumOfDependenciesInAGraph();
        int[][] mat = {{0, 2}, {0, 3}, {1, 3}, {2, 3}};
        ArrayList<ArrayList<Integer>> list = resources.Create.createArrayList(mat);
        resources.Print.print(list);
        resources.Print.print(sodiag.sumOfDependencies(list, 4));
        int[][] mat2 = {{0, 3}, {0, 2}, {0, 1}};
        ArrayList<ArrayList<Integer>> list2 = resources.Create.createArrayList(mat2);
        resources.Print.print(list2);
        resources.Print.print(sodiag.sumOfDependencies(list2, 4));

         */


        /* Inverse Permutation
        int[] arr = {1, 4, 3, 2};
        resources.Print.print(gfg.InversePermutation.inversePermutation(arr, 4));
        int[] arr2 = {2, 3, 4, 5, 1};
        resources.Print.print(gfg.InversePermutation.inversePermutation(arr2, 5));

         */


        /* Program to print reciprocal of letters - copy
        resources.Print.print(gfg.ProgramToPrintReciprocalOfLettersCopy.reciprocalString("ab C"));
        resources.Print.print(gfg.ProgramToPrintReciprocalOfLettersCopy.reciprocalString("Ish"));

         */


        /* Front-Back Transformation - copy
        gfg.FrontBackTransformationCopy fbtc = new gfg.FrontBackTransformationCopy();
        resources.Print.print(fbtc.convert("Hello"));
        resources.Print.print(fbtc.convert("GfG"));

         */


        /* Magical String[Duplicate Problem]
        resources.Print.print(gfg.MagicalStringDuplicateProblem.magicalString("varun"));
        resources.Print.print(gfg.MagicalStringDuplicateProblem.magicalString("akshay"));

         */


        /* Swapping Triangles
        gfg.SwappingTriangles st = new gfg.SwappingTriangles();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        resources.Print.print(st.swapTriangle(3, matrix));
        int[][] matrix2 = {{2, 7, 3, 1}, {10, 1, 5, 1}, {10, 4, 7, 6}, {6, 9, 1, 8}};
        resources.Print.print(st.swapTriangle(4, matrix2));

         */


        /* Max Min
        int[] arr = {-2, 1, -4, 5, 3};
        resources.Print.print(gfg.MaxMin.findSum(arr, 5));
        int[] arr2 = {1, 3, 4, 1};
        resources.Print.print(gfg.MaxMin.findSum(arr2, 4));

         */


        /* Largest value in each level
        gfg.LargestValueInEachLevel lviel = new gfg.LargestValueInEachLevel();
        int[] arr = {1, 2, 3};
        resources.Node root = resources.Create.createBinaryTree(arr);
        resources.Print.print(lviel.largestValues(root));
        int[] arr2 = {4, 9, 2, 3, 5, -1, 7};
        resources.Node root2 = resources.Create.createBinaryTree(arr2);
        resources.Print.print(lviel.largestValues(root2));

         */


        /* Addition of submatrix
        gfg.AdditionOfSubmatrix aos = new gfg.AdditionOfSubmatrix();
        int[][] matrix = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30}};
        resources.Print.print(aos.subMatrixSum(matrix, 5, 6, 3, 4, 4, 5));
        int[][] matrix2 = {{9, 8, 7},{4, 2, 1},{6, 5, 3}};
        resources.Print.print(aos.subMatrixSum(matrix2, 3, 3, 1, 2, 3, 3));

         */

//        resources.Print.testPrint();
//        resources.Print.print(1);


        /* Akku and Binary Numbers
        gfg.AkkuAndBinaryNumbers aabn = new gfg.AkkuAndBinaryNumbers();
        resources.Print.print(aabn.solve(11L, 19L));
        resources.Print.print(aabn.solve(14L, 19L));
        resources.Print.print(aabn.solve(1L, 10000L));
        resources.Print.print(aabn.solve(1L, (long)(Math.pow(10, 18))));

         */


        /* Break Numbers [Duplicate problem]
        resources.Print.print(gfg.BreakNumbersDuplicateProblem.countWays(3L));
        resources.Print.print(gfg.BreakNumbersDuplicateProblem.countWays(1L));

         */


        /* Lower case to upper case
        gfg.LowerCaseToUpperCase lctuc = new gfg.LowerCaseToUpperCase();
        resources.Print.print(lctuc.to_upper("geeks"));
        resources.Print.print(lctuc.to_upper("geeksforgeeks"));

         */


        /* Compute Before Matrix
        gfg.ComputeBeforeMatrix cbm = new gfg.ComputeBeforeMatrix();
        int[][] matrix = {{1, 3, 6}, {3, 7, 11}};
        resources.Print.print(cbm.computeBeforeMatrix(2, 3, matrix));
        int[][] matrix2 = {{1, 3, 5}};
        resources.Print.print(cbm.computeBeforeMatrix(1, 3, matrix2));

         */


        /* Penalty Shooters
        resources.Print.print(gfg.PenaltyShooters.goals(4, 9, 5));
        resources.Print.print(gfg.PenaltyShooters.goals(13, 10, 7));

         */


        /* Rearranging array
        int[] arr = {4, 5, 1, 2, 3};
        int[] ans = new int[5];
        gfg.RearrangingArray.Rearrange(arr, 5, ans);
        resources.Print.print(ans);
        int[] arr2 = {1, 2, 3, 4};
        int[] ans2 = new int[4];
        gfg.RearrangingArray.Rearrange(arr2, 4, ans2);
        resources.Print.print(ans2);

         */


        /* Snake Case
        resources.Print.print(gfg.SnakeCase.snakeCase("Geeks ForGeeks", 14));
        resources.Print.print(gfg.SnakeCase.snakeCase("Here comes the garden", 21));

         */


        /* Earthquake and the Paint Shop
        gfg.EarthquakeAndThePaintShop eatps = new gfg.EarthquakeAndThePaintShop();
        String[] arr = {"2234597891 zmxvvxbcij 8800654113 jihgfedcba", "1234567891 zxyabcvapo 0123434908 padmadngaa", "1234567891 abcdefghij 9876543219 jihgfedcba", "2234597891 zmxvvxbcij 8800654113 jihgfedcba", "9120121291 zmxvvxbcij 0912114113 mnvxbedcba"};
        resources.Print.print(eatps.sortedStrings(5, arr), true);
        String[] arr2 = {"3122049353 onafrnbhtr 9822827304 yzfhdgzcvx", "3077357272 tojkoumxxs 0732733933 hbivwmrjhj", "2992299540 lpvkgykmlk 6946169466 vdqwvywwgg", "3077357272 tojkoumxxs 0732733933 hbivwmrjhj"};
        resources.Print.print(eatps.sortedStrings(4, arr2), true);

         */


        /* Clone a stack without using extra space
        gfg.CloneAStackWithoutUsingExtraSpace caswues = new gfg.CloneAStackWithoutUsingExtraSpace();
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7};
        Stack<Integer> s = resources.Create.createStack(arr);
        Stack<Integer> cloned = new Stack<>();
        resources.Print.print(s);
        resources.Print.print(cloned);
        caswues.clonestack(s, cloned);
        resources.Print.print(s);
        resources.Print.print(cloned);

         */


        /* Insertion Sort for Singly Linked List
        int[] arr = {30, 23, 28, 30, 11, 14, 19, 16, 21, 25};
        resources.Node root = resources.Create.createNodeLinkedList(arr);
        resources.Print.printNodeLinkedList(gfg.InsertionSortForSinglyLinkedList.insertionSort(root));
        int[] arr2 = {19, 20, 16, 12, 29, 30};
        resources.Node root2 = resources.Create.createNodeLinkedList(arr2);
        resources.Print.printNodeLinkedList(gfg.InsertionSortForSinglyLinkedList.insertionSort(root2));

         */


        /* Remove loop in Linked List
        gfg.RemoveLoopInLinkedList rlill = new gfg.RemoveLoopInLinkedList();

         */


        /* Level order traversal in spiral form
        gfg.LevelOrderTraversalInSpiralForm lotisf = new gfg.LevelOrderTraversalInSpiralForm();
        int[] arr = {1, 3, 2};
        resources.Node root = resources.Create.createBinaryTree(arr);
        resources.Print.print(lotisf.findSpiral(root));
        int[] arr2 = {9, 8, 11, 4, -1, 10, 12, 3, 7, -1, -1, -1, -1, 2, -1, 6, -1, 1, -1, 5, -1, 0};
        resources.Node root2 = resources.Create.createBinaryTree(arr2);
        resources.Print.printBinaryTree(root2);
        resources.Print.print(lotisf.findSpiral(root2));

         */


        /* Clone a Binary resources.Tree
        gfg.CloneABinaryTree cabt = new gfg.CloneABinaryTree();
        int[][] matrix = {{6, 3, 8, -1}, {3, 1, 5, -1}, {8, -1, -1, -1}, {1, -1, -1, 3}, {5, -1, -1, 6}};
        resources.Tree root = resources.Create.createRandomTree(matrix);
        resources.Print.printRandomTree(root);
        resources.Print.printRandomTree(cabt.cloneTree(root));

         */


        /* Postorder Traversal (Iterative)
        gfg.PostorderTraversalIterative pti = new gfg.PostorderTraversalIterative();
        int[] arr = {1, 2, 3, 4, 5};
        resources.Node root = resources.Create.createBinaryTree(arr);
        resources.Print.print(pti.postOrder(root));
        int[] arr2 = {8, 1, 5, -1, 7, 10, 6, -1, -1, -1, 10, 6};
        resources.Node root2 = resources.Create.createBinaryTree(arr2);
        resources.Print.print(pti.postOrder(root2));

         */


        /* Preorder traversal (Iterative)
        gfg.PreorderTraversalIterative pti = new gfg.PreorderTraversalIterative();
        int[] arr = {1, 2, 3, 4, 5};
        resources.Node root = resources.Create.createBinaryTree(arr);
        resources.Print.print(pti.preOrder(root));
        int[] arr2 = {8, 1, 5, -1, 7, 10, 6, -1, -1, -1, 10, 6};
        resources.Node root2 = resources.Create.createBinaryTree(arr2);
        resources.Print.printBinaryTree(root2);
        resources.Print.print(pti.preOrder(root2));

         */


        /* Inorder Traversal (Iterative)
        gfg.InorderTraversalIterative iti = new gfg.InorderTraversalIterative();
        int[] arr = {1, 2, 3, 4, 5};
        resources.Node root = resources.Create.createBinaryTree(arr);
        resources.Print.print(iti.inOrder(root));
        int[] arr2 = {8, 1, 5, -1, 7, 10, 6, -1, -1, -1, 10, 6};
        resources.Node root2 = resources.Create.createBinaryTree(arr2);
        resources.Print.printBinaryTree(root2);
        resources.Print.print(iti.inOrder(root2));

         */


        /* Make Binary resources.Tree From Linked List
        int[] arr = {10, 12, 15, 25, 30, 36};
        resources.Node node = resources.Create.createNodeLinkedList(arr);
        resources.Print.printNodeLinkedList(node);
        resources.Print.printBinaryTree(gfg.MakeBinaryTreeFromLinkedList.convert(node, null));
        int[] arr2 = {5, 4, 3, 2, 1};
        resources.Node node2 = resources.Create.createNodeLinkedList(arr2);
        resources.Print.printNodeLinkedList(node2);
        resources.Print.printBinaryTree(gfg.MakeBinaryTreeFromLinkedList.convert(node2, null));

         */


        /* Height of Binary resources.Tree
        gfg.HeightOfBinaryTree hobt = new gfg.HeightOfBinaryTree();
        int[] arr = {1, 2, 3};
        resources.Node root = resources.Create.createBinaryTree(arr);
        resources.Print.printBinaryTree(root);
        resources.Print.print(hobt.height(root));
        int[] arr2 = {2, -1, 1, -1, -1, 3};
        resources.Node root2 = resources.Create.createBinaryTree(arr2);
        resources.Print.printBinaryTree(root2);
        resources.Print.print(hobt.height(root2));

         */


        /* Merge two BST
        gfg.MergeTwoBST mtbst = new gfg.MergeTwoBST();
        int[] arr1 = {5, 3, 6, 2, 4};
        int[] arr2 = {2, 1, 3, 7, 6};
        resources.Node root1 = resources.Create.createBST(arr1);
        resources.Node root2 = resources.Create.createBST(arr2);
        resources.Print.printLevelOrder(root1);
        resources.Print.printLevelOrder(root2);
        resources.Print.print(mtbst.merge(root1, root2));
        int[] arr3 = {12, 9, 6, 11};
        int[] arr4 = {8, 5, 10, 2};
        resources.Node root3 = resources.Create.createBST(arr3);
        resources.Node root4 = resources.Create.createBST(arr4);
        resources.Print.printLevelOrder(root3);
        resources.Print.printLevelOrder(root4);
        resources.Print.print(mtbst.merge(root3, root4));

         */


        /* Rotate a Linked List
        gfg.RotateALinkedList rall = new gfg.RotateALinkedList();
        int[] arr = {2, 4, 7, 8, 9};
        resources.Node root = resources.Create.createNodeLinkedList(arr);
        resources.Print.printNodeLinkedList(rall.rotate(root, 3));
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        resources.Node root2 = resources.Create.createNodeLinkedList(arr2);
        resources.Print.printNodeLinkedList(rall.rotate(root2, 4));

         */


        /* Valid Substring
        resources.Print.print(gfg.ValidSubstring.findMaxLen("(()("));
        resources.Print.print(gfg.ValidSubstring.findMaxLen("()(())("));

        */


        /* Equilibrium point
        long[] arr = {1L, 3L, 5L, 2L, 2L};
        resources.Print.print(gfg.EquilibriumPoint.equilibriumPoint(arr, 5));
        long[] arr2 = {1L};
        resources.Print.print(gfg.EquilibriumPoint.equilibriumPoint(arr2, 1));

         */


        /* Integer to Words
        gfg.IntegerToWords itw = new gfg.IntegerToWords();
        resources.Print.print(itw.convertToWords(438237764L));
        resources.Print.print(itw.convertToWords(1000L));

         */


        /* Check if array is sorted
        gfg.CheckIfArrayIsSorted ciais = new gfg.CheckIfArrayIsSorted();
        int[] arr = {10, 20, 30, 40, 50};
        resources.Print.print(ciais.arraySortedOrNot(arr, 5));
        int[] arr2 = {90, 80, 100, 70, 40, 30};
        resources.Print.print(ciais.arraySortedOrNot(arr2, 6));

         */

        /* Winner of an election
        String[] arr = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"};
        resources.Print.print(gfg.WinnerOfAnElection.winner(arr, 13));
        String[] arr2 = {"andy", "blake", "clark"};
        resources.Print.print(gfg.WinnerOfAnElection.winner(arr2, 3));

         */


        /* Searching a number
        gfg.SearchingANumber san = new gfg.SearchingANumber();
        int[] arr = {9, 7, 2, 16, 4};
        resources.Print.print(san.search(arr, 5, 16));
        int[] arr2 = {1, 22, 57, 47, 34, 18, 66};
        resources.Print.print(san.search(arr2, 7, 98));

         */


        /* Even Odd
        gfg.EvenOdd eo = new gfg.EvenOdd();
        eo.evenOdd(2, 3);
        eo.evenOdd(5, 2);

         */


        /* Two Repeated Elements
        gfg.TwoRepeatedElements tre = new gfg.TwoRepeatedElements();
        int[] arr = {1, 2, 1, 3, 4, 3};
        resources.Print.print(tre.twoRepeated(arr, 4));
        int[] arr2 = {1, 2, 2, 1};
        resources.Print.print(tre.twoRepeated(arr2, 2));

         */


        /* Ancestors in Binary resources.Tree
        int[] arr = {1, 2, 3, 4, 5, -1, -1, 7};
        resources.Node root = resources.Create.createBinaryTree(arr);
        resources.Print.printLevelOrder(root);
        resources.Print.print(gfg.AncestorsInBinaryTree.Ancestors(root, 7));
        int[] arr2 = {1, 2, 3};
        resources.Node root2 = resources.Create.createBinaryTree(arr2);
        resources.Print.printLevelOrder(root2);
        resources.Print.print(gfg.AncestorsInBinaryTree.Ancestors(root2, 2));

         */


        /* Check whether BST contains Dead End
        gfg.CheckWhetherBSTContainsDeadEnd cwbstcde = new gfg.CheckWhetherBSTContainsDeadEnd();
        int[] arr = {8, 5, 9, 2, 7, 1};
        resources.Node root = resources.Create.createBST(arr);
        resources.Print.print((cwbstcde.isDeadEnd(root) ? 1 : 0));
        int[] arr2 = {8, 7, 10, 9, 13, 2};
        resources.Node root2 = resources.Create.createBST(arr2);
        resources.Print.print((cwbstcde.isDeadEnd(root2) ? 1: 0));

         */


        /* Move all negative elements to end
        gfg.MoveAllNegativeElementsToEnd manete = new gfg.MoveAllNegativeElementsToEnd();
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        manete.segregateElements(arr, 8);
        resources.Print.print(arr);
        int[] arr2 = {-5, 7, -3, -4, 9, 10, -1, 11};
        manete.segregateElements(arr2, 8);
        resources.Print.print(arr);

         */


        /* Counting elements in two arrays
        gfg.CountingElementsInTwoArrays ceita = new gfg.CountingElementsInTwoArrays();
        int[] arr1 = {1, 2, 3, 4, 7, 9};
        int[] arr2 = {0, 1, 2, 1, 1, 4};
        int m = 6, n = 6;
        resources.Print.print(ceita.countEleLessThanOrEqual(arr1, arr2, m, n));
        int[] arr3 = {4, 8, 7, 5, 1};
        int[] arr4 = {4, 48, 3, 0, 1, 1, 5};
        int m2 = 5, n2 = 7;
        resources.Print.print(ceita.countEleLessThanOrEqual(arr3, arr4, m2, n2));

         */


        /* BFS of graph
        gfg.BFSOfGraph bfsog = new gfg.BFSOfGraph();
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
        resources.Print.print(bfsog.bfsOfGraph(V, adj));

        int V2 = 3;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        ArrayList<Integer> zeroList2 = new ArrayList<>();
        zeroList2.add(1);
        zeroList2.add(2);
        adj2.add(zeroList2);
        adj2.add(new ArrayList<>());
        adj2.add(new ArrayList<>());
        resources.Print.print(bfsog.bfsOfGraph(V2, adj2));

        */


        /* First and last occurrences of x
        gfg.FirstAndLastOccurrencesOfX flox = new gfg.FirstAndLastOccurrencesOfX();
        long arr[] = new long[]{1, 3, 5, 5, 5, 5, 67, 123, 125};
        resources.Print.print(flox.find(arr, 9, 5));
        long arr2[] = new long[]{1, 3, 5, 5, 5, 5, 7, 123, 125};
        resources.Print.print(flox.find(arr2, 9, 7));

        */


        /* Sorted insert for circular linked list
        gfg.SortedInsertForCircularLinkedList sifcll = new gfg.SortedInsertForCircularLinkedList();
        int arr[] = new int[]{1, 2, 4};
        resources.Node head = resources.Create.createCircularLinkedList(arr);
        resources.Print.printCircular(gfg.SortedInsertForCircularLinkedList.sortedInsert(head, 2));
        int arr2[] = new int[]{1, 4, 7, 9};
        resources.Node head = resources.Create.createCircularLinkedList(arr);
        resources.Print.printCircular(gfg.SortedInsertForCircularLinkedList.sortedInsert(head, 5));

         */


        /* Find n/k th node in Linked List
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        resources.Node head = resources.Create.createNodeLinkedList(arr);
        resources.Print.print(gfg.FindNKthNodeInLinkedList.nknode(head, 2));
        int[] arr2 = new int[]{2, 7, 9, 3, 5};
        resources.Node head2 = resources.Create.createNodeLinkedList(arr2);
        resources.Print.print(gfg.FindNKthNodeInLinkedList.nknode(head2, 3));

         */


        /* Multiply two linked lists
        int[] arr1 = new int[]{3, 2};
        int[] arr2 = new int[]{2};
        resources.Node head1 = resources.Create.createNodeLinkedList(arr1);
        resources.Node head2 = resources.Create.createNodeLinkedList(arr2);
        resources.Print.print(gfg.MultiplyTwoLinkedLists.multiplyTwoLists(head1, head2));
        int[] arr1 = new int[]{1, 0, 0};
        int[] arr2 = new int[]{1, 0};
        resources.Node head1 = resources.Create.createNodeLinkedList(arr1);
        resources.Node head2 = resources.Create.createNodeLinkedList(arr2);
        resources.Print.print(gfg.MultiplyTwoLinkedLists.multiplyTwoLists(head1, head2));

        */


        /* Operating an array
        gfg.OperatingAnArray oaa = new gfg.OperatingAnArray();
        int[] arr = new int[]{2, 4, 1, 0, 6};
        int[] ops = new int[]{1, 2, 2, 0};
        resources.Print.print(oaa.operate(arr, ops));
        int[] arr2 = new int[]{801, 661, 730, 878, 305, 320};
        int[] ops2 = new int[]{736, 444, 0, 522};
        resources.Print.print(oaa.operate(arr2, ops2));

         */
    }
}
