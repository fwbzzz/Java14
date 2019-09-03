package java_0703;

import java.util.Scanner;

/**
 * @program: doExercise
 * @description: IP地址和十进制相互转化
 * @author: fwb
 * @create: 2019-07-04 11:45
 **/
class comeTrue{
    public void shift1(String input){
        String[] strs = input.split("\\.");
        String str = "";
        for (int i = 0; i < strs.length; i++) {
            strs[i] = Integer.toBinaryString(Integer.valueOf(strs[i]));
            int x = 8 - strs[i].length();
            if (i > 0){
                switch(x){
                    case 1:strs[i] = "0" + strs[i];
                        break;
                    case 2:strs[i] = "00" + strs[i];
                        break;
                    case 3:strs[i] = "000" + strs[i];
                        break;
                    case 4:strs[i] = "0000" + strs[i];
                        break;
                    case 5:strs[i] = "00000" + strs[i];
                        break;
                    case 6:strs[i] = "000000" + strs[i];
                        break;
                    case 7:strs[i] = "0000000" + strs[i];
                        break;
                    default:
                        break;
                }
            }

        }
        str = strs[0] + strs[1] + strs[2] + strs[3];
        System.out.println(Integer.valueOf(str,2).toString());
    }
    public void shift2(int a){
        String b = Integer.toBinaryString(a);
        int x = 32 - b.length();
        for (int i = 0;i < x; i++){
            b = "0" + b;
        }
        String[] result1 = b.split("",32);
        String[] result2 = new String[4];
        for (int j = 1; j <= 4; j++) {
            for (int i = 0; i < j*8 ; i++){
                result2[j - 1] = result2[j - 1] + result1[i];
            }
        }
        for (String h:result2
             ) {
            System.out.println(h);
        }

    }
}
public class Ex2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //String input = in.nextLine();
        int a = in.nextInt();
        comeTrue cometrue = new comeTrue();
        //cometrue.shift1(input);
        cometrue.shift2(a);
    }
}
