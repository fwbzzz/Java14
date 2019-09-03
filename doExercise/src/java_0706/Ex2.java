package java_0706;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: doExercise
 * @description:
 * @author: fwb
 * @create: 2019-07-09 22:44
 **/

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
