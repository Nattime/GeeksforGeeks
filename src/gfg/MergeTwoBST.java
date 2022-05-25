package gfg;

import resources.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MergeTwoBST {
    //Function to return a list of integers denoting the node
    //values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2)
    {
        // Write your code here
        List<Integer> ret = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        Node trav1 = root1;
        Node trav2 = root2;
        while(!s1.empty() || !s2.empty() || trav1 != null || trav2 != null){
            if(trav1 != null && trav2 != null){
                s1.push(trav1);
                trav1 = trav1.left;
                s2.push(trav2);
                trav2 = trav2.left;
            }else if(trav2 != null){
                s2.push(trav2);
                trav2 = trav2.left;
            }else if(trav1 != null){
                s1.push(trav1);
                trav1 = trav1.left;
            }else{
                if(!s1.empty() && !s2.empty()){
                    trav1 = s1.peek();
                    trav2 = s2.peek();
                    if(trav1.data <= trav2.data){
                        ret.add(trav1.data);
                        s1.pop();
                        trav1 = trav1.right;
                        trav2 = null;
                    }else{
                        ret.add(trav2.data);
                        s2.pop();
                        trav2 = trav2.right;
                        trav1 = null;
                    }
                }else if(s2.empty()){
                    trav1 = s1.pop();
                    ret.add(trav1.data);
                    trav1 = trav1.right;
                }else if(s1.empty()){
                    trav2 = s2.pop();
                    ret.add(trav2.data);
                    trav2 = trav2.right;
                }
            }
        }
        return ret;
    }
}
