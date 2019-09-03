/*
此程序之所以没有一个一个进入，而是同时开始，同时结束，是因为synchronized方法默认锁的当前this
但是启动以后创建了3个sync对象，各锁各的互不影响（所以3个同时进去同时出来）
 */
class Sync{
    //任意时刻只有一个线程（同一个对象）能进入此方法
    //sunchronized默认锁的是当前对象
    public synchronized void fun(){
        System.out.println(Thread.currentThread().getName() + "fun方法开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "fun方法结束");
    }
}

class MyThread implements Runnable{
    public void run(){
        Sync sync = new Sync();
        sync.fun();
    }
}

public class Test4 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread thread1 = new Thread(mt,"线程A");
        Thread thread2 = new Thread(mt,"线程B");
        Thread thread3 = new Thread(mt,"线程C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
