package java_0524;
import java.util.Scanner;

public class Ex2 {
    static int[] weight;
    static int N;
    static int count=0;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            N = input.nextInt();
            weight = new int[N+1];

            for (int i = 1; i <= N; i++) {
                weight[i] = input.nextInt();
            }

            beibao(40,N);
            System.out.println(count);

        }
    }
    static void beibao(int s,int n) {//s为剩余物品重量，n为剩余可选物品数
        if(s==0) {//如果正好装满
            ++count;
            return ;
        }
        if(s<0||(s>0 && n<1))//是s<0或n<1则不能完成
            return ;
        beibao(s-weight[n],n-1);//从后往前装，装上weight[n]后，若剩余物品仍然有解
        beibao(s,n-1);//若装了weight[n]后，无解，则删除该包,尝试第n-1个
    }
}
