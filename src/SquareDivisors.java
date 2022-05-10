public class SquareDivisors{
    static int squareFactor(long N){
        // code here
        int count = 0;
        for(int i = 1; i <= Math.sqrt(N); i++){
            if(N % (i * i) == 0){
                count++;
            }
        }
        return count;
    }
}
