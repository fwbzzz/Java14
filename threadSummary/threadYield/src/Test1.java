/*
线程休眠方法，交出CPU但是不交出锁
 */
class MyThread extends Thread{
    private int ticket = 10;
    @Override
    public void run() {
        for (int i = 0;i < 100;i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + "还剩下" + i);
        }
    }
}

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        Thread thread1 = new Thread(mt,"A线程");
        Thread thread2 = new Thread(mt,"B线程");
        Thread thread3 = new Thread(mt,"C线程");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
