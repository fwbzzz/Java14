package java_0709;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: doExercise
 * @description: 2的个数
 * @author: fwb
 * @create: 2019-07-11 07:43
 **/
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int n = in.nextInt();
            if (n < 10){
                System.out.println(1);
            }

            if (n >= 10){
                int count = 0;
                List<String> list = new ArrayList<>() ;
               for (int i = 1;i <= n;i++){
                   list.add(i + "");
               }
                for (int i = 0; i < list.size() ; i++)
                {
                    System.out.println((list.contains("2")));
                    if (list.contains("2")){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
