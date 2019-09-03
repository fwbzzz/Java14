/**
 *
 * @program: 装箱和拆箱
 * @description:
 * @author: fwb
 * @create: 2019-05-30 18:56
 **/
public class Ex {
    public static void main(String[] args) {
        Integer integer1 = 100;
        Integer integer2 = 100;
        System.out.println(integer2 == integer1);//true
        Integer integer3 = 200;
        Integer integer4 = 200;
        System.out.println(integer3 == integer4);//false
        //原因是-128 —— 127会产生一个缓存

    }
    public static void main2(String[] args) {
        //装箱（装包） -> 把简单类型包装为一个对象
        Integer a = 10;//自动装箱
        Integer a2 = new Integer(20);//显式装箱
        System.out.println(a);
        System.out.println(a2);
        //拆箱：-> 把包装类拆分为对应的简单类型
        int i = a;//隐式拆箱（自动拆箱） -> Integer.intValue()
        //double d = a; //还是用的Integer.intValue()方法
        double d = a.doubleValue(); //显式拆箱
        System.out.println(d);
    }
}
