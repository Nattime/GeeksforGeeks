package gfg;

import resources.Node;

import java.util.ArrayList;
import java.util.Stack;

public class LevelOrderTraversalInSpiralForm {
    //Function to return a list containing the level order
    //traversal in spiral form.
    ArrayList<Integer> findSpiral(Node root)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root != null){
            Stack<Node> sL = new Stack<>();
            Stack<Node> sR = new Stack<>();
            sL.push(root);
            while(!sL.empty() || !sR.empty()){
                if(!sL.empty()){
                    while(!sL.empty()){
                        Node curr = sL.pop();
                        list.add(curr.data);
                        if(curr.right != null){
                            sR.push(curr.right);
                        }
                        if(curr.left != null){
                            sR.push(curr.left);
                        }
                    }
                }else if(!sR.empty()){
                    while(!sR.empty()){
                        Node curr = sR.pop();
                        list.add(curr.data);
                        if(curr.left != null){
                            sL.push(curr.left);
                        }
                        if(curr.right != null){
                            sL.push(curr.right);
                        }
                    }
                }
            }
        }

        return list;
    }
}
