///*
//取得指定参数的构造方法
//getDeclaredConstructor()可以取得所有权限
//getConstructor()只能取得public权限
//但是无法取得父类的信息
// */
//
//package getConstructioMethod;
//
//import java.lang.reflect.Constructor;
//
//
//
//class Person10 {
//    private Integer age;
//    private String name;
//
//    public Person10(){}
//
//    //default
//    Person10(Integer age) {
//        this.age = age;
//    }
//
//    private Person10(Integer age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//}
//public class Test11 {
//    public static void main(String[] args) throws NoSuchMethodException {
//        Class<Person10> cls = Person10.class;
//        Constructor[] constructors = cls.getDeclaredConstructors();
//        for (Constructor constructor:constructors
//                ) {
//            System.out.println(constructor);
//        }
//        System.out.println("----------------------");
//        constructors = cls.getConstructors();
//        for (Constructor constructor:constructors
//                ) {
//            System.out.println(constructor);
//        }
//    }
//}
//
