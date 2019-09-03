/*
通过构造方法设置名称
 */
class MyThread1 extends Thread{
    private int ticket = 10;
    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println(Thread.currentThread().getName() + "还剩下" + ticket-- + "票");
        }
    }
}

public class Test2 {
    //主方法即主线程
    public static void main(String[] args) {
       //证明主方法是一个线程：
//       Thread thread4 = new MyThread1();
//       thread4.run();
        //看进程在哪：
        // 可以执行一个死循环，之后在任务管理器中找到编译器进程点开后可看到
        //Java Platform SE binary
        //while(true){}
        //如果没有起名字则默认为：Thread—数字（由零开始）
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}
