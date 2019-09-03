/*
反射取得类中所有属性
 */
package getAttribute;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
    private String name;
    private Integer age;//如果是私有属性则显示为空
    public Integer id;//此处设为公有是为了演示代码

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person{
    public String school;//此处设为公有是为了演示代码

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jack");
        student.setAge(22);
        student.setSchool("西科大");
        student.setId(123654798);
        Class classz = student.getClass();

        //全部可访问的公共属性
        System.out.println("--- getFields ---");
        for (Field field : classz.getFields()
             ) {
            System.out.println(field.getName() + " +++++++ " + field.getType().getName());
        }

        //类中指定名称可访问的属性
        System.out.println("--- getField ---");
        try {
            Field school = classz.getDeclaredField("school");
            System.out.println(school.getName() + " +++++++ " + school.getType().getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        //类中全部属性
        System.out.println("--- getDeclaredFields ---");
        for (Field field : classz.getDeclaredFields()
                ) {
            System.out.println(field.getName() + " +++++++ " + field.getType().getName());
        }

        //类中指定名称属性
        System.out.println("--- getDeclaredField ---");
        try {
            Field school = classz.getDeclaredField("school");
            System.out.println(school.getName() + " +++++++ " + school.getType().getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
