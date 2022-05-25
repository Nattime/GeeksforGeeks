package gfg;

import resources.Node;

import java.util.PriorityQueue;

public class LargestSubtreeSumInATree{
    public static int max = 0;

    public static int findLargestSubtreeSum(Node root){
        // code here
        max = 0;
        help(root);
        return max;
    }

    public static int help(Node root){
        // code here
        if(root == null){
            return 0;
        }
        int sum = root.data + help(root.left) + help(root.right);
        max = Math.max(max, sum);
        return sum;
    }
}
