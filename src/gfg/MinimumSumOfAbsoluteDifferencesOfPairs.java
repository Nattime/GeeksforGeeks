package gfg;

import java.util.Arrays;

public class MinimumSumOfAbsoluteDifferencesOfPairs{
    public long findMinSum(int[] A,int[] B,int N) {
        long mini = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < N; i++){
            mini += Math.abs(A[i] - B[i]);
        }
        return mini;
    }
}
