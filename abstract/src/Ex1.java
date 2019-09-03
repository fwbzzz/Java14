/*
    1.子类如果不是抽象类，必须覆写抽象类所有方法
    2.Person这个类不能直接new自己，但是可以通过向上转型变成他
    3.子类如果不是抽象类，可以不覆写
 */
abstract class Person{
    public abstract void print();//抽象方法
    public abstract void fun();
}

class Student extends Person{
    public void print(){}//空实现
    public void fun(){}
    //子类如果不是抽象类，必须覆写抽象类所有方法
}

abstract class Teacher extends Person{
    //子类如果不是抽象类，可以不覆写
    public static int a;
}

public class Ex1 {
    public static void main(String[] args) {
        //Person per = new Student();//Person这个类不能直接new自己(不能直接产生对象)，但是可以通过向上转型变成他
        System.out.println(Teacher.a);
    }
}
