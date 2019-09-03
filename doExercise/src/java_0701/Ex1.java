package java_0701;
import java.util.Scanner;

/**
 * @program: doExercise
 * @description: 求总评绩点
 * @author: fwb
 * @create: 2019-07-02 10:28
 **/
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        double sum1 = 0;
        double sum2 = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++){
                if (i == 0){
                     a[j] = sc.nextInt();//绩点
                     sum1 += a[j];
                }
                if (i == 1){
                    double y = (double)sc.nextInt();//分数
                    if (y>=90 && y<=100){
                        y = 4.0;
                    }else if (y>=85 && y<=89){
                        y = 3.7;
                    }else if (y>=82 && y<=84){
                        y = 3.3;
                    }else if (y>=78 && y<=81){
                        y = 3.0;
                    }else if (y>=75 && y<=77){
                        y = 2.7;
                    }else if (y>=72 && y<=74){
                        y = 2.3;
                    }else if (y>=68 && y<=71){
                        y = 2.0;
                    }else if (y>=64 && y<=67){
                        y = 1.5;
                    }else if (y>=60 && y<=63){
                        y = 1.0;
                    }else{
                        y = 0.0;
                    }
                    sum2 += a[j]*y;
                }
            }
        }
        double d = (double)sum2/sum1;
        System.out.format("%.2f",d);
    }
}
