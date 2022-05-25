package gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternativeSorting{
    ArrayList<Long> alternateSort(long arr[], int N){
        // Your code goes here
        Arrays.sort(arr);
        ArrayList<Long> list = new ArrayList<>();
        for(int i = 0, j = N - 1; i <= j; i++, j--){
            list.add(arr[j]);
            if(i != j){
                list.add(arr[i]);
            }
        }
        return list;
    }
}