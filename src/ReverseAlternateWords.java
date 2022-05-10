public class ReverseAlternateWords{
    String reverseAlternate(String s){
        // code here
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 1){
                String ss = arr[i];
                for(int j = ss.length() - 1; j >= 0; j--){
                    str.append(ss.charAt(j));
                }
                str.append(" ");
            }else{
                str.append(arr[i] + " ");
            }
        }
        return str.toString();
    }
}
