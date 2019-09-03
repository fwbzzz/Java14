import java.util.Comparator;

/**
 * @program: comparatorAndComparable
 * @description:
 * @author: fwb
 * @create: 2019-06-26 17:43
 **/

///*
//这种写法，如果规则变了变成谁的name大谁就大，还需要改代码。
// */
//class Person implements Comparable<Person>{
//    private int age;
//    private String name;
//
//    public Person(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Person o) {
//        return this.age - o.age;
//    }
//}
//
//public class Ex {
//    public static void main(String[] args) {
//        Person per = new Person(20,"张三");
//        Person per1 = new Person(21,"王麻子");
//        System.out.println(per.compareTo(per1));
//    }
//}
//

// 此类不提供比较大小的方法，而是通过另一个专门的类来比较,
// 也叫策略模式，通过不同的策略来比较两个对象
class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
//基于姓名的比较器
class PersonCompare implements Comparator<Person> {
    @Override
    public int compare(Person o1,Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
//基于年龄的比较器
class PersonAgeCompare implements Comparator<Person> {
    @Override
    public int compare(Person o1,Person o2) {
        return o1.getAge()-(o2.getAge());
    }
}

public class Ex {
    public static void main(String[] args) {
        Person per = new Person(20,"张三");
        Person per1 = new Person(21,"王麻子");
        PersonCompare personCpmpare = new PersonCompare();
        PersonAgeCompare personAgeCpmpare = new PersonAgeCompare();
        System.out.println(personCpmpare.compare(per1,per));
        System.out.println(personAgeCpmpare.compare(per1,per));
    }
}

