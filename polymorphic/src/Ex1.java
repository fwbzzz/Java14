class Person{
    public void print(){
        System.out.println("1.我是爸爸");
    }
}

class Student extends Person{
    public void print(){
        System.out.println("2.我是儿子");
    }
}


public class Ex1 {
    public static void main(String[] args) {
//        Student stu = new Student(); //子类引用等于子类实例
//        stu.print();
        //向上转型，自动(一个是Person类型，一个是Student类型，但是不用强转)
        //不要看前面是谁的引用，只用看是谁new出来的，谁new用谁
        Person per = new Student();
        per.print();
        //向下转型，需要强转
        Student stu = (Student)per;
        stu.print();//现在就new了一次，说白了stu这个对象也是通过new Student()出来的
        //看这种东西不要看前面，只用看new在哪，调用的方法有没有被new这个类覆写，则调用的一定是被覆写后的方法
    }
}

