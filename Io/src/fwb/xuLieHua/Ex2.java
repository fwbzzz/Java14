package fwb.xuLieHua;

import java.io.*;
import java.util.function.ObjIntConsumer;

/**
 * @program: Io
 * @description: 反序列化
 * @author: fwb
 * @create: 2019-08-02 15:36
 **/
public class Ex2 {
    public static void main(String[] args) throws Exception {
        File file = new File(File.separator + "F" + File.separator + "Users" + File.separator
                + "冯炜博" + File.separator + "Desktop" + File.separator + "序列化测试.txt");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Object per = in.readObject();
        System.out.println(per);//Person类已经覆写了toString方法，所以直接输出
    }
}
