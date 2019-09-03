/*
引用某个类的静态方法
 */


//泛型接口，2种类型泛型，P这个类型传进来返回了一个R类型
interface Isubject<P,R>{
    R switchPara1(P p);//
}


public class Test1 {
    public static void main(String[] args) {
        //switchPara实际上引用了一个String类的valueOf()方法
        Isubject<Integer,String> stringIsubject =
                String :: valueOf;
        System.out.println(stringIsubject.switchPara1(10));
        //等同于使用String.valueof(10);//接受任意其它类型将其变成String
    }
}
