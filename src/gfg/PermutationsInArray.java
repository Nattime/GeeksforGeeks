package gfg;

import java.util.Arrays;

public class PermutationsInArray{
    public boolean isPossible(long a[], long b[], long n, long k){
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        for(long i = 0L; i < n; i++){
            if(a[(int)i] + b[(int)(n - 1L - i)] < k){
                return false;
            }
        }
        return true;
    }
}
