import java.util.HashMap;
import java.util.Map;

public class WinnerOfAnElection {
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String[] arr, int n)
    {
        // add your code
        String name = "";
        int max = 1;
        Map<String, Integer> map = new HashMap<>();
        for(String iter : arr){
            if(map.containsKey(iter)){
                int count = map.get(iter) + 1;
                if(count > max){
                    max = count;
                    name = iter;
                }else if(count == max){
                    name = name.compareTo(iter) > 0 ? iter : name;
                }
                map.replace(iter, count);
            }else{
                map.put(iter, 1);
                if(name.equals("")){
                    name = iter;
                }else if(max == 1){
                    name = name.compareTo(iter) > 0 ? iter : name;
                }
            }
        }

        return new String[]{name, "" + max};

        // Map<String, Integer> map = new HashMap<>();
        // int max = 1;
        // Set<String> set = new HashSet<>();
        // for(String iter : arr){
        //     if(map.containsKey(iter)){
        //         int count = map.get(iter) + 1;
        //         if(count > max){
        //             set = new HashSet<>();
        //             max = count;
        //             set.add(iter);
        //         }else if(count == max){
        //             set.add(iter);
        //         }
        //         map.replace(iter, count);
        //     }else{
        //         map.put(iter, 1);
        //         if(max <= 1){
        //             set.add(iter);
        //         }
        //     }
        // }
        // String name = "";
        // for(String iter : set){
        //     if(name.equals("")){
        //         name = iter;
        //     }else{
        //         if(name.compareTo(iter) > 0){
        //             name = iter;
        //         }
        //     }
        // }
        // return new String[]{name, "" + max};
    }
}
