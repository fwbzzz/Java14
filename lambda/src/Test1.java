/*
方法内部类
 */
interface ISubject{
    void test();
}


public class Test1 {
    public static void main(String[] args) {
        //方法内部类：在方法中嵌套了一个类的结构
        //此处在主方法中定义了一个内部类，这个内部类实现了ISubject这个接口
        class SubjectImpl implements ISubject{//有名字叫SubjeImpl
            @Override
            public void test() {
                System.out.println("主方法中的内部类");
            }
        }
        ISubject subject = new SubjectImpl();
        subject.test();//调用子类覆写后的方法
    }
}
