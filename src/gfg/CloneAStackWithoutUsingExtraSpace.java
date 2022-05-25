package gfg;

import java.util.Stack;

public class CloneAStackWithoutUsingExtraSpace {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        // code here
        int size = st.size();
        while(size > 0){
            for(int i = 0; i < size - 1; i++){
                cloned.push(st.pop());
            }
            int num = st.pop();
            for(int i = 0; i < size - 1; i++){
                st.push(cloned.pop());
            }
            cloned.push(num);
            size--;
        }
    }
}
