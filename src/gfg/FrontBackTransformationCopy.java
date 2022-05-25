package gfg;

public class FrontBackTransformationCopy{
    String convert(String s){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                str.append((char)('Z' - (ch - 'A')));
            }else{
                str.append((char)('z' - (ch - 'a')));
            }
        }

        return str.toString();
    }
}
