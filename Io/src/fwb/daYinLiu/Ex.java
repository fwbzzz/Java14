package fwb.daYinLiu;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: Io
 * @description: 系统输入
 * @author: fwb
 * @create: 2019-08-01 20:24
 **/
public class Ex {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入聊天内容：");
        byte[] data = new byte[1024];
        /*
        第一种写法：
        InputStream in = System.in;
        int len = in.read(data);
        */
        //第二种写法
        int len = System.in.read(data); //将数据读到字节数组中
        System.out.println("输出数据为：" + new String(data,0,len));
    }
}
