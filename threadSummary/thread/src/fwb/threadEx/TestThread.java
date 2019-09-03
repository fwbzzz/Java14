/*
1.继承Thread类来实现多线程
但是继承Thread类的局限是单继承，继承了Thread类之后无法继承其他类
 */

package fwb.threadEx;

class MyThread extends Thread{
   private String title;//区分线程名字

   public MyThread(String title) {
       this.title = title;
   }

    @Override
    public void run() {
        for (int i = 0;i < 3;i++){
           System.out.println(this.title + "、" + i);
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("A");
        MyThread thread2 = new MyThread("B");
        MyThread thread3 = new MyThread("C");
        //直接调用run()方法就只是调用了个普通方法而已，并不是调用多线程
//        thread1.run();
//        thread2.run();
//        thread3.run();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
