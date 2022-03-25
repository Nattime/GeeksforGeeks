import java.util.ArrayList;

public class Print {
    public static void print(ArrayList<Long> list){
        if(list.isEmpty() || list == null){
            System.out.println("Is empty");
        }else{
            for(Long iter : list){
                System.out.print(iter + " ");
            }System.out.println();
        }
    }
}
