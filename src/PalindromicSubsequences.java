public class PalindromicSubsequences{
    public int MinRemove(int n, String s){
        //complete the function here
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        if(str.toString().equals(s)){
            return 1;
        }
        return 2;
    }
}
