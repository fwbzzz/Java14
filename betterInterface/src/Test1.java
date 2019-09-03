/*
JDK1.8以后接口的新特性
*/
interface ISubject{
    void test();
    //此处default表示接口中的普通方法
    default void fun(){
        System.out.println("接口中的普通方法");
    }
    //看到static就知与对象无关
    static void fun1(){
        System.out.println("可以通过接口直接调用");
    }
}
class SubjectImpl implements ISubject{

    @Override
    public void test() {
        System.out.println("接口中的抽象方法");
    }
}

public class Test1 {
    public static void main(String[] args) {
        ISubject subject = new SubjectImpl();//通过子类向上转型
        subject.test();
        subject.fun();
        ISubject.fun1();
    }
}
