public class MagicalStringDuplicateProblem{
    static String magicalString(String S){
        // code here
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            char ch = (char)('z' - (S.charAt(i) - 'a'));
            str.append(ch);
        }
        return str.toString();
    }
}
