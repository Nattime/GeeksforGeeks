package gfg;

public class TomAndString{
    public static long hashString(String s){
        // Code Here
        String hash = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        long num = 0L;
        String[] arr = s.split(" ");
        for(String iter : arr){
            for(int i = 0; i < iter.length(); i++){
                num += (i + hash.indexOf(iter.charAt(i) + ""));
            }
        }
        return num * arr.length;
    }
}
