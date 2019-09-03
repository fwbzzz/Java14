/**
 * @program: 动态规划
 * @description: 跳台阶
 * @author: fwb
 * @create: 2019-08-23 13:49
 **/
public class ex2 {
    public static void main(String[] args) {
        System.out.println(JumpFloorII(5));
    }

    public static int JumpFloorII(int target) {
        int f1 = 1;
        int next = 0;
        if(target <= 0)
            return 0;
        if(target == 1)
            return 1;
        for(int i = 2; i <= target; i++){
            next = 2*f1;
            f1 = next;
        }
        return next;
    }

    public  static int JumpFloorII2(int target) {
        int f1 = 1;
        int next = 0;
        if (target == 1){
            return 1;
        }
        next = 2*JumpFloorII2(target -1 );
        return next;
    }
}
