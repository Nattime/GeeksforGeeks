public class MaximumWinningScore{
    public static Long findMaxScore(Node root){
        //code here
        return help(root, 1L);
    }

    public static Long help(Node node, Long mul){
        if(node == null){
            return mul;
        }
        return Math.max(help(node.left, mul * node.data), help(node.right, mul * node.data));
    }
}
