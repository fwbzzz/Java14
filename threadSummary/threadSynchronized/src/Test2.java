/*
使用同步代码块。来为程序上锁
 */
public class Test2 {
    public static void main(String[] args) {
        Runnable runnable2 = new MyTickRunnableSyn2();
        Thread threadA = new Thread(runnable2,"黄牛A");
        Thread threadB = new Thread(runnable2,"黄牛B");
        Thread threadC = new Thread(runnable2,"黄牛C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}

class MyTickRunnableSyn2 implements Runnable{
    private int tick = 1000;
    @Override
    public void run() {
        for(int i = 0;i < 10;i++){
            //为程序上锁
            synchronized (this){
                if (this.tick > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() +
                            "买票  剩余" + (--this.tick));
                }
            }
        }
    }
}