public class SortAString{
    String sort(String s){
        // code here
        String[] arr = new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[(ch - 'a')] += (ch + "");
        }
        StringBuilder str = new StringBuilder();
        for(String iter : arr){
            str.append(iter);
        }
        return str.toString();
    }
}
