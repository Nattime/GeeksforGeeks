import java.util.ArrayList;
import java.util.List;

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
            printInOrderHelper(node.prev);
            System.out.print(node.data + " ");
            printInOrderHelper(node.next);
        }
    }
    public static void printPreOrderHelper(Node node){
        if(node != null){
            System.out.print(node.data + " ");
            printPreOrderHelper(node.prev);
            printPreOrderHelper(node.next);
        }
    }
    public static void print(String str){
        System.out.println(str);
    }
    public static void printPostOrderHelper(Node node){
        if(node != null){
            printPostOrderHelper(node.prev);
            printPostOrderHelper(node.next);
            System.out.print(node.data + " ");
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
            System.out.print(n.data);
            Node trav = n.next;
            while(trav != n){
                System.out.print(" " + trav.data);
                trav = trav.next;
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
}
