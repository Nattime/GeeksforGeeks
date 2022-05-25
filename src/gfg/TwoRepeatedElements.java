package gfg;

public class TwoRepeatedElements {
    public int[] twoRepeated(int[] arr, int N)
    {
        // Your code here
        int[] ret = new int[2];
        int ind = 0;
        for(int i = 0; i < arr.length; i++){
            int num = Math.abs(arr[i]);
            if(arr[num] < 0){
                ret[ind++] = num;
            }
            arr[num] *= -1;
        }
        return ret;
    }
}
