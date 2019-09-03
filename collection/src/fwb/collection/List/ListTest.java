package fwb.collection.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: collection
 * @description: Collection接口的子接口，List接口
 * @author: fwb
 * @create: 2019-07-08 16:35
 **/
class Person{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    这是原方法中所调用的equals方法，只是比较地址是否相同
    public boolean equals(Object obj) {
        return (this == obj);
    }
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Person))
            return false;
        //向下转型取出属性值比较
        Person per = (Person)obj;
        return this.age.equals(per.age) && this.name.equals(per.name);
    }
}
public class  ListTest {
    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();
        Person per1 = new Person("张三",20);
        Person per2 = new Person("李四",30);
        Person per3 = new Person("WaZxz",1);
        people.add(per1);
        people.add(per2);
        people.add(per3);
        //Object obj = new Person3("乐",20);
        //父类 父类引用 = new 子类();这是向上转型
        System.out.println(people.contains(new Person("乐",20)));
        System.out.println(people.remove(new Person("张三",20)));
    }
}
