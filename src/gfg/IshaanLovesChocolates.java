package gfg;

public class IshaanLovesChocolates{
    // Function for finding maximum and value pair
    public static int chocolates(int arr[], int n){
        //Complete the function
        int smallest = arr[0];
        for(int iter : arr){
            smallest = Math.min(smallest, iter);
        }
        return smallest;
    }
}
