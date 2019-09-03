/*
如果方法有返回值
单行代码
*/
@FunctionalInterface
interface ISubject5{
    int test5(int a,int b);
}


public class Test5 {
    public static void main(String[] args) {

        //如果只有一行不用写return,随便用参数指代即可
        ISubject5 subject5= (r1,r2) -> r1+r2;

        System.out.println(subject5.test5(10,20));
    }
}
