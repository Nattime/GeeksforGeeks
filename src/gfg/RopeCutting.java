package gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class RopeCutting{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> ropeCutting(int arr[], int n){
        // Complete the Function
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n - 1; i++){
            if(arr[i] != arr[i + 1]){
                list.add(n - i - 1);
            }
        }
        return list;
    }
}
