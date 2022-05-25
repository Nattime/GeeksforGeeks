package gfg;

import resources.Node;

public class MaximumSumLeaftoRootPath{
    public static int max = 0;

    public static int maxPathSum(Node root){
        //code here
        return help(root, 0);
    }

    public static int help(Node n, int sum){
        if(n == null){
            return (Math.max(sum, max));
        }
        if(n.left == null && n.right == null){
            return (Math.max(sum + n.data, max));
        }
        return Math.max(help(n.left, sum + n.data), help(n.right, sum + n.data));
    }
}
