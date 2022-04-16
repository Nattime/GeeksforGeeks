import java.util.Stack;

public class ValidSubstring {
    static int findMaxLen(String S) {
        // code here
        Stack<Integer> st = new Stack<>();
        int count = 0;
        st.push(-1);
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                st.push(i);
            } else if (S.charAt(i) == ')') {
                st.pop();
                if (!st.empty()) {
                    count = Math.max(count, i - st.peek());
                } else {
                    st.push(i);
                }
            }
        }
        return count;
    }
}
