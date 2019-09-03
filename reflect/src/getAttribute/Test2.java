package getAttribute;

import java.lang.reflect.Field;

public class Test2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jack");
        student.setAge(22);
        student.setSchool("西科大");
        student.setId(123654798);
        Class classz = student.getClass();

        System.out.println("--- getDeclaredField ---");
        try {
            Field school = classz.getDeclaredField("school");
            System.out.println(school.getName() + " +++++++ " + school.getType().getName());
            school.setAccessible(true);//此方法打破面向对象的封装性
            //正常状态下若school为私有属性则无法直接获取
            System.out.println(school.get(student));
            //Class getName => 类的全限定名 包名 + 类名
            //Class getSimpleName => 类名

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

