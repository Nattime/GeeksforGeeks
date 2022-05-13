import resources.Node;

public class CheckWhetherBSTContainsDeadEnd {
    public boolean isDeadEnd(Node root)
    {
        //Add your code here.
        return helper(root, 0, Integer.MAX_VALUE);
    }
    public boolean helper(Node root, int min, int max) {
        if (root == null) {
            return false;
        }
        if (root.prev == null && root.next == null) {
            return root.data == min + 1 && root.data == max - 1;
        }

        return helper(root.prev, min, root.data) || helper(root.next, root.data, max);
    }
}
