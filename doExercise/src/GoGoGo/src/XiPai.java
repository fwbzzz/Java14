import java.util.Scanner;

public class XiPai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//输入的长度
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s[] = new int[n * T];
        int ans = 0, x;
        for(int i = 0; i < T; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                for (int y = 0;y < T * n;y++){
                    s[y] = x;
                }
            }
        }
        for (int y = 0;y < T * n;y++){
            System.out.println(s[y]);
        }
    }
}