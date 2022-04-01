import java.util.ArrayList;
import java.util.Arrays;

public class CountingElementsInTwoArrays {
    public int findCount(int arr[], int num, int begin, int end){
        if(arr[end] <= num){
            return end + 1;
        }
        if(arr[begin] <= num){
            int mid = (begin + end) / 2;
            if(arr[mid] <= num && arr[mid + 1] > num){
                return mid + 1;
            }else if(arr[mid] <= num){
                return findCount(arr, num, mid, end);
            }else if(arr[mid] > num){
                return findCount(arr, num, begin, mid - 1);
            }
        }
        return 0;
    }
    public ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        // add your code here
        Arrays.sort(arr2);
        ArrayList<Integer> ret = new ArrayList<>();
        for(int iter : arr1){
            ret.add(findCount(arr2, iter, 0, n - 1));
        }
        return ret;
    }
}
