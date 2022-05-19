import java.util.ArrayList;
import java.util.List;

public class PrintThePattern{
    static List<String> pattern(int n){
        // code here
        List<String> list = new ArrayList<>();
        int num = 1;
        for(int i = 1; i <= n; i++){
            StringBuilder str = new StringBuilder();
            str.append("--".repeat(Math.max(0, i - 1)));
            str.append(num++);
            for(int j = 0; j < n - i; j++){
                str.append("*").append(num++);
            }
            list.add(str.toString());
        }
        for(int i = n - 1; i >= 0; i--){
            StringBuilder str = new StringBuilder();
            for(int j = 0; j < n - i; j++){
                str.append("*").append(num++);
            }
            list.set(i, list.get(i) + str);
        }
        return list;
    }
}
