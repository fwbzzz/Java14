/**
 * @program: 动态规划
 * @description: 斐波那契
 * @author: fwb
 * @create: 2019-08-23 13:05
 **/
//1 1 2 3 5
public class ex1 {
    public static void main(String[] args) {
        System.out.println(ex2(5));
    }
    public static int ex(int n){
        int f1 = 1;
        int f2 = 1;
        int next = 0;
        if (n<=0)
            return 0;
        if (n == 2|| n == 1){
            return 1;
        }
        for (int i = 3; i <= n; i++) {
           next = f1 + f2;
           f2 = f1;
           f1 = next;
        }
        return next;
    }


    public static int ex2(int n){
        if (n == 0 || n == 1){
            return n;
        }
         int sum = ex2(n - 1) + ex2(n - 2);
        return sum;
    }

}
