//package fwb.collection.Set;
//
//import java.util.*;
//
///**
// * @program: collection
// * @description: HashSet
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
//    @Override
//    public boolean equals(Object obj){
//        //当前对象 == obj（自己和自己比）
//        if (this == obj){
//            return true;
//        }
//        //如果obj不是当前类对象
//        if (!(obj instanceof Person3)){
//            return false;
//        }
//        //传进来的时此类对象，并且和自己不是同一个地址
//        Person3 per = (Person3) obj;
//        return this.age.equals(per.age)&& this.name.equals(per.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name,age);
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
//public class SetTest3 {
//    public static void main(String[] args) {
//        Set<Person3> set = new HashSet<>();
//        set.add(new Person3(25,"王五"));
//        set.add(new Person3(25,"李四"));
//        set.add(new Person3(20,"张三"));
//        set.add(new Person3(20,"张三"));
//        System.out.println(set);
//    }
//}
