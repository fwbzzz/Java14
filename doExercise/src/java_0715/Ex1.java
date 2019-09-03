package java_0715;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: doExercise
 * @description: 木棒拼图
 * @author: fwb
 * @create: 2019-07-15 11:56
 **/
public class Ex1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while(in.hasNextInt()){
            int countI = 0;
            int max = 0;//最大值
            int countL = 0;//和
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                int i = in.nextInt();
                int L = in.nextInt();
                if (L > max){
                    max = L;
                }
                if(i == 1){
                    countI++;
                    countL = countL + L;
                }else{
                    countI--;
                    countL = countL - L;
                }
                System.out.println(max);
                System.out.println(countL);
                if (countI < 3){
                    System.out.println("No");
                }else{
                    if ((countL - max) > max)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            }
        }
    }
}
