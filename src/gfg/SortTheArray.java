package gfg;

public class SortTheArray{
    int[] sortArr(int[] arr, int n){
        // code here
        for(int i = n / 2 - 1; i >= 0; i--){
            heapsort(arr, n, i);
        }
        for(int i = n - 1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapsort(arr, i, 0);
        }
        return arr;
    }

    private void heapsort(int[] arr, int n, int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if(l < n && arr[l] > arr[largest]){
            largest = l;
        }
        if(r < n && arr[r] > arr[largest]){
            largest = r;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapsort(arr, n, largest);
        }
    }
}
