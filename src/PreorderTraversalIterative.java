import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversalIterative {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        // Code
        ArrayList<Integer> ret = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.empty()){
            Node curr = s.pop();
            ret.add(curr.data);
            if(curr.right != null){
                s.push(curr.right);
            }
            if(curr.left != null){
                s.push(curr.left);
            }
        }
        return ret;
    }
}
