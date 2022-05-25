package gfg;

public class UpperCaseConversion{
    public String transform(String s){
        // code here
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(String iter : arr){
            str.append(Character.toUpperCase(iter.charAt(0)) + iter.substring(1) + " ");
        }
        return str.toString().trim();
    }
}
