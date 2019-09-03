/*
接口之间是可以互相继承的
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

class CImpl implements C{
    public void playA(){
        System.out.println("A");
    }
    public void playB(){
        System.out.println("B");
    }
    public void playC(){
        System.out.println("C");
    }
}

public class Test3 {
    public static void main(String[] args) {
        C c = new CImpl();
        c.playA();
        c.playB();
        c.playC();
    }
}
