public class SumOfDistinctElementsForALimitedRange{
    long sumOfDistinct(long arr[], int N){
        long sum = 0L;
        for(int i = 0; i < arr.length; i++){
            long num = Math.abs(arr[i]);
            if(arr[(int)(num - 1L)] > 0){
                sum += num;
                arr[(int)(num - 1L)] *= -1L;
            }
        }
        return sum;
    }
}
