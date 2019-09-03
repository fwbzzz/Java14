/*
引用对象方法
 */


interface Isubject2<R>{
    R switchPara2();
}

public class Test2 {
    public static void main(String[] args) {
        //switchPara实际上引用了一个String类的toUpperCase方法
        Isubject2<String> subject2 =
                "hello"::toUpperCase;
        System.out.println(subject2.switchPara2());
        //等同于"hello".toUpperCase();
    }
}
