/*
Class类提供的getDeclaredConstructors()能取得类中所有构造方法
 */

package getConstructioMethod;

import java.lang.reflect.Constructor;

class Person8{
    private Integer age;
    private String name;

    public Person8(){}

    //default
    Person8(Integer age) {
        this.age = age;
    }

    private Person8(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Test8 {
    public static void main(String[] args) {
        Class<Person8> cls = Person8.class;
        Constructor[] constructors =
                cls.getDeclaredConstructors();
        for (Constructor constructor : constructors
                ) {
            System.out.println(constructor);
        }
    }
}
