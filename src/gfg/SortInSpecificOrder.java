package gfg;

import java.util.Collections;
import java.util.PriorityQueue;

public class SortInSpecificOrder{
    public void sortIt(long[] arr, long n){
        //code here.
        PriorityQueue<Long> pq = new PriorityQueue<>();
        PriorityQueue<Long> rpq = new PriorityQueue<>(Collections.reverseOrder());
        for(long iter : arr){
            if(iter % 2L == 0){
                pq.add(iter);
            }else{
                rpq.add(iter);
            }
        }
        int i = 0;
        while(!rpq.isEmpty()){
            arr[i++] = rpq.poll();
        }
        while(!pq.isEmpty()){
            arr[i++] = pq.poll();
        }
    }
}
