import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeekAndStrings{
    static List<Integer> prefixCount(int N, int Q, String li[], String query[]){
        // code here
        List<Integer> list = new ArrayList<>();
        Trie root = new Trie();
        for(String s : li){
            insert(root, s);
        }
        for(String s : query){
            list.add(search(root, s));
        }
        return list;
    }

    static void insert(Trie root, String s){
        for(int i = 0; i < s.length(); i++){
            int ind = s.charAt(i) - '0';
            if(root.alpha[ind] == null){
                root.alpha[ind] = new Trie();
                root = root.alpha[ind];
                root.count[ind]++;
            }else{
                root = root.alpha[ind];
                root.count[ind]++;
            }
        }
    }

    static int search(Trie root, String s){
        for(int i = 0; i < s.length(); i++){
            int ind = s.charAt(i) - '0';
            if(root.alpha[ind] == null){
                return 0;
            }
            root = root.alpha[ind];
        }
        return root.count[s.charAt(s.length() - 1) - '0'];
    }
}

class Trie{
    Trie[] alpha = new Trie[126];
    int[] count = new int[126];

    public Trie(){
        for(int i = 0; i < 126; i++){
            alpha[i] = null;
            count[i] = 0;
        }
    }
}
