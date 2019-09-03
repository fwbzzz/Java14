/**
 * @program: 动态规划
 * @description: 给定一个由非负整数填充的m x n的二维数组，现在要从二维数组的左上角走到右下角，请找出路径上的所有数字之和最小的路径。 注意：你每次只能向下或向右移动。
 * @author: fwb
 * @create: 2019-08-29 16:48
 **/
public class ex8 {
    public static void main(String[] args) {


    }
    public static int minPathSum(int[][] grid) {
         int m = grid.length;
         int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i = 1; i <  m; i++){
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for(int j = 1; j < n; j++){
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = Math.min(dp[i - 1][j],dp[i][j -1]) + grid[i][j];
            }
        }
        return dp[m -1][n - 1];
    }
}
