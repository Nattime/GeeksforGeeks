package gfg;

import java.util.LinkedList;
import java.util.List;

public class WordBreakPartTwo{
    public static List<String> wordBreak(int n, List<String> dict, String s){
        // code here
        List<String> list = new LinkedList<>();
        help("", dict, s, list);
        return list;
    }

    public static void help(String str, List<String> dict, String s, List<String> list){
        if(s.length() == 0){
            list.add(str.trim());
            return;
        }
//        System.out.println(str + " " + s);
        for(int i = 1; i <= s.length(); i++){
            String strr = s.substring(0, i);
            if(dict.contains(strr)){
                help(str + " " + strr, dict, s.substring(i), list);
            }
        }
    }
}
