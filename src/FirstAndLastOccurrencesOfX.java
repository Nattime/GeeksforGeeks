import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {
    public static void main(String[] args) {
        GFG gfg = new GFG();
        long arr[] = new long[]{1, 3, 5, 5, 5, 5, 7, 123, 125};
        Print p = new Print();
        p.print(gfg.find(arr, 9, 7));
    }
}
class GFG
{
    long first = -1L;
    long last = -1L;
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        if(arr[arr.length - 1] < (long)x || arr[0] > (long)x){
            list.add(-1L);
            list.add(-1L);
            return list;
        }

        first = (long)(arr.length - 1);

        search(arr, (long)x, 0, arr.length - 1);

        if(last == -1){
            list.add(last);
        }else{
            list.add(first);
        }
        list.add(last);

        return list;
    }

    void search(long[] arr, long x, int begin, int end){
        if(arr[begin] == x){
            if(begin < first){
                first = (long)begin;
            }
            if(begin > last){
                last = (long)begin;
            }
        }
        if(arr[end] == x){
            if(end < first){
                first = (long)end;
            }
            if(end > last){
                last = (long)end;
            }
        }
        if(begin < end){
            int mid = (begin + end) / 2;
            search(arr, x, begin, mid);
            search(arr, x, mid + 1, end);
        }
    }
}
