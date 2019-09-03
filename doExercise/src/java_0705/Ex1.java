package java_0705;

import java.util.Scanner;

/**
 * @program: doExercise
 * @description: 年会抽奖
 * @author: fwb
 * @create: 2019-07-05 18:12
 **/
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int i = in.nextInt();
            double d = (double)1/i*100;
            System.out.format("%.2f",d);
            System.out.println("%");
        }
    }
}
