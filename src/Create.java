import java.util.LinkedList;
import java.util.Queue;

public class Create {
    static Node createBinaryTree(int[] arr){
        if(arr.length < 1){
            return null;
        }
        Node root = new Node(arr[0]);

        for(int i = 1; i < arr.length; i++){
            binaryTreeAdd(root, arr[i]);
        }
        transformTree(root);
        return root;
    }
    static void transformTree(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();

            if(curr.left != null){
                if(curr.left.data == -1){
                    curr.left = null;
                }else{
                    q.add(curr.left);
                }
            }
            if(curr.right != null){
                if(curr.right.data == -1){
                    curr.right = null;
                }else{
                    q.add(curr.right);
                }
            }
        }
    }
    static void binaryTreeAdd(Node root, int num){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr.left == null){
                curr.left = new Node(num);
                return;
            }
            q.add(curr.left);
            if(curr.right == null){
                curr.right = new Node(num);
                return;
            }
            q.add(curr.right);
        }
    }
    static Node createBST(int[] arr){
        if(arr.length < 1){
            return null;
        }
        Node root = new Node(arr[0]);
        for(int i = 1; i < arr.length; i++){
            bstAdd(root, arr[i]);
        }
        return root;
    }
    static void bstAdd(Node root, int num){
        if(root != null){
            if(root.data > num){
                if(root.prev != null){
                    bstAdd(root.prev, num);
                }else{
                    root.prev = new Node(num);
                }
            }else if(root.data < num){
                if(root.next != null){
                    bstAdd(root.next, num);
                }else{
                    root.next = new Node(num);
                }
            }
        }


    }
    static Node createNodeLinkedList(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node trav = head;
        for(int i = 1; i < arr.length; i++){
            trav.next = new Node(arr[i]);
            trav = trav.next;
        }
        return head;
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
