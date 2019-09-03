/*
反射取得包名、父类、父接口信息
 */
package getPackage;


interface IMessage{}
interface INews{}
class MyClass implements IMessage,INews{}

public class Test5 {
    public static void main(String[] args) {
        Class<Test5> cls5 = Test5.class;
        System.out.println(cls5.getPackage());//取得一个类的包信息
        System.out.println(cls5.getSuperclass());//Object类
        Class[] classes = MyClass.class.getInterfaces();// 取得一个类的所有父接口
        for (Class cls1: classes
             ) {
            System.out.println(cls1);
        }
    }
}

