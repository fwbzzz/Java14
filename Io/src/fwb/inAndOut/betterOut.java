package fwb.inAndOut;

/**
 * @program: Io
 * @description: 包装一下OutputStream
 * @author: fwb
 * @create: 2019-08-01 19:32
 **/


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @program: Io
 * @description: 输出流
 * @author: fwb
 * @create: 2019-07-31 15:55
 **/
class MyPrint{
    private OutputStream out;

    public MyPrint(OutputStream out){
        this.out = out;
    }

    public void print(String str) throws IOException {
        this.out.write(str.getBytes());
    }

    public void println(String str) throws IOException {
        this.print(str + "\n");
    }
    public void print(double data) throws IOException {
        this.print(String.valueOf(data));
    }

    public void println(double data) throws IOException {
        this.print(data + "\n");
    }

    public void close() throws IOException {
        this.out.close();
    }

}
public class betterOut {
    public static void main(String[] args) throws IOException {
        //1. 取得终端对象
        File file = new File(File.separator + "F" + File.separator + "Users" + File.separator
                + "冯炜博" + File.separator + "Desktop" + File.separator + "betterOut.txt");
        MyPrint myPrint = new MyPrint(new FileOutputStream(file));
        myPrint.print("哈哈哈");
        myPrint.print(10.2322);
        myPrint.close();
    }
}