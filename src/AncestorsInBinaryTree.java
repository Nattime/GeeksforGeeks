import java.util.ArrayList;

public class AncestorsInBinaryTree {
    public static ArrayList<Integer> Ancestors(Node root, int target)
    {
        // add your code here
        if(root == null){
            return null;
        }
        if(root.data == target){
            return new ArrayList<>();
        }else{
            ArrayList<Integer> left = Ancestors(root.left, target);
            ArrayList<Integer> right = Ancestors(root.right, target);
            if(left != null){
                left.add(root.data);
                return left;
            }else if(right != null){
                right.add(root.data);
                return right;
            }else{
                return null;
            }
        }
    }
}
