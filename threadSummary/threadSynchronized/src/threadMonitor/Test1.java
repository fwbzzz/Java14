package threadMonitor;

public class Test1 {
    //锁任意对象的同步代码块
    public static void main(String[] args) {
        Object object = new Object();
        synchronized (object){
            System.out.println("hello world");
        }
    }
}
//1.Test6,右键 open in Terminal
//2.Local,右键Close  Session
//javac Test1.java
//javap 反编译