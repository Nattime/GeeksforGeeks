package gfg;

import resources.Node;

public class MaximumDepthOfBinaryTree{
    public int max = 0;
    public int maxDepth(Node root) {
        // code here
        help(root, 0);
        return max;
    }
    public void help(Node node, int height){
        if(node != null){
            int h = height + 1;
            if(h > max){
                max = h;
            }
            help(node.left, h);
            help(node.right, h);
        }
    }
}
