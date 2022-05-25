package gfg;

import java.util.Map;
import java.util.TreeMap;

public class EarthquakeAndThePaintShop {
    alphanumeric[] sortedStrings(int N, String A[]) {
        Map<String, Integer> m = new TreeMap<>();
        for(String iter : A){
            if(m.containsKey(iter)){
                m.replace(iter, m.get(iter) + 1);
            }else{
                m.put(iter, 1);
            }
        }
        alphanumeric[] ret = new alphanumeric[m.size()];
        int i = 0;
        for(Map.Entry<String, Integer> iter : m.entrySet()){
            ret[i++] = new alphanumeric(iter.getKey(), iter.getValue());
        }
        return ret;
    }
}
class alphanumeric {
    public String name;
    public int count;
    alphanumeric(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return name + " " + count;
    }
};