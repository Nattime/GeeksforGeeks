package gfg;

public class ChangeBits{
    public static int[] changeBits(int N){
        // code here
        int num = N;
        int s = 0;
        while(num > 0){
            s <<= 1;
            s = (s | 1);
            num >>= 1;
        }
        return new int[]{Math.abs(N - s), s};
    }
}
