import java.util.LinkedList;
import java.util.Queue;

public class MoveAllNegativeElementsToEnd {
    public void segregateElements(int[] arr, int n) {
        // Your code goes here
        Queue<Integer> q = new LinkedList<>();
        int index = 0;
        for(int iter : arr){
            if(iter < 0){
                q.add(iter);
            }else{
                arr[index] = iter;
                index++;
            }
        }
        while(!q.isEmpty()){
            arr[index++] = q.remove();
        }
    }
}
