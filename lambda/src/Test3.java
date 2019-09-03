/*
Lambda表达式，要求有且只能有一个抽象方法
所以JDK8增加了一个@FunctionInterface注解只能用于接口声明，检测当前接口中是否只有一个抽象方法
*/
@FunctionalInterface
interface ISubject3{
    void test3();
}


public class Test3 {
    public static void main(String[] args) {

        //方法体实现只需一行
        ISubject3 subject3 = () -> System.out.println("Lambda表达式");
        subject3.test3();
    }
}
