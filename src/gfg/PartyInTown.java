package gfg;

import resources.Print;

import java.util.ArrayList;

public class PartyInTown{
    public static int partyHouse(int N, ArrayList<ArrayList<Integer>> adj){
        // code here
        int ret = N;
        int size = N + 1;
        for(int i = 1; i < size; i++){
            boolean[] visited = new boolean[size];
            visited[i] = true;
            ret = Math.min(ret, help(i, adj, visited));
        }
        return ret;
    }

    public static int help(int ind, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        int fn = 0;
        ArrayList<Integer> list = adj.get(ind);
        for(Integer num : list){
            if(!visited[num]){
                visited[num] = true;
                fn = Integer.max(fn, 1 + help(num, adj, visited));
            }
        }
        return fn;
    }
}
