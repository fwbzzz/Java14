///*
//通过构造方法设置名称
// */
//class MyThread implements Runnable{
//    private int ticket = 10;
//    @Override
//    public void run() {
//        for (int i = 0;i < 10;i++){
//            System.out.println(Thread.currentThread().getName() + "还剩下" + ticket-- + "票");
//        }
//    }
//}
//
//public class Test1 {
//    //主方法即主线程
//    public static void main(String[] args) {
//        //这是3个Runnable对象
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"黄牛A");
//        Thread thread2 = new Thread(mt,"黄牛B");
//        Thread thread3 = new Thread(mt,"黄牛C");
//        thread1.setName("冯博博");//修改名字
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//
//
//    }
//}