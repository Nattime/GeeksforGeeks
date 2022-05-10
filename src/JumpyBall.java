public class JumpyBall{
    static long jumpyBall(long N){
        // code here
        if(N <= 0){
            return 0;
        }
        return N * 2 + jumpyBall(N / 2);
    }
}
