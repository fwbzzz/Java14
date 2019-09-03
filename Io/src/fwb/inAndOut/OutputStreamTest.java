package fwb.inAndOut;

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

public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        //1. 取得终端对象
        File file = new File(File.separator + "F" + File.separator + "Users" + File.separator
                + "冯炜博" + File.separator + "Desktop" + File.separator + "OutputStreamTest.txt");
//        file.getParentFile().mkdirs();
//        file.createNewFile();
        //有输出流以后不需要手动创建，只要路径正确会自动创建
        //2. 取得相应终端的输出流
        OutputStream out = new FileOutputStream(file);
        //3. 将数据通过输出流输出
        out.write("hello world".getBytes());
        //4. 关闭流
        out.close();

    }
}
