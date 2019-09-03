package fwb.inAndOut;

import java.io.*;

/**
 * @program: Io
 * @description: 使用字节输入输出流进行文件拷贝
 * @author: fwb
 * @create: 2019-07-31 19:27
 **/
public class copyTest {
    public static void main(String[] args) throws IOException {
        //传进来的的文件必须是2个，一个输入一个输出
        if (args.length != 2){
            System.out.println("参数非法");
        }
        //源文件
        File sourceFile  = new File(args[0]);
        //目标文件
        File destFile = new File(args[1]);
        InputStream in = new FileInputStream(sourceFile);
        OutputStream out = new FileOutputStream(destFile);
        //文件拷贝
        copyFile(in,out);
    }

    //在这里接受最顶底层的抽象类，而不是具体的文件输入输出流这个类的原因是
    //如果以后有从网络、内存而来的都可以使用
    private static void copyFile(InputStream in,OutputStream out) throws IOException {
        System.out.println("文件拷贝开始");
        long start = System.currentTimeMillis();
        int len = 0;
//      这种方法默认一次一个字节的文件，会非常慢
//        while((len = in.read() )!= -1){
//            out.write(len);
//        }
        //边读边写,当被读取的文件长度不等于 -1 就代表还有数据读
        //开一个缓冲区可以快一点，但是并不是说缓冲区越大越快
        byte[] data = new byte[1024];
        while((len = in.read(data))!= -1){
            out.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件拷贝结束，共耗时" + (end - start) + "ms");
    }
}
