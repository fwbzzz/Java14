/*
java.util 包提供了 Date 类来封装当前的日期和时间。 Date 类提供两个构造函数来实例化 Date 对象。
Date()使用当前日期和时间来初始化对象。
使用 SimpleDateFormat 格式化日期
SimpleDateFormat 是一个以语言环境敏感的方式来格式化和分析日期的类。
SimpleDateFormat 允许你选择任何用户自定义日期时间格式来运行。
 yyyy 是完整的公元年，MM 是月份，dd 是日期，HH:mm:ss 是时、分、秒。
注意:有的格式大写，有的格式小写，例如 MM 是月份，mm 是分；HH 是 24 小时制，而 hh 是 12 小时制。
 */
import com.sun.xml.internal.ws.assembler.jaxws.TerminalTubeFactory;
import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
线程休眠方法，交出CPU但是不交出锁
 */
class MyThread extends Thread{
    private int ticket = 10;
    @Override
    public void run() {
        System.out.println("子线程开始执行");
        Test1.printTime();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Test1.printTime();
        System.out.println("子线程run方法结束");
    }
}



public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("主方法开始");
        MyThread mt = new MyThread();
        Thread thread = new Thread(mt);
        thread.start();
        thread.join();
        System.out.println("主方法结束");
    }

    public static void printTime(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = dateFormat.format(date);
        System.out.println(str);

    }
}
