package java_0706;

/**
 * @program: doExercise
 * @description: 大整数排序
 * @author: fwb
 * @create: 2019-07-08 15:30
 **/

import java.util.*;
import java.math.*;
public class Ex1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            BigInteger[] bg = new BigInteger[n];
            for(int i=0; i<n; i++)
                bg[i] = s.nextBigInteger();
            Arrays.sort(bg);
            for(int i=0; i<n; i++)
                System.out.println(bg[i]);
        }
    }
}

