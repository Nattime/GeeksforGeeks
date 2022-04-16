import java.util.LinkedList;
import java.util.Queue;

public class MakeBinaryTreeFromLinkedList {
    //Function to make binary tree from linked list.
    public static Tree convert(Node head, Tree node) {
        // add code here.}
        if(head == null){
            return null;
        }

        node = new Tree(head.data);
        Queue<Tree> q = new LinkedList<>();
        q.add(node);
        head = head.next;
        while(head != null){
            Tree curr = q.peek();
            Tree n = new Tree(head.data);
            if(curr.left == null){
                curr.left = n;
            }else{
                curr.right = n;
                q.remove();
            }
            q.add(n);

            head = head.next;
        }

        return node;
    }
}
