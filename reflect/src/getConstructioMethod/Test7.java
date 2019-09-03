/*
Class类提供的getConstructors()只能取得权限为public的构造方法
 */
package getConstructioMethod;

import java.lang.reflect.Constructor;

class Person{
    private Integer age;
    private String name;

    public Person(){}

    //default
    Person(Integer age) {
        this.age = age;
    }

    private Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Test7 {
    public static void main(String[] args) {
        Class<Person> cls = Person.class;
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors
             ) {
            System.out.println(constructor);
        }
    }
}
