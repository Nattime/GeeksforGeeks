public class MaximumWinningScore{
    public static Long findMaxScore(Node root){
        //code here
        if(root == null){
            return 1L;
        }
        return root.data * Math.max(findMaxScore(root.left), findMaxScore(root.right));
    }
}
