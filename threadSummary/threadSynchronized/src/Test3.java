/*
同步方法：在方法上添加synchronized关键字，一般可以锁当前对象this，僧戳奶死的也就是对象锁
 */
public class Test3 {
    public static void main(String[] args) {
        Runnable runnable3 = new MyTickRunnableSyn3();
        Thread threadA = new Thread(runnable3,"黄牛A");
        Thread threadB = new Thread(runnable3,"黄牛B");
        Thread threadC = new Thread(runnable3,"黄牛C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}

class MyTickRunnableSyn3 implements Runnable{
    private int ticket = 1000;
    @Override
    public void run() {
        for(int i = 0;i < 1000;i++){
            sale();
        }
    }
    //表示此处只有一个线程能够进入此方法
    //隐式的锁 锁的对象就是this，当前对象
    public synchronized void sale(){
        if(ticket > 0){
            synchronized (this){
                if (this.ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(Thread.currentThread().getName() +
                "买票  剩余" + (--this.ticket));
    }
}