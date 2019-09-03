class Person3{
    public void print(){
        System.out.println("1.我是爸爸");
    }
}

class Student3 extends Person3{
    public void print(){
        System.out.println("2.我是儿子");
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Person3 per3 =  new Person3();
        System.out.println(per3 instanceof Person3);
        System.out.println(per3 instanceof Student3);
        if (! (per3 instanceof Student3)){
            per3 = new Student3();
        }
        System.out.println(per3 instanceof Student3);
    }
}

