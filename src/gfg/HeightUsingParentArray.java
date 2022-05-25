package gfg;

public class HeightUsingParentArray{
    static int findHeight(int N, int arr[]){
        // code here
        int max = -1;
        for(int i = N - 1; i >= 0; i--){
            int count = 1;
            int j = arr[i];
            while(j != -1){
                j = arr[j];
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
