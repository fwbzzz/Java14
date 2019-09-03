/*
super当父类不存在无参构造
 */
class Person4{
    private String name;
    private int age;
    public Person4(String name) {
        this.name = name;
    }
    public Person4(String name,int age) {
        this(name);
        this.age = age;
    }
}

class Student4 extends Person4 {
    private String school;
    public Student4() {
        //上来先调super（）调父类的无参构造，但是父类中根本就不存在，
        //所以此时的super不能省略，必须用super指明要调的是那哪个父类的有参构造
        super("张三");//调用父类的第一个参数的有参构造
        System.out.println("2.Student类的构造方法");
    }
}

public class ExSuper2 {
    public static void main(String[] args) {
        Student4 stu4 = new Student4();
    }
}
