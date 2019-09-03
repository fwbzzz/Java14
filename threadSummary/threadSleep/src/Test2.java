/*
线程休眠方法，交出CPU但是不交出锁
 */
class MyThread2 extends Thread{
    private int ticket = 10;
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0;i < 10;i++){
            System.out.println(Thread.currentThread().getName() + "结果为：" + i);
    }
    }
}

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 mt = new MyThread2();
        Thread thread1 = new Thread(mt,"A线程");
        Thread thread2 = new Thread(mt,"B线程");
        Thread thread3 = new Thread(mt,"C线程");
        thread1.start();
        //看似ABC一起睡一起恢复，实际并不是
        //先启动1，暂缓一秒再启动2,3
        //一秒内A要比B C多很多倍，肉眼根本无法看出来
        //Thread.sleep(1000);
        thread2.start();
        thread3.start();
    }
}
