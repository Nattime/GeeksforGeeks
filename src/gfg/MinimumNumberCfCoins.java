package gfg;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberCfCoins{
    static List<Integer> minPartition(int N){
        // code here
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        List<Integer> list = new ArrayList<>();
        for(int note : notes){
            if(N == 0){
                break;
            }
            while(N != 0 && note <= N){
                N = N - note;
                list.add(note);
            }
        }
        return list;
    }
}
