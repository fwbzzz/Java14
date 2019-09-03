package fwb.shuChuLiu;

import java.util.Scanner;

/**
 * @program: Io
 * @description: Scanner
 * @author: fwb
 * @create: 2019-08-02 14:20
 **/
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输入内容为：" + str);
        }
         */
        /*
        System.out.println("请输入年龄");
        if (scanner.hasNextInt()){
            int age = scanner.nextInt();
            System.out.println("年龄为：" + age);
        }else{
            System.out.println("输入非法");
        }
         */
        System.out.println("输入出生日期");
        if (scanner.hasNext("\\d{4}-\\d{2}-\\d{2}")){
            String str = scanner.next();
            System.out.println("出生年月为：" + str);
        }else{
            System.out.println("输入格式不正确，格式应为：1970-01-01");
        }
    }
}
