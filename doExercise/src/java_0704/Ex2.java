package java_0704;

import java.util.Scanner;

/**
 * @program: doExercise
 * @description: 密码验证合格
 * @author: fwb
 * @create: 2019-07-04 21:00
 **/
class Solution{
    public boolean overEight(String str){
        if (str.length() <= 8){
            return false;
        }else{
            return true;
        }
    }
    public boolean threeKinds(String str){
        char[] ch = str.toCharArray();
        int a = 0,b = 0,c =0,d = 1;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>'0'&&ch[i] < '9'){
                a = 1;
            }else if (ch[i] > 'a'&&ch[i] < 'z'){
                b = 1;
            }else if (ch[i] > 'A' && ch[i] < 'Z'){
                c = 1;
            }else {
                d = 1;
            }
        }
        int e = a + b + c + d;
        return e >= 3;
    }

    public boolean noThreeSame(String str){
        for (int i = 0;i < str.length() - 2;i++){
            String str1 = str.substring(i,i+3);
            String str2 = str.substring(i + 1);
            if (str2.contains(str1)){
                return false;
            }
        }
        return true;
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String str = in.nextLine();
            Solution solution = new Solution();
            if(solution.noThreeSame(str)&&solution.overEight(str)&&solution.threeKinds(str)){
                System.out.println("OK");
            }else
                System.out.println("NG");
        }
    }
}
