package gfg;

import resources.Print;

public class NumberOfPositiveIntegralSolutions{
    public long posIntSol(String s){
        //code here.
        long n = Long.parseLong(s.substring(s.indexOf('=') + 1)) - 1L;
        long up = 1L;
        long it = 1L;
        long down = 1L;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '+'){
                down *= (it++);
                up *= n--;
            }
        }

        return up / down;
    }
}
