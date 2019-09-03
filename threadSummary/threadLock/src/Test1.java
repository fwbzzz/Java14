/*
从运行结果可以看出，对于 ThreadLocal 类型的变量，在一个线程中设置值，不影响其在其它线程中的值。也就是
说 ThreadLocal 类型的变量的值在每个线程中是独立的
 */

public class Test1 {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    private static String commonString;
    public static void main(String[] args) {
        //主线程
        commonString = "thread-main";
        threadLocal.set("thread-main-ThreadLoacl");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                commonString = "threadA";
                threadLocal.set("threadA-ThreadLocal");
            }
        },"ThreadA");
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //main
        System.out.println(threadLocal.get());
        System.out.println(commonString);
    }
}
