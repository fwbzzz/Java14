/*
这个时候我们发现，票数竟然出现负数，这种问题我们称之为不同步操作。
不同步的唯一好处是处理速度快（多个线程并发执行）
 */
public class Test1 {
    public static void main(String[] args) {
        Runnable runnable = new MyTickRunnableSyn();
        Thread threadA = new Thread(runnable,"黄牛A");
        Thread threadB = new Thread(runnable,"黄牛B");
        Thread threadC = new Thread(runnable,"黄牛C");
        threadA.start();
        threadB.start();
        threadC.start();

    }
}

class MyTickRunnableSyn implements Runnable{
    private int tick = 30;
    @Override
    public void run() {
        while(this.tick>0){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "买票  剩余" + (--this.tick));
        }
        System.out.println("票卖光了");
    }
}