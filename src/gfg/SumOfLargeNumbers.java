package gfg;

public class SumOfLargeNumbers{
    public String add(String s1, String s2){
        // code here
        StringBuilder str = new StringBuilder();
        int rem = 0;
        int s1End = s1.length() - 1;
        int s2End = s2.length() - 1;
        for(; s1End >= 0 || s2End >= 0; s1End--, s2End--){
            int sum = rem;
            if(s1End >= 0){
                sum += (s1.charAt(s1End) - '0');
            }
            if(s2End >= 0){
                sum += (s2.charAt(s2End) - '0');
            }
            rem = sum / 10;
            sum = sum % 10;
            str.append(sum);
        }
        if(rem != 0){
            str.append(rem);
        }
        return str.reverse().toString();
    }
}
