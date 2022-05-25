package gfg;

import java.util.ArrayList;

public class InversePermutation{
    public static ArrayList<Integer> inversePermutation (int arr[], int n) {
        //Complete the function
        int[] ret = new int[n];
        for(int i = 0; i < n; i++){
            ret[arr[i] - 1] = i + 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int iter : ret){
            list.add(iter);
        }
        return list;
    }
}
