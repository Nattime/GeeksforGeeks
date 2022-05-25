package gfg;

public class SquareDivisors{
    static int squareFactor(long N){
        // code here
        int count = 0;
        for(long i = 1; i <= Math.sqrt(N); i++){
            if(N % (i * i) == 0L){
                count++;
            }
        }
        return count;
    }
}
