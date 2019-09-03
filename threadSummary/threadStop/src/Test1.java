/*
设置标记使线程退出
通过一个变量来标识一下，当这个变量值发生变化的时候就停下来
写一个死循环，让他一直去执行，当flag变成一个false的时候，while就不成立了，就会停下来
 */

public class Test1 {
    public static void main(String[] args) {
        MythreadStop2 threadStop2 = new MythreadStop2();
        threadStop2.setName("thread-stop");
        threadStop2.start();
        try {
            Thread.sleep(5000);
            threadStop2.setFlag(false);
            System.out.println("main方法执行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class MythreadStop2 extends Thread{
    private boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while(flag){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " 执行 " + (i++));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
