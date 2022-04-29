public class MaxMin{
    public static int findSum(int A[],int N)
    {
        //code here
        int min = A[0];
        int max = A[0];
        for(int iter : A){
            min = Math.min(iter, min);
            max = Math.max(iter, max);
        }
        return min + max;
    }
}
