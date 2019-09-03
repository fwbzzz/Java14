package fwb.shuChuLiu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @program: Io
 * @description: BufferReader
 * @author: fwb
 * @create: 2019-08-02 14:06
 **/
public class Ex {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        System.out.println("输入内容");
        String str = bufferedReader.readLine();//直接可以读取一行数据，不需要再写什么字节数组了。
        System.out.println("输出内容：" + str);
    }
}
