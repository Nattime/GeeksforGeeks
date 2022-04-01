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
}
