package fwb.writeAndRead;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @program: Io
 * @description: 字符流输出练习
 * @author: fwb
 * @create: 2019-08-01 16:07
 **/
public class WriteTest {
    public static void main(String[] args) throws IOException {
        File file = new File(File.separator + "F" + File.separator + "Users" + File.separator
                + "冯炜博" + File.separator + "Desktop" + File.separator + "WriterTest.txt");
        Writer writer = new FileWriter(file,true);//不写true的话默认为覆盖模式
        writer.write("哈哈");
        writer.write("呵呵");
        writer.close();
        //writer.flush();//在不关闭流的情况下，清空缓存强制输出
    }
}
