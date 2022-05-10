import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumDiamonds{
    static int maxDiamonds(int[] A, int N, int K){
        // code here
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int iter : A){
            q.add(iter);
        }
        int sum = 0;
        for(int i = 0; i < K; i++){
            // System.out.print(q);
            int num = q.poll();
            q.add(num / 2);
            sum += num;
        }
        return sum;
    }
}
