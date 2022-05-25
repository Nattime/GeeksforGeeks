package gfg;

public class OrderingOfStrings{
    String[] orderString(String s[], int n){
        String[] arr = {s[0], s[0]};

        for(String iter : s){
            arr[0] = (iter.compareTo(arr[0]) < 0 ? iter : arr[0]);
            arr[1] = (iter.compareTo(arr[1]) > 0 ? iter : arr[1]);
        }

        return arr;
    }
}
