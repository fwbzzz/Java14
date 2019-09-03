package fwb.callableEx;

/*
Thread无法资源共享
 */
class MyThread1 extends Thread {
    private String title;//区分线程名字
    private int ticket = 10;
    public MyThread1(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println(this.title + "还剩下" + ticket-- + "票");
        }
    }
}

public class Test2 {
    public static void main(String[] args) {

        Thread thread1 = new MyThread1("黄牛A");
        Thread thread2 = new MyThread1("黄牛B");
        Thread thread3 = new MyThread1("黄牛C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}