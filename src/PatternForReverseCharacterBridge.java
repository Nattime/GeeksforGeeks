public class PatternForReverseCharacterBridge{
    static String[] revCharBridge(int N){
        // code here
        String[] arr = new String[N];
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < N - 1; i++){
            temp.append((char)('A' + i));
        }
        String str = temp.toString();
        String rev = temp.reverse().toString();
        temp = new StringBuilder(" ");
        arr[0] = str + (char)('A' + N - 1) + rev;
        for(int i = 1; i < N; i++){
            arr[i] = str.substring(0, N - i) + temp.toString() + rev.substring(i - 1);
            temp.append("  ");
        }
        return arr;
    }
}
