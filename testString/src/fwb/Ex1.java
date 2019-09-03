package fwb;

/**
 * @program: TestString
 * @description: String练习
 * @author: fwb
 * @create: 2019-05-30 17:20
 **/
public class Ex1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println(x==y);//true

        //直接赋值法
        String a = "hello";
        String b = "hello";
        System.out.println(a==b);//true

        //构造方法
        String c = new String("fwb");
        String d = new String("fwb");
        System.out.println(c==d);//fal
        // se

        String e = new String("hello");
        System.out.println(a==e);//false
    }
}
