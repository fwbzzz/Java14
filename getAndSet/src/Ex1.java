class Person{
    private String name;
    private double salary;
    //set不需要返回值,
    public void setName(String n){
        name = n;
    }
    //之前public没法限制（设置的值想等于多少都可以），而现在提供了这个方法以后，就可以做限制
    public void setSalary(double s){
        if(s < 0 || s > 10000){
            System.out.println("余额数量非法");//此处不进行赋值，还是以前的默认值
        }else{
            salary = s;
        }
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void fun(){
        System.out.println(name + "存款为" + "$" + salary);
    }

}

public class Ex1 {
    public static void main(String[] args){
        Person per = new Person();
        per.setName("张三");
        per.setSalary(-100);
        per.fun();
        System.out.println(per.getName());
        System.out.println(per.getSalary());
    }
}
