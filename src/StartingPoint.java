public class StartingPoint{
    public int[] findStartingPoint(int x, int y, int[][] pathCoordinates){
        // Code here
        int[] arr = {x, y};
        for(int row = pathCoordinates.length - 1; row >= 0; row--){
            arr[0] -= pathCoordinates[row][0];
            arr[1] -= pathCoordinates[row][1];
        }
        return arr;
    }
}
