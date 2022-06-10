package gfg;

import java.util.PriorityQueue;

public class HelpAThief{
    public static int maxCoins(int[] A, int[] B, int T, int N){
        // code here
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b)->b[1] - a[1]);
        for(int i = 0; i < N; i++){
            q.add(new int[]{A[i], B[i]});
        }
        int ret = 0;
        while(T > 0 && !q.isEmpty()){
            int[] arr = q.poll();
            int size = arr[0];
            int num = arr[1];
            if(T >= size){
                ret += size * num;
            }else{
                ret += (T * num);
            }
            T -= size;
        }
        return ret;
    }
}
