/*
属性覆写（了解）
 */

class Person2{
    public String info = "dad";
}

class Student2 extends Person2{
    public String info = "child";
}


public class Ex2 {
    public static void main(String[] args) {
        Student2 stu2 = new Student2();
        System.out.println(stu2.info);
    }
}
