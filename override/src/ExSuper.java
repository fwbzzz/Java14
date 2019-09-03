/*
super调用子类无参构造
 */

class Person3{
    public Person3(){
        System.out.println("1.Person类的构造方法" );
    }
}

class Student3 extends Person3{
    public Student3(){
        //编译以后编译器会自动加隐藏语句,先调父类的无参构造
        super();
        System.out.println("2.Student类的构造方法");
    }
}

public class ExSuper {
    public static void main(String[] args) {
        Student3 stu3 = new Student3();
    }
}
