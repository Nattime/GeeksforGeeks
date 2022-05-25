package gfg;

public class CountSubstrings{
    int countSubstr(String S){
        // your code here
        int count = 0;
        int sum = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '1'){
                sum += count;
                count++;
            }
        }
        return sum;
    }
}
