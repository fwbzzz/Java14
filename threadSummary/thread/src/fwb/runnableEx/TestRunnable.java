package fwb.runnableEx;

/*
继承Thread类的局限是单继承，继承了Thread类之后无法继承其他类
 */
class MyThread implements Runnable{
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

public class TestRunnable {
    public static void main(String[] args) {
        //这是3个Runnable对象
        MyThread thread1 = new MyThread("A");
        MyThread thread2 = new MyThread("B");
        MyThread thread3 = new MyThread("C");
        //需要将接口对象传进去
        Thread threadA = new Thread(thread1);
        Thread threadB = new Thread(thread2);
        threadA.start();
        threadB.start();

        //用lamda表达式实现
        //（）即run()的括号，->表示实现
        new Thread(() -> System.out.println("Lamda实现")).start();
        //可这样理解：
        Runnable runnable = () -> System.out.println("Lamda实现");
        new Thread(runnable).start();

        //匿名内部类(了解)
        new Thread(new Runnable() {
            @Override
                public void run() {
                    System.out.println("匿名内部类实现");
                }
        }).start();
    }
}