package gfg;

import java.util.ArrayList;
import java.util.List;

public class ConnellSequence{
    public static List<Integer> connellSequence(int n){
        // code here
        List<Integer> list = new ArrayList<>();
        int num = 1;
        int start = 0;
        int curr = 0;
        for(int i = 1; i <= n; i++){
            if(curr <= 0){
                curr = num;
                num++;
                start++;
            }else{
                start += 2;
            }
            list.add(start);
            curr--;
        }
        return list;
    }
}
