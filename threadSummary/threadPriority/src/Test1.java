/*
设置线程优先级，但是并不一定有用
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i <5;i++){
            System.out.println(Thread.currentThread().getName() + "、" +i);
        }
    }
}



public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        Thread thread = new Thread(mt,"线程A");
        Thread thread2 = new Thread(mt,"线程B");
        Thread thread3 = new Thread(mt,"线程C");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        thread2.start();
        thread3.start();
    }
}
