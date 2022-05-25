package gfg;

public class AddingOnes{
    public static void update(int a[], int n, int updates[], int k){
        // Your code goes here
        for(int update : updates){
            a[update - 1]++;
        }
        for(int i = 1; i < a.length; i++){
            a[i] += a[i - 1];
        }
    }
}
