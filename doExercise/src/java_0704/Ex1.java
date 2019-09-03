package java_0704;

import java.util.Scanner;

/**
 * @program: doExercise
 * @description: 守形数，625,25
 * @author: fwb
 * @create: 2019-07-04 20:49
 **/
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a*a;
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        str2 = str2.substring(1);
        if (str1.equals(str2)){
            System.out.println("Yes!");
        }else
            System.out.println("No!");
    }
}
