import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSOfGraph {

    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ret = new ArrayList<>();
        boolean[] visitedArr = new boolean[adj.size()];

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.poll();
            ret.add(curr);
            visitedArr[curr] = true;
            for(Integer iter : adj.get(curr)){
                if(!visitedArr[iter]){
                    visitedArr[iter] = true;
                    q.add(iter);
                }
            }
        }
        return ret;
    }
}
