package gfg;

public class SnakeCase {
    static String snakeCase(String S , int n) {
        // code here
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < n; i++){
            char ch = S.charAt(i);
            if(ch == ' '){
                str.append('_');
            }else{
                str.append(Character.toLowerCase(ch));
            }
        }
        return str.toString();
    }
}
