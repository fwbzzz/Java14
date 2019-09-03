/*
引用类中的普通方法
 */


interface Isubject3<R,P>{
    R switchPara3(P p1,P p2);
}

public class Test3 {
    public static void main(String[] args) {
        //switchPara实际上引用了一个String类的compareTo方法
        Isubject3<Integer,String> subject3 =
               String :: compareTo;
        System.out.println(subject3.switchPara3("张","王"));
        //等同于new String.compareTo("张","王")比较2个字符串大小
    }
}