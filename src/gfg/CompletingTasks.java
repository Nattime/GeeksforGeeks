package gfg;

import java.util.ArrayList;

public class CompletingTasks{
    public Tasks findTasks(int[] arr, int m, int n){
        // code here
        boolean[] nums = new boolean[n];
        for(int iter : arr){
            nums[iter - 1] = true;
        }
        Tasks ret = new Tasks();
        boolean isT = true;
        for(int i = 0; i < n; i++){
            if(!nums[i]){
                if(isT){
                    ret.tanya.add(i + 1);
                    isT = false;
                }else{
                    ret.manya.add(i + 1);
                    isT = true;
                }
            }
        }
        return ret;
    }
}

class Tasks{
    ArrayList<Integer> tanya, manya;

    Tasks(){
        tanya = new ArrayList<>();
        manya = new ArrayList<>();
    }

    @Override
    public String toString(){
        return tanya.toString() + "\n" + manya.toString();
    }
}
