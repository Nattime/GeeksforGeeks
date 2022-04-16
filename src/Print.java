import java.util.*;

public class Print {
    public static void print(int[] arr){
        if(arr == null || arr.length == 0){
            System.out.println("Is empty");
        }else{
            for(int iter : arr){
                System.out.print(iter + " ");
            }System.out.println();
        }
    }
    public static void print(boolean bool){
        System.out.println(bool);
    }
    public static void print(long num){
        System.out.println(num);
    }
    public static void print(int num){
        System.out.println(num);
    }

    public static void printInOrder(Node node){
        printInOrderHelper(node);
        System.out.println();
    }
    private static void printInOrderHelper(Node node){
        if(node != null){
            printInOrderHelper(node.getPrev());
            System.out.print(node.getData() + " ");
            printInOrderHelper(node.getNext());
        }
    }
    public static void printPreOrderHelper(Node node){
        if(node != null){
            System.out.print(node.getData() + " ");
            printPreOrderHelper(node.getPrev());
            printPreOrderHelper(node.getNext());
        }
    }
    public static void print(String str){
        System.out.println(str);
    }
    public static void printPostOrderHelper(Node node){
        if(node != null){
            printPostOrderHelper(node.getPrev());
            printPostOrderHelper(node.getNext());
            System.out.print(node.getData() + " ");
        }
    }
    public static void print(List list){
        if(list == null || list.isEmpty()){
            System.out.println("Is empty");
        }else{
            for(Object iter : list){
                System.out.print(iter + " ");
            }System.out.println();
        }
    }
    public static void printCircular(Node n){
        if(n == null){
            System.out.println("Is Empty");
        }else{
            System.out.print(n.getData());
            Node trav = n.getNext();
            while(trav != n){
                System.out.print(" " + trav.getData());
                trav = trav.getNext();
            }
            System.out.println();
        }
    }

    public static void printPreOrder(Node root) {
        printPreOrderHelper(root);
        System.out.println();
    }

    public static void printPostOrder(Node root) {
        printPostOrderHelper(root);
        System.out.println();
    }

    public static void printLevelOrder(Node root) {
        printLevelOrderHelper(root);
        System.out.println();
    }

    private static void printLevelOrderHelper(Node root){
        if(root == null){
            System.out.println("Empty tree");
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.print("N ");
            }else {
                System.out.print(curr.getData() + " ");
                q.add(curr.getLeft());
                q.add(curr.getRight());
            }
        }
    }

    public static void print(String[] arr) {
        if(arr.length <= 0) {
            System.out.println("Empty array.");
        }else{
            for(String iter : arr){
                System.out.print(iter + " ");
            }System.out.println();
        }
    }

    public static void printBinaryTree(Node root){
        printLevelOrder(root);
    }

    public static void print(Node root) {
        if(root == null){
            System.out.println("Is empty.");
        }
        assert root != null;
        if(root.getRight() != null){
            while(root != null){
                System.out.print(root.getData() + " ");
                root = root.getRight();
            }System.out.println();
        }else{
            while(root != null){
                System.out.print(root.getData() + " ");
                root = root.getNext();
            }System.out.println();
        }
    }
    public static void printRandomTree(Tree root){
        if(root == null){
            System.out.println("Is empty.");
        }else{
            Queue<Tree> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Tree curr = q.remove();
                System.out.print(curr.data + " ");
                if(curr.left != null){
                    q.add(curr.left);
                    System.out.print(curr.left.data + " ");
                }else{
                    System.out.print("N ");
                }
                if(curr.right != null){
                    q.add(curr.right);
                    System.out.print(curr.right.data + " ");
                }else{
                    System.out.print("N ");
                }
                if(curr.random != null){
                    System.out.print(curr.random.data);
                }else{
                    System.out.print("N ");
                }
                System.out.println();
            }
        }
    }
}
