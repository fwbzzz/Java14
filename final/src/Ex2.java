
class Person2{
    public static final int I = 10;
    //描述常量加上static，被fianl修饰的变量仅仅是值不可变而已，
    // 但是它的内存还在堆内存的每个对象里面放着，由于这n个对象的值是一样的，所以应该把它抽出来做成一个值
    // 就完了，所以用static和fianl共同搭配，组成Java中的常量
}


public class Ex2 {
    public static void main(String[] args) {

    }
}
