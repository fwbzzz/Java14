/*
匿名内部类
*/
interface ISubject2{
    void test2();
}


public class Test2 {
    public static void main(String[] args) {
        //匿名内部类，与方法内部类的区别只是有没有名字
        ISubject2 subject2 = new ISubject2() {
            //看起来直接new了一个接口，实际上是产生了一个内部类，然后new的这个内部类的对象，只不过这类没名字
            //这个大括号里其实有一个内部类只不过他没有起名字

            //class 没名字 implements Isubject 隐藏代码
            @Override
            public void test2() {
                System.out.println("主方法中的内部类");
            }
        };
    }
}
