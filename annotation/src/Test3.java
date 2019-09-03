/*
压制警告@SuppressWarnings
 */
class Person3{
    @Deprecated
    public void fun3(){}
    public void test3(){}
}
public class Test3 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Person3 per3 = new Person3();
    }
}

