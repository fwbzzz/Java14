abstract class Person6{
    public abstract void test1();
    abstract class Inner{
        public abstract void test2();
    }
}

class Student6 extends Person6{
    public void test1(){}
    //    public void test2(){}
    // Error:(8, 1) java: Student6不是抽象的, 并且未覆盖Person6中的抽象方法test1()
    class InnerReal extends Inner{
        public void test2() {}
    }
}

public class Ex6 {
    public static void main(String[] args) {
        new Student6();
    }
}
