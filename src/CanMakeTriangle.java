public class CanMakeTriangle{
    int[] canMakeTriangle(int A[], int N){
        // code here
        int[] ret = new int[A.length - 2];
        for(int i = 0; i < A.length - 2; i++){
            int a = A[i];
            int b = A[i + 1];
            int c = A[i + 2];
            if(a + b > c && a + c > b && b + c > a){
                ret[i] = 1;
            }else{
                ret[i] = 0;
            }
        }
        return ret;
    }
}
