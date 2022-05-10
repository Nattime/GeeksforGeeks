import java.util.Arrays;

public class MaximumPossibleSumOfProducts{
    long MaxSum(long[] A, long[] B, int N){
        // code here
        Arrays.sort(A);
        Arrays.sort(B);
        long sum = 0L;
        for(int i = 0; i < N; i++){
            sum += A[i] * B[i];
        }
        return sum;
    }
}
