import resources.Node;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversalIterative {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        // Code
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Node trav = root;
        while(!s.empty() || trav != null){
            if(trav != null){
                s.push(trav);
                trav = trav.left;
            }else{
                trav = s.pop();
                list.add(trav.data);
                trav = trav.right;
            }
        }

        return list;
    }
}
