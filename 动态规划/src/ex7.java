/**
 * @program: 路径总数扩展
 * @description: 如果在图中加入了一些障碍，有多少不同的路径？ 分别用0和1代表空区域和障碍 例如 下图表示有一个障碍在3*3的图中央。 [↵  [0,0,0],↵  [0,1,0],↵  [0,0,0]↵] 有2条不同的路径 备注：m和n不超过100.
 * @author: fwb
 * @create: 2019-08-29 15:30
 **/
public class ex7 {
    public static void main(String[] args) {
        int[][] c = new int[][]{{0,0,0},{1,0,0}};
        System.out.println(ex(c));

    }
    public static int ex(int[][] obstacleGrid){
        int m = obstacleGrid.length;//行
        int n = obstacleGrid[0].length;//列
        int[][] b = new int[m][n];
        for (int i = 0; i < m ; i++) {
            if (obstacleGrid[i][0] == 1){
                 break;
            }else
                b[i][0] = 1;
        }
        for (int j = 0; j < n ; j++) {
            if (obstacleGrid[0][j] == 1){
                break;
            }else
                b[0][j] = 1;
        }
        for (int i = 1; i < m; i++){
            for (int j  = 1; j < n; j++){
                if (obstacleGrid[i][j] == 0)
                    b[i][j] = b[i - 1][j] + b[i][j - 1];
            }
        }
        return b[m -1][n -1];
    }
}

