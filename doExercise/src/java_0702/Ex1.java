package java_0702;

import java.util.Scanner;

/**
 * @program: doExercise
 * @description: 给定正整数n，求它的各位之和以及平方的各位之和
 * @author: fwb
 * @create: 2019-07-03 08:23
 **/
public class Ex1 {
    public void jisuan(int n){
        int a = n*n;
        int sum1 = 0;
        int sum2 = 0;
        while(n > 0){
            sum1 += n%10;
            n = n/10;
        }
        while(a > 0){
            sum2 += a%10;
            a = a/10;
        }
        System.out.println(sum1 + " " + sum2);
    }

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        Ex1 java_0703 = new Ex1();
        int a = in.nextInt();
        java_0703.jisuan(a);
    }
}
