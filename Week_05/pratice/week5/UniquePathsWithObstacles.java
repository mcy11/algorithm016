package pratice.week5;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-15 10:26
 */
public class UniquePathsWithObstacles {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0){
            return 0;
        }
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] map = new int[m][n];
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
            map[i][0] = 1;
        }
        for (int i = 0; i < n && obstacleGrid[0][i] == 0; i++){
            map[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 0){
                    map[i][j] = map[i - 1][j] + map[i][j - 1];
                }
            }
        }
        return map[m - 1][n - 1];
    }
}
