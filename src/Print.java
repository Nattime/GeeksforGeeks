import java.util.ArrayList;

public class Print {
    public static void print(int num){
        System.out.println(num);
    }
    public static void print(ArrayList<Long> list){
        if(list == null || list.isEmpty()){
            System.out.println("Is empty");
        }else{
            for(Long iter : list){
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
