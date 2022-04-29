public class ProgramToPrintReciprocalOfLettersCopy{
    static String reciprocalString(String S){
        // code here
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if(ch == ' '){
                str.append(" ");
            }else if(Character.isUpperCase(ch)){
                str.append((char)('Z' - (ch - 'A')));
            }else{
                str.append((char)('z' - (ch - 'a')));
            }
        }

        return str.toString();
    }
}
