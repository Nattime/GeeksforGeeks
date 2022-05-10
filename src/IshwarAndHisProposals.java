import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IshwarAndHisProposals{
    ArrayList<Integer> acceptedProposals(int[] arr, int n){
        // your code here
        PriorityQueue<Integer> nq = new PriorityQueue<>();
        PriorityQueue<Integer> rq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int iter : arr){
            nq.add(iter);
            rq.add(iter);
            if(nq.size() > 2){
                nq.poll();
            }
            if(rq.size() > 2){
                rq.poll();
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nq.poll());
        list.add(rq.poll());
        return list;
    }
}
