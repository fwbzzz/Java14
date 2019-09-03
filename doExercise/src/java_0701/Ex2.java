package java_0701;

import java.util.Scanner;

/**
 * @program: doExercise
 * @description:
 * @author: fwb
 * @create: 2019-07-02 14:57
 **/


public class Ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if (str.contains(".")){
            ex1(str);
        }else{
            ex2(str);
        }
    }

    private static void ex1(String str){
        String[] strs = str.split("\\.");
        StringBuffer sb = new StringBuffer(strs[0]);
        StringBuffer sb2 = new StringBuffer(strs[1]);
        sb.reverse();
        sb2.reverse();
        int count = sb.length();
        int a = Integer.valueOf(String.valueOf(sb));
        int b = Integer.valueOf(String.valueOf(sb2));
        System.out.print("人民币");
        outPut(a);
        outPut3(b);
    }

    private static void ex2(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        int count = sb.length();
        int a = Integer.valueOf(String.valueOf(sb));
        System.out.print("人民币");
        outPut(a);
        System.out.println("元");
    }

    private static void outPut(int a) {
        int sum = 1;
        while (a > 0) {
            int x = a % 10;
            switch (x) {
                case 1: {
                    System.out.print("壹");
                    outPut2(sum);
                    break;
                }
                case 2: {
                    System.out.print("贰");
                    outPut2(sum);
                    break;
                }
                case 3: {
                    System.out.print("叁");
                    outPut2(sum);
                    break;
                }
                case 4: {
                    System.out.print("肆");
                    outPut2(sum);
                    break;
                }
                case 5: {
                    System.out.print("伍");
                    outPut2(sum);
                    break;
                }
                case 6: {
                    System.out.print("陆");
                    outPut2(sum);
                    break;
                }
                case 7: {
                    System.out.print("柒");
                    outPut2(sum);
                    break;
                }
                case 8: {
                    System.out.print("捌");
                    outPut2(sum);
                    break;
                }
                case 9: {
                    System.out.print("玖");
                    outPut2(sum);
                    break;
                }
                default: {
                    System.out.print("零");
                    outPut2(sum);
                }
            }
            a = a / 10;
            sum++;
        }
    }

    private static void outPut2(int sum){
        switch (sum){
            case 1:{
                System.out.print("万");
                break;
            }
            case 2:{
                System.out.print("仟");
                break;
            }
            case 3:{
                System.out.print("佰");
                break;
            }
            case 4:{
                System.out.print("拾");
                break;
            }
            case 5:{
                System.out.println("元");
                break;
            }
        }
    }

    private static void outPut3(int a) {
        int sum = 1;
        while (a > 0) {
            int x = a % 10;
            switch (x) {
                case 1: {
                    System.out.print("壹");
                    outPut4(sum);
                    break;
                }
                case 2: {
                    System.out.print("贰");
                    outPut2(sum);
                    break;
                }
                case 3: {
                    System.out.print("叁");
                    outPut2(sum);
                    break;
                }
                case 4: {
                    System.out.print("肆");
                    outPut2(sum);
                    break;
                }
                case 5: {
                    System.out.print("伍");
                    outPut2(sum);
                    break;
                }
                case 6: {
                    System.out.print("陆");
                    outPut2(sum);
                    break;
                }
                case 7: {
                    System.out.print("柒");
                    outPut2(sum);
                    break;
                }
                case 8: {
                    System.out.print("捌");
                    outPut2(sum);
                    break;
                }
                case 9: {
                    System.out.print("玖");
                    outPut2(sum);
                    break;
                }
                default: {
                    System.out.print("零");
                    outPut2(sum);
                }
            }
            a = a / 10;
            sum++;
        }
    }

    private static void outPut4(int sum) {
        switch (sum){
            case 1:{
                System.out.print("角");
                break;
            }
            case 2: {
                System.out.print("分");
                break;
            }
        }
    }
}
