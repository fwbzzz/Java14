/*
考法：判断输出结果
 */
abstract class Person4{
    public Person4(){//   2
        this.print4();//  3 调用父类的print4()方法
    }
    public abstract void print4();//   3 但是这个抽象的print4()方法没法用（抽象的用不了），所以回到子类
}


class Student4 extends Person4{
    private int num = 100;//编译时实际为子类构造方法中的int num = 100;
    public Student4(int num){ // 1 调用子类构造方法之前先调用父类构造方法↑
        //super();//隐藏代码（编译以后编译器会自动加隐藏语句,先调父类的无参构造）
        //int num = 100;//类中所有属性的初始化放到构造方法中，编译后实际是这样的
        this.num = num;
    }
    public void print4(){  //  4 这个子类有被覆写，可以使用
        System.out.println(this.num);  //   5
    }

}

public class Ex4 {
    public static void main(String[] args) {
      new Student4(30);
      new Student4(30).print4();
    }
}