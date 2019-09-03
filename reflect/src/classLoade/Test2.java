/*
得到Class对象的第四种方法
*/
package classLoade;

public class Test2 {
    public static void main(String[] args) {
        try {
            //此处可知自己定义的这个member2类在AppClassLoader下
            ClassLoader classLoader = Class.forName("classLoade.Member2").getClassLoader();
            System.out.println(classLoader);
            //通过classLoader我们也能加载到一个类，loadClass他会返回这个类的Class对象
            Class classz = classLoader.loadClass("classLoade.Member2");
            //有了class对象之后就可以通过newInstance得到Member对象
            Member2 member2 = (Member2) classz.newInstance();
            System.out.println(member2);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
class Member2{
}
