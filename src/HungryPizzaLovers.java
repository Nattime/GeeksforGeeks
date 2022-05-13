import java.util.ArrayList;

public class HungryPizzaLovers{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> permute(int arr[][], int n){
        //Complete the function
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        list.sort((i, j)->{
            return (arr[i - 1][0] + arr[i - 1][1]) - (arr[j - 1][0] + arr[j - 1][1]);
        });
        return list;
    }
}
