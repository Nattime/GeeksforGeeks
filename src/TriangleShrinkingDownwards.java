public class TriangleShrinkingDownwards{
    static String triDownwards(String S){
        // code here
        StringBuilder str = new StringBuilder();
        String st = "";
        for(int i = 0; i < S.length(); i++){
            str.append(st + S.substring(i, S.length()));
            st += ".";
        }
        return str.toString();
    }
}
