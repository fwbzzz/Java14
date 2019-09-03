package java_0708;

import java.util.Scanner;

/**
 * @program: doExercise
 * @description: 说反话
 * @author: fwb
 * @create: 2019-07-10 10:33
 **/
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String a = in.nextLine();
            String[] res = a.split(" ");
            for (int i = res.length - 1; i >= 0;i--){
                System.out.print(res[i] + " ");
            }
        }
    }
}
