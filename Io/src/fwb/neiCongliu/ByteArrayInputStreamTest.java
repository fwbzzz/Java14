package fwb.neiCongliu;

import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @program: Io
 * @description: 字节内存流
 * @author: fwb
 * @create: 2019-08-01 18:18
 **/
public class ByteArrayInputStreamTest {
    public static void main(String[] args) throws IOException {
        String str = "hello world";//将其在内存中变成大写输入到程序中
        // 实例化InputStream类对象，实例化的时候需要将你操作的数据保存到内存之中
        // 最终读取的就是你设置的内容。
        // 此时的终端是内存，将字符串变为字符数组写入内存中
        InputStream in = new ByteArrayInputStream(str.getBytes());
        //
        OutputStream out = new ByteArrayOutputStreamEx();
        int len = 0;
        while((len =  in.read())!= -1){
            out.write(Character.toUpperCase(len));//将每个字符变大写
        }
        System.out.println(out);
        in.close();
        out.close();
    }
}
