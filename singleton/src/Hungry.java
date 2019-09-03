/*
饿汉式单例，迫不及待上来就new
 */

class SingletonH{
    //类中提供了一个对象，类加载时产生，与是否调用Instance方法无关。
    private static SingletonH singletonh = new SingletonH();
    private SingletonH(){}//构造方法私有化
    //静态方法，为了可以取出
    public static SingletonH getInstanceH(){
        return singletonh;
    }
}

public class Hungry {
    public static void main(String[] args) {
        //不能直接new了，必须通过静态方法取得类中已经产生好的对象
        SingletonH singleton1 = SingletonH.getInstanceH();
        SingletonH singleton2 = SingletonH.getInstanceH();
        System.out.println(singleton1 == singleton2);// == 用于对象的时候比较两个对象的地址
    }
}
