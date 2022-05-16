import java.util.ArrayList;

public class MeanOfRangeInArray{
    public ArrayList<Integer> findMean(int arr[], int queries[], int n, int q){
        // Complete the function
        int[] sumArr = new int[arr.length + 1];
        sumArr[0] = 0;
        for(int i = 0; i < n; i++){
            sumArr[i + 1] = arr[i] + sumArr[i];
        }
        ArrayList<Integer> list = new ArrayList<>();
        int ind = 0;
        for(int j = 1; j <= q / 2; j++){
            int l = queries[ind++];
            int r = queries[ind++];
            int size = (r - l) + 1;
            list.add((sumArr[r + 1] - sumArr[l]) / size);
        }
        return list;
    }
}
