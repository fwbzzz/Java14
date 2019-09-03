/*
真正想要锁住这段代码
1.锁同一个对象,将sync变成一个共享资源
2.用static方法修饰（static修饰的方法叫类方法，类属性和类方法与对象实例化无关，不管多少个对象，类属性共享一个
不管多少对象，类方法共享一个）
 */
class Sync5{
    //如果加static锁的是Sync.class
    public  static synchronized void fun(){
        System.out.println(Thread.currentThread().getName() + "fun方法开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "fun方法结束");
    }
}

class MyThread5 implements Runnable{
    private Sync5 sync5;
    public MyThread5(Sync5 sync5){
        this.sync5 = sync5;
    }
    public void run(){
        this.sync5.fun();
    }
}

public class Test5 {
    public static void main(String[] args) {
        //这样的话这三个线程一定都是同一个对象
        Sync5 sync5= new Sync5();
        MyThread5 mt5 = new MyThread5(sync5);
        Thread thread1 = new Thread(mt5,"线程A");
        Thread thread2 = new Thread(mt5,"线程B");
        Thread thread3 = new Thread(mt5,"线程C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
