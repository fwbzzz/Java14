/*
方法体多行实现
*/
@FunctionalInterface
interface ISubject4{
    void test4();
}


public class Test4 {
    public static void main(String[] args) {

        //方法体多行实现
        ISubject4 subject4 = () -> {
            System.out.println("Lambda表达式");
            System.out.println("Hello");
        };

        subject4.test4();
    }
}
