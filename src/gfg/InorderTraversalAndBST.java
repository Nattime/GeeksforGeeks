package gfg;

public class InorderTraversalAndBST{
    public static int isRepresentingBST(int[] arr, int N){
        // code here
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= arr[i - 1]){
                return 0;
            }
        }
        return 1;
    }
}
