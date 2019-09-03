package java_0529;
import java.util.Scanner;
/**
 * @program: doExercise
 * @description: 求阶乘结果有几个零
 * @author: fwb
 * @create: 2019-05-30 10:38
 **/

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            long sum = 1;
            for(int i = 1;i <= n;i++){
                sum = sum * i;
            }
            String strs = String.valueOf(sum);
            System.out.println(sum);
            char[] data = strs.toCharArray();
            int count = 0;
            for (int i = 0; i < data.length; i++) {
                if(data[i] == '0'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}