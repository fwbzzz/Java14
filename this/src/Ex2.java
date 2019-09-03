/*
this调用本类普通方法
 */

class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.print();//调用普通方法
        this.name = name ;
        this.age = age ;
        this.print();//调用普通方法
    }
    public String getPersonInfo(){
        return "姓名：" + name + ",年龄："+age;
    }
    public void print(){
        System.out.println("*****************");
    }
}
public class Ex2{
    public static void main(String[] args) {
        Person per = new Person("张三",20);
        System.out.println(per.getPersonInfo());
    }
}