/*
引用某个类的构造方法
 */
class Person{
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


interface Isubject4<R,PI,PS>{
    R creatPersom(PI pi,PS ps);
}

public class Test4 {
    public static void main(String[] args) {
        //switchPara实际上引用了一个String类的compareTo方法
        Isubject4<Person,Integer,String> subject4 =
                Person::new;
        //等同于 new Person(40，"王")；
        Person per = subject4.creatPersom(40,"王");
        System.out.println(per);
    }
}