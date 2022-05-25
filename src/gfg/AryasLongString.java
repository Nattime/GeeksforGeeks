package gfg;

public class AryasLongString{
    public static int fun(String s, int k, int n, char c){
        // Your code here
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        count *= (int)(n / s.length());
        for(int i = 0; i < ((n % s.length())); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
}
