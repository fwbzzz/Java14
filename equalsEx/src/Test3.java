/*
覆写方法
 */
class Person3 {
    private String name;
    private int age;

    public Person3(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public boolean equals(Object obj){
        //判断地址是否相等
        if (this == obj){
            return true;
        }
        //判断是否是同一类
        //intanceof判断它左边的对象是否是它右边的类的实例
        if (!(obj instanceof Person3)) {
            return false;
        }
        //传入的一定是Person对象并且地址相等
        //需要向下转型，脱掉小马甲，从Object变成Person对象
        Person3 per3 = (Person3)obj;
        //传入的name再和自己的name比较,此处调用String类的equals()
        return per3.name.equals(this.name) && per3.age == this.age;
    }
}


public class Test3 {
    public static void main(String[] args) {
        Person3 per1 = new Person3("张三", 20);
        Person3 per2 = new Person3("张三", 20);
        System.out.println(per1.equals(per2));
    }
}