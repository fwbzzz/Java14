package java_0703;

import java.util.Scanner;

/**
 * @program: doExercise
 * @description: 判断一个数在数组中有多少个
 * @author: fwb
 * @create: 2019-07-03 21:18
 **/

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i] = in.nextInt();
        }
        int x = in.nextInt();
        int count = 0;
        for (int i = 0;i < n ; i++) {
            if (array[i] == x){
                System.out.println(i);
                count++;
            }
        }
        if (count == 0){
            System.out.println(-1);
        }
    }
}
