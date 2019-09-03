package fwb.inAndOut;

/**
 * @program: Io
 * @description: 自动调用close方法
 * @author: fwb
 * @create: 2019-07-31 16:32
 **/
class Myclass implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("自动");
    }
    public void print(){
        System.out.println("显示调用");
    }
}

public class AutoCloseableTest {
    public static void main(String[] args) {
        Myclass myclass = new Myclass();
        //并不会自动
        myclass.print();
        System.out.println("---------------------");
        //在try代码块中
        try( Myclass myclass1 = new Myclass();) {
            myclass1.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
