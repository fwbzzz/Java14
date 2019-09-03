/*
实例化子类时，先调用父类构造方法，再调用子类构造方法
 */
abstract class Person3{
    public Person3(){
        System.out.println("抽象类的构造方法");
    }
    public abstract void print3();
}


class Student3 extends Person3{
    public Student3(){
        System.out.println("子类的构造方法");
    }
    public void print3(){
        System.out.println("HELLO");
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Person3 person3 = new Student3();
        person3.print3();
        //new Student3();
    }
}
