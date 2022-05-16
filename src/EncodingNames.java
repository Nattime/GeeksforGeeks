public class EncodingNames{
    static String encodeTheName(String S){
        // code here
        int offset = 10;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            str.append((int)(S.charAt(i) - (offset - i)));
        }
        return str.toString();
    }
}
