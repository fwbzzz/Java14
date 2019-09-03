package fwb.zhuanHuanLiu;

import java.io.*;

/**
 * @program: Io
 * @description:
 * @author: fwb
 * @create: 2019-08-01 18:06
 **/
public class Ex {
    public static void main(String[] args) throws Exception{
        File file = new File(File.separator + "F" + File.separator + "Users" + File.separator
                + "fwb" + File.separator + "Desktop" + File.separator + "转换流.txt");
        OutputStream  outputStream = new FileOutputStream(file);//字节输出流
        Writer writer = new OutputStreamWriter(outputStream);//字节输出流转换为字符输出流
        writer.write("你好乔碧罗");
        writer.close();

    }
}
