package gfg;

public class Pattern1{
    static String[] findThePattern(int N){
        // code here
        String[] str = new String[N];
        char ch = 'A';
        for(int i = 0; i < N; i++){
            StringBuilder st = new StringBuilder();
            for(int j = 0; j < N; j++){
                if(i == 0 || i == N - 1){
                    st.append(ch++);
                }else{
                    if(j == 0 || j == N - 1){
                        st.append(ch++);
                    }else{
                        st.append('$');
                    }
                }
            }
            str[i] = st.toString();
        }
        return str;
    }
}
