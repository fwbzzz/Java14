package fwb.inAndOut;

import java.io.*;

/**
 * @program: Io
 * @description: 字节输入流
 * @author: fwb
 * @create: 2019-07-31 17:03
 **/
public class OutputStreanTest2 {
    public static void main(String[] args){
    //1. 取得终端对象
    File file = new File(File.separator + "F" + File.separator + "Users" + File.separator
            + "冯炜博" + File.separator + "Desktop" + File.separator + "OutputStreamTest2.txt");
    //2. 取得输出流
    OutputStream out = null;
        try {
            out = new FileOutputStream(file);
            //3. 数据输出
            out.write("hello world".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //虽然上面2已经try/catch过了IO异常，但是由于不在同一个代码块中，所以需要再重新try/catch一下
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
