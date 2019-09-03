/*
参数统一化，不管有多少子类一个方法就可以搞定，
 */
class Person2{
    public void print2(){
        System.out.println("Person类的print方法");
    }
}

class Student2 extends Person2{
    public void print2(){
        System.out.println("Student类的print方法");
    }
}

class Worker2 extends Person2{
    public void print2(){
        System.out.println("Worker类的print方法");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        //要求：定义一个方法，接受Person类的所有子类对象并调用print()
        fun(new Person2());//自己等于自己
        fun(new Student2());//向上转型（Preson2 per2 = new Student2）
        fun(new Worker2());//向上转型
    }
    public static void fun(Person2 per2){
        per2.print2();
    }
//        public static void fun(Student2 stu2){
//            stu2.print();
//        }
//        public static void fun(Worker2 Wor2){
//            Wor2.print();
//        }
//        这样一个一个重载过于麻烦，Student，Worker或者其他的子类都可以向上转型变成Person
}

