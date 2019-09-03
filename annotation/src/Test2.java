/*
过期声明@Deprecated
 */
class Person{
    @Deprecated
    public void fun(){}
    public void test(){}
}
public class Test2 {
    public static void main(String[] args) {
        Person per = new Person();
        per.fun();//虽然可以使用，但是不推荐
        per.test();
    }
}
