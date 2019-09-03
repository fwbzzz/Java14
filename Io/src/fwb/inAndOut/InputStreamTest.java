package fwb.inAndOut;

import java.io.*;

/**
 * @program: Io
 * @description: 输入流
 * @author: fwb
 * @create: 2019-07-31 18:59
 **/
public class InputStreamTest {
    public static void main(String[] args) {
        //1. 取得终端对象
        File file = new File(File.separator + "F" + File.separator + "Users" + File.separator
                + "冯炜博" + File.separator + "Desktop" + File.separator + "OutputStreamTest.txt");
        //2. 取得输入流
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            // 3.读取数据
            int len = 0;
            byte[] data = new byte[1024];//缓冲区
            try {
                len = in.read(data);//将读入的数据存放在data中
                //public String(byte bytes[], int offset, int length)将字符数组转换为字符串
                System.out.println("文件内容为：" + new String(data,0,len));//从0到有长度的地方即可
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
