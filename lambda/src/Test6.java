/*
如果方法有返回值
多行代码
*/
@FunctionalInterface
interface ISubject6{
    int test6(int a,int b);
}


public class Test6 {
    public static void main(String[] args) {

        //如果只有一行不用写return,随便用参数指代即可
        ISubject6 subject6= (r1,r2) -> {
            r1 = r1 + 10;
            r2 = r2 + 10;
            return r1 + r2;
        };

        System.out.println(subject6.test6(10,20));
    }
}
