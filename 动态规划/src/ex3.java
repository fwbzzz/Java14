/**
 * @program: 动态规划
 * @description: 求最大连续向量和
 * @author: fwb
 * @create: 2019-08-23 15:34
 **/
public class ex3 {
    public static void main(String[] args) {
        System.out.println(FindGreatestSumOfSubArray(new int[]{1,2,35}));
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        int next = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            next = Math.max(next + array[i], array[i]);
            max = Math.max(max, next);
        }
        return max;
    }
}
