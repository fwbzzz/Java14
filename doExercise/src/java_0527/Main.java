//package java_0527;
//
//import java.util.Scanner;
//
//    /**
//     * @program: doExercise
//     * @description:
//     * @author: fwb
//     * @create: 2019-05-28 10:41
//     **/
////    public class Main{
////        public static void main(String[] args){
////            Scanner in = new Scanner(System.in);
////            while(in.hasNextInt()){
////                int W = in.nextInt();
////                int H = in.nextInt();
////                if (W==1 || H==1){
////                    System.out.println(1);
////                }
////                System.out.println((W * H) - (W - 2)*H - (H -2)*W);
////            }
////        }
////}
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNextInt()){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int A = a;
//            int B = b;
//            if(B > A){
//                A = A^B;
//                B = A^B;
//                A = A^B;
//            }
//            if (B==0){
//                System.out.println("错误");
//                return;
//            }
//            if (A%B==0){
//                System.out.println(a * b / B);
//            }
//            while(A % B > 0){
//                int m = A % B;
//                A = B;
//                B = m;
//                if (A%B == 0){
//                    System.out.println(a*b/B);
//                }
//            }
//        }
//    }
//}
//// 最大公约数
////public static int get_gL,
////    if (n1 < n2) {// 交换n1、n2的值
////        n1 = n1 + n2;
////        n2 = n1 - n2;
////        n1 = n1 - n2;
////    }
////
////    if (n1 % n2 == 0) {
////        gcd = n2;
////    }
////
////    while (n1 % n2 > 0) {
////        n1 = n1 % n2;
////
////        if (n1 < n2) {
////            n1 = n1 + n2;
////            n2 = n1 - n2;
////            n1 = n1 - n2;
////        }
////
////        if (n1 % n2 == 0) {
////            gcd = n2;
////        }
////    }
////    return gcd;
////
////}
////
////    // 最小公倍数
////    public static int get_lcm(int n1, int n2) {
////        return n1 * n2 / get_gcd(n1, n2);
////    }
////
////    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////        System.out.print("请输入第一个整数：");
////        int n1 = input.nextInt();
////        System.out.print("请输入第二个整数：");
////        int n2 = input.nextInt();
////        System.out.println("(" + n1 + "," + n2 + ")" + "=" + get_gcd(n1, n2));
////        System.out.println("[" + n1 + "," + n2 + "]" + "=" + get_lcm(n1, n2));
////    }
////}
