package gfg;

import java.util.*;

public class CardRotation{
    public ArrayList rotation(int N){
        // Code Here
        ArrayList<Integer> ret = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            q.add(i);
        }
        int i = 1;
        while(!q.isEmpty()){
            for(int j = 0; j < i; j++){
                int n = q.remove();
                q.add(n);
            }
            int n = q.remove();
            arr[n] = i;
            i++;
        }

        for(int iter : arr){
            if(iter < 1){
                return new ArrayList(Collections.singleton(new int[]{-1}));
            }
            ret.add(iter);
        }
        return ret;
    }
}
