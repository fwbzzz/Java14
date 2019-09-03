/*
调用父类的同名方法,同名属性
 */


class Person5{
    public String info = "person";
    public void print(){
        System.out.println("1.Person");
    }
}

class Student5 extends Person5{
    public String info = "student";
    public void print(){
        super.print();//表示调用父类的print()
        System.out.println("2.Student");
        System.out.println(super.info);
    }
}

public class ExSuper3 {
    public static void main(String[] args) {
        Student5 stu5 = new Student5();
        stu5.print();
    }
}