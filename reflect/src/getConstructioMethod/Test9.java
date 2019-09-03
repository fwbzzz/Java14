/*
取得指定参数的构造方法
getDeclaredConstructor()可以取得所有权限
getConstructor()只能取得public权限
 */


package getConstructioMethod;

import java.lang.reflect.Constructor;


class Person9{
    private Integer age;
    private String name;

    public Person9(){}

    //default
    Person9(Integer age) {
        this.age = age;
    }

    private Person9(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Test9 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Person9> cls = Person9.class;
        //getDeclaredConstructor()可以取得所有权限
        //getConstructor()只能取得public权限
        Constructor constructor = cls.getDeclaredConstructor(Integer.class,String.class);
        Constructor constructor1 = cls.getConstructor();
        System.out.println(constructor);
        System.out.println(constructor1);

    }
}

