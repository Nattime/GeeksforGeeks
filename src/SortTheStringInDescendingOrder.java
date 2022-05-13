public class SortTheStringInDescendingOrder{
    String ReverseSort(String str){
        // code here
        String[] arr = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            arr[(int)(ch - 'a')] += (ch + "");
        }
        StringBuilder ret = new StringBuilder();
        for(int i = 25; i >= 0; i--){
            ret.append(arr[i]);
        }
        return ret.toString();
    }
}
