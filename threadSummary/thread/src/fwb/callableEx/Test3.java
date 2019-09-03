package fwb.callableEx;

/*
使用Runnable更好实现资源共享
 */
class MyThread2 implements Runnable {
    private int ticket = 10;//区分线程名字

    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println("还剩下" + ticket-- + "票");
        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        Thread thread4 = new Thread(mt);
        Thread thread5 = new Thread(mt);
        Thread thread6 = new Thread(mt);
        thread6.start();
        thread4.start();
        thread5.start();
    }
}