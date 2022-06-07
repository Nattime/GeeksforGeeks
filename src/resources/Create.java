package resources;

import resources.Node;

import java.util.*;

public class Create{
    public static void test(){
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 1};
        PriorityQueue<Integer> pq = createPriorityQueue(arr);
        Print.print(pq);
    }

    public static Tree createRandomTree(int[][] matrix){
        Map<Integer, Tree> m = new HashMap<>();
        System.out.println(matrix.length + " len ");
        for(int[] iter : matrix){
            int num = iter[0];
            if(!m.containsKey(num)){
                Tree t = new Tree(num, setTree(iter[1], m), setTree(iter[2], m), setTree(iter[3], m));
                m.put(num, t);
            }else{
                Tree t = m.get(num);
                t.right = (setTree(iter[1], m));
                t.left = (setTree(iter[2], m));
                t.setRandom(setTree(iter[3], m));
            }
        }

        return m.get(matrix[0][0]);
    }

    public static Tree setTree(int data, Map<Integer, Tree> m){
        if(data == -1){
            return null;
        }
        if(m.containsKey(data)){
            return m.get(data);
        }
        Tree tree = new Tree(data);
        m.put(data, tree);
        return tree;
    }

    public static Node createBinaryTree(int[] arr){
        if(arr.length < 1){
            return null;
        }
        return binaryTreeHelper(arr);
    }

    private static Node binaryTreeHelper(int[] arr){
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        for(int i = 1; i < arr.length; i++){
            Node curr = q.remove();
            if(arr[i] == -1){
                curr.setLeft(null);
            }else{
                Node n = new Node(arr[i]);
                curr.setLeft(n);
                q.add(n);
            }
            i++;
            if(i < arr.length){
                if(arr[i] == -1){
                    curr.setRight(null);
                }else{
                    Node n = new Node(arr[i]);
                    curr.setRight(n);
                    q.add(n);
                }
            }
        }
        return root;
    }

    public static void transformTree(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();

            if(curr.left != null){
                if(curr.left.data == -1){
                    curr.prev = curr.left = null;
                }else{
                    q.add(curr.left);
                }
            }
            if(curr.right != null){
                if(curr.right.data == -1){
                    curr.next = curr.right = null;
                }else{
                    q.add(curr.right);
                }
            }
        }
    }

    public static Node createBST(Integer[] arr){
        if(arr.length < 1){
            return null;
        }
        Node root = new Node(arr[0]);
        Set<Integer> s = new HashSet<>();
        s.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != null){
                if(!s.contains(arr[i])){
                    s.add(arr[i]);
                    bstAdd(root, arr[i]);
                }
            }
        }
        return root;
    }

    public static Node createBST(int[] arr){
        return createBST(arr, false);
    }

    public static Node createBST(int[] arr, boolean isOneANumber){
        if(arr.length < 1){
            return null;
        }
        Set<Integer> s = new HashSet<>();
        s.add(arr[0]);
        Node root = new Node(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
                bstAdd(root, arr[i]);
            }
        }
        return root;
    }

    public static void bstAdd(Node root, int num){
        if(root != null){
            if(root.data > num){
                if(root.left != null){
                    bstAdd(root.left, num);
                }else{
                    root.left = new Node(num);
                }
            }else{
                if(root.right != null){
                    bstAdd(root.right, num);
                }else{
                    root.right = new Node(num);
                }
            }
        }
    }

    public static LNode createLinkedListLNode(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        LNode head = new LNode(arr[0]);
        LNode trav = head;
        for(int i = 1; i < arr.length; i++){
            trav.right = trav.next = new LNode(arr[i]);
            trav = trav.next;
        }
        return head;
    }

    public static Node createNodeLinkedList(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node trav = head;
        for(int i = 1; i < arr.length; i++){
            trav.right = trav.next = new Node(arr[i]);
            trav = trav.next;
        }
        return head;
    }

    public static Node createCircularLinkedList(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node trav = head;
        for(int i = 1; i < arr.length; i++){
            trav.right = trav.next = new Node(arr[i]);
            trav = trav.next;
        }
        trav.next = head;
        return head;
    }

    public static Stack<Integer> createStack(int[] arr){
        Stack<Integer> s = new Stack<>();
        for(int iter : arr){
            s.push(iter);
        }
        return s;
    }

    public static ArrayList<ArrayList<Integer>> createArrayList(int[][] mat){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

        for(int[] outer : mat){
            ArrayList<Integer> list = new ArrayList<>();
            for(int iter : outer){
                list.add(iter);
            }
            ret.add(list);
        }

        return ret;
    }

    public static PriorityQueue<Integer> createPriorityQueue(int[] arr){
        return createPriorityQueue(arr, null);
    }

    public static PriorityQueue<Integer> createPriorityQueue(int[] arr, Comparator<Integer> comparator){
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
        for(int iter : arr){
            pq.add(iter);
        }
        return pq;
    }
}
