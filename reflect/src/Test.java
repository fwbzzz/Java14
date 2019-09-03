

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jack");
        person.setAge(22);
        System.out.println(person);
        //取反射需要拿到Person类的Class对象
        Class classz = person.getClass();
        //Method[] methods = classz.getMethods();//获取该类所有方法
        Method[] methods = classz.getDeclaredMethods();//获取声明的方法
        //输出方法
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        System.out.println("------------------------------------------");

        try {
            //toString方法无参所以只需要传名字
            Method toStringMethod = classz.getMethod("toString");
            //通过反射执行方法
            Object returnValue =  toStringMethod.invoke(person);
            System.out.println(returnValue);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("*********************");

        try {
            Method setNameMethod = classz.getMethod("setName", String.class);//通过反射获取方法
            Object returnValue = setNameMethod.invoke(person,"Tom");//null serName()无返回值
            System.out.println(person);
            System.out.println(returnValue);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
