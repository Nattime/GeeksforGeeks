package gfg;

public class TriangularNumber{
    int isTriangular(int N){
        //code here
        N = N * 8 + 1;
        int s = (int)Math.sqrt(N);
        return Math.sqrt(N) == s ? 1 : 0;
    }
}
