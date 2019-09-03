//package fwb.collection.Set;
//
//import java.util.Comparator;
//import java.util.Set;
//import java.util.TreeSet;
//
////自定义一个比较器
//
///**
// * @program: collection
// * @description:
// * @author: fwb
// * @create: 2019-07-15 15:06
// **/
//
//class Person3 {
//    private Integer age;
//    private String name;
//
//    public Person3(Integer age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Person3{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
//
///*
//此类专门用于比较两个Person的大小
// */
//class PersonAgeSec implements Comparator<Person3>{
//
//    @Override
//    public int compare(Person3 o1, Person3 o2) {
//        if(o1.getAge() < o2.getAge()){
//            return -1;
//        }
//        if (o1.getAge() > o2.getAge()){
//            return 1;
//        }
//        return 0;
//    }
//}
//
//public class SetTest2 {
//    public static void main(String[] args) {
//        PersonAgeSec personAgeSec = new PersonAgeSec();
//        Set<Person3> set = new TreeSet<>(personAgeSec);
//        set.add(new Person3(25,"王五"));
//        set.add(new Person3(25,"李四"));
//        set.add(new Person3(20,"张三"));
//        System.out.println(set);
//    }
//}
