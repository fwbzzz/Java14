package fwb.collection.Set;

import java.util.Set;
import java.util.TreeSet;

// 实现comparable接口

/**
 * @program: collection
 * @description:
 * @author: fwb
 * @create: 2019-07-15 15:06
 **/

class Person implements Comparable<Person3>{
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person3 o) {
        if (this.age < o.age)
            return -1;
        if (this.age > o.age)
            return 1;
        return this.name.compareTo(o.name);
    }
}

public class SetTest {
    public static void main(String[] args) {
        Set<Person3> set = new TreeSet<>();
        set.add(new Person3(25,"王五"));
        set.add(new Person3(25,"李四"));
        set.add(new Person3(20,"张三"));
        System.out.println(set);
    }
}
