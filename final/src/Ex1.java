
//class Person{
//    final修饰的变量必须在声明时赋值，或者通过构造方法赋值
//    public final int a = 10;
//    public Person(){
//        a = 10;
//   }
//}


class Student{
    private int test;
    public void setTest(int test){
        this.test = test;
    }
    public int getTest(){
        return this.test;
    }
}


class Person{
    public final Student stu = new Student();//此处的值指的是这块堆内存的地址,但是里面可以改

}
public class Ex1 {
    public static void main(String[] args) {
        Person per = new Person();
        //per.stu = new Student();此处分配了一个新的地址，所以出错
        Student stu = per.stu;
        per.stu.setTest(10);
        stu.setTest(20);
        System.out.println(per.stu.getTest());
    }
}
