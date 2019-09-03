/*
线程分类：

用户线程：
main线程，用户自己创建的线程（Daemon 返回false）
守护线程 ：
他是一个陪伴线程，当我们的JVM最后一个用户线程退出，守护线程会自动退出
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("main执行");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " running " + (i++));
                }
            }
        },"Thread-A");
        //设置线程为守护线程的方法必须在start之前调用
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(3000);
        System.out.println("main执行");
        System.out.println("main执行");
        System.out.println("main执行完了。。");
    }

}
