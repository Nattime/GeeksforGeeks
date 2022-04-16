import java.util.ArrayList;
import java.util.Stack;

public class PostorderTraversalIterative {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        ArrayList<Integer> ret = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Node temp;
        while(!s.isEmpty() || node != null){
            if(node != null){
                s.push(node);
                node = node.left;
            }else{
                temp = s.peek().right;
                if(temp == null){
                    temp = s.pop();
                    ret.add(temp.data);
                    while(!s.isEmpty() && s.peek().right == temp){
                        temp = s.pop();
                        ret.add(temp.data);
                    }
                }else{
                    node = temp;
                }
            }
        }
        return ret;
    }
}
