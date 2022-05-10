import java.util.ArrayList;

public class PatternOfStrings{
    ArrayList<String> pattern(String S){
        // code here
        ArrayList<String> list = new ArrayList<>();
        for(int i = S.length(); i > 0; i--){
            S = S.substring(0, i);
            list.add(S);
        }
        return list;
    }
}
