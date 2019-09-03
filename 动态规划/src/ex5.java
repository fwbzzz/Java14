import java.util.ArrayList;

/**
 * @program: 动态规划
 * @description: 给出一个三角形，计算从三角形顶部到底部的最小路径和，
 * 每一步都可以移动到下面一行相邻的数字，
 * 例如，给出的三角形如下：. [↵ [2],↵       [3,4],↵     [6,5,7],↵   [4,1,8,3]↵]
 * 最小的从顶部到底部的路径和是2 + 3 + 5 + 1 = 11。
 * 注意： 如果你能只用O（N）的额外的空间来完成这项工作的话，就可以得到附加分，其中N是三角形中的行总数。 注：这是一个等腰三角形
 * @author: fwb
 * @create: 2019-08-25 21:20
 **/
public class ex5 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList(a);
        b.add(a.add(4));
        System.out.println(b);
        System.out.println(a);
    }

    public class Solution {
        public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
            for (int i = triangle.size() - 2; i >= 0; i --) {
                for (int j = 0; j < triangle.get(i + 1).size() - 1; j ++) {
                    int min = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                    triangle.get(i).set(j, triangle.get(i).get(j) + min);
                }
            }
            return triangle.get(0).get(0);
        }
    }


}
