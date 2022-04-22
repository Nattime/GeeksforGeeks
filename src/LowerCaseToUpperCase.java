public class LowerCaseToUpperCase {
    String to_upper(String str)
    {
        // code here
        StringBuilder ss = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            ss.append(Character.toUpperCase(str.charAt(i)));
        }
        return ss.toString();
    }
}
