package gfg;

import resources.Node;

import java.util.LinkedList;
import java.util.Queue;

public class CoronaVaccine{
    private static int vac = 0;

    public static int supplyVaccine(Node root){
        // Your code goes here
        if(root == null){
            return 0;
        }
        vac = 0;
        int top = dfs(root);
        return vac + (top == 0 ? 1 : 0);
    }

    private static int dfs(Node root){
        if(root != null){
            int left = dfs(root.left);
            int right = dfs(root.right);
            if(left == 1 && right == 1){
                return 0;
            }else if(left == 0 || right == 0){
                vac++;
                return 2;
            }
        }
        return 1;
    }
}
