
package getConstructioMethod;

import java.lang.reflect.Constructor;

class Animal{
    private Double weight;
    public Animal(){}
    private Animal(Double weight){
        this.weight = weight;
    }
}

class Person10 extends Animal{
    private Integer age;
    private String name;

    public Person10(){}

    //default
    Person10(Integer age) {
        this.age = age;
    }

    private Person10(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Test10 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Person10> cls = Person10.class;
        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor constructor:constructors
                ) {
            System.out.println(constructor);
        }
        System.out.println("----------------------");
        constructors = cls.getConstructors();
        for (Constructor constructor:constructors
                ) {
            System.out.println(constructor);
        }
    }
}