/*
线程休眠方法，交出CPU但是不交出锁
 */
class MyThread extends Thread{
    private int ticket = 10;
    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println(Thread.currentThread().getName() + "还剩下" + ticket-- + "票");
        }
    }
}

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        //不要被结果蒙蔽了双眼，运行结果都是随机的
        System.out.println("main方法开始");
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        System.out.println("main方法结束");

    }
}
