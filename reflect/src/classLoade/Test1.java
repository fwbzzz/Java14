/*
Java类加载器结构
 */
package classLoade;

public class Test1 {
    public static void main(String[] args) {
        Class classz = Member1.class;
        //返回该类的类加载器。一些实现可能使用null来表示引导类加载器。
        // 如果这个类是由引导类加载器加载的，那么这个方法在这样的实现中将返回null
        System.out.println(classz);
        System.out.println(classz.getClassLoader());//应用程序的类加载器
        //ClassLoader geParent 返回的类型还是ClassLoader看似无尽实则不然
        System.out.println(classz.getClassLoader().getParent());//扩展的类加载器
        System.out.println(classz.getClassLoader().getParent().getParent());//bootstrap loader（启动程序类加载器）
    }
}
class Member1{


}

