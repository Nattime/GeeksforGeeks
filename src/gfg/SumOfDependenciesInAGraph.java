package gfg;

import java.util.ArrayList;

public class SumOfDependenciesInAGraph{
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int sum = 0;
        for(ArrayList<Integer> list : adj){
            sum += list.size();
        }
        return sum;
    }
}
