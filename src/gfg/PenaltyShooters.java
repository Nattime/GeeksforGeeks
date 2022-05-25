package gfg;

import java.util.ArrayList;
import java.util.List;

public class PenaltyShooters {
    static List<Integer> goals(int X, int Y, int Z)
    {
        // code here
        List<Integer> ret = new ArrayList<>();
        int g = 0;
        int n = 0;

        while(Z != 1){
            if(X % Z == 0 && Y % Z == 0){
                g++; X--;
            }else if(X % Z != 0 && Y % Z != 0){
                Z--;
            }else if(X % Z != 0 && Y % Z == 0){
                n++; Y--;
            }else if(X % Z == 0 && Y % Z != 0){
                g++; X--;
            }
        }
        ret.add(g);
        ret.add(n);

        return ret;
    }
}
