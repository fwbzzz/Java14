/*
finally（异常出口）
 */
public class Tset2 {
    public static void main(String[] args) {
        System.out.println("1.计算开始前");
        try {
            System.out.println("1.计算开始"+(10/0));
        }finally {
            System.out.println("4.finally代码块");
        }
//        System.out.println("1.计算开始"+(10/0));//此处出错导致后面代码都无法执行
        System.out.println("3.计算开始结束");
    }
}
