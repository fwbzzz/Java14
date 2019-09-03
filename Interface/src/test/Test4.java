/*
一个接口可以使用extends继承多个父接口。
 */
package test;
interface A{
    void playA();
}

interface B{
    void playB();
}

interface C extends A,B{
    void playC();
}

abstract class CImpl implements C{
}

//class Ex extends CImpl{
//    public void playA() {}
//    public void playB() {}
//    public void playC() {}
//}

class Ex extends CImpl implements C{  //再多写一遍implements C 有标识意义，表示一种强调
    public void playA() {}
    public void playB() {}
    public void playC() {}
}

public class Test4 {
    public static void main(String[] args) {
        C c = new Ex();
        c.playA();
    }
}
