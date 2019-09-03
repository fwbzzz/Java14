package fwb.luanMaTest;

import java.io.File;
import java.io.IOException;


/**
 * @program: Io
 * @description: 字符乱码：编解码不一致
 * @author: fwb
 * @create: 2019-08-01 17:13
 **/
public class Ex {
    public static void main(String[] args) throws Exception {
        //输出当前系统信息
        //System.getProperties().list(System.out);
        //将当前输出格式设置为GBK（但是系统和IDEA是UTF- 8），会出现乱码
        String fileName = new String("测试".getBytes(),"GBK");
        File file = new File(File.separator + "F" + File.separator + "Users" + File.separator
                + "fwb" + File.separator + "Desktop" + File.separator + fileName);
            file.createNewFile();
    }
}
