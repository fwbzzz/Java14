/*
如何体现，Object类是所有类的父类呢？（如何证明）
 */

//并没有写extends Object （这叫默认继承）
class Person{}
class Student{}

public class Test1 {
    public static void main(String[] args) {
        //将一个Person类的对象给Object（向上转型）
        fun(new Person());
        fun(new Student());
    }
    public static void fun(Object obj){
        System.out.println(obj.toString());
    }
}
