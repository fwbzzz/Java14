package java_0523;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 0 || n > 100){
            System.out.println(-1);
        }
        int x = -1;
        for (int j = 0;j <= n/8; j++){
            for (int i = 0;i <= n/6; i++){
                if(6 * i + 8 * j == n){
                     x = i + j;
                }
            }
        }
        if(n==6|| n==0){
            x = 1;
        }
        System.out.println(x);
    }
}
