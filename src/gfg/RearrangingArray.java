package gfg;

import java.util.Arrays;

public class RearrangingArray {
    public static void Rearrange(int a[], int n, int answer[])
    {
        Arrays.sort(a);
        for(int i = 0, j = n - 1, k = 0; i <= j && k < n; i++, j--, k += 2){
            answer[k] = a[i];
            if(k + 1 < n){
                answer[k + 1] = a[j];
            }
        }
    }
}
