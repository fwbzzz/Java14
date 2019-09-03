/**
 * @program: 动态规划
 * @description: 一个机器人在m×n大小的地图的左上角（起点，下图中的标记“start"的位置）。 机器人每次向下或向右移动。机器人要到达地图的右下角。（终点，下图中的标记“Finish"的位置）。 可以有多少种不同的路径从起点走到终点？
 * @author: fwb
 * @create: 2019-08-29 14:07
 **/
public class ex6 {
    public static void main(String[] args) {
        System.out.println(solution(3,7));

    }
        public static int solution(int m, int n) {
            int[][] dp = new int[m][n];
            for(int i = 0; i <  m; i++){
                dp[i][0] = 1;
            }
            for(int j = 0; j < n; j++){
                dp[0][j] = 1;
            }
            for(int i = 1; i < m; i++){
                for(int j = 1; j < n; j++){
                    dp[i][j] = dp[i - 1][j] + dp[i][j -1];
                }
            }
            return dp[m -1][n - 1];
        }
    }




