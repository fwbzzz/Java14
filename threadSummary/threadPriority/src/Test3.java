/*
查看main方法优先级
 */
class MyThread3 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "、" +
                Thread.currentThread().getPriority());
        MyThread myThread = new MyThread();
        new Thread(new B(),"孙子线程B").start();
    }
}

class B implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName() + "、" +
                Thread.currentThread().getPriority());
    }
}

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "、" +
                Thread.currentThread().getPriority());
        MyThread3 myThread3 = new MyThread3();
        Thread thread = new Thread(myThread3,"子线程A");
        thread.setPriority(10);
        thread.start();

    }
}
