package fwb.luanMaTest;

/**
 * @program: Io
 * @description: 字符乱码：数据不完整
 * @author: fwb
 * @create: 2019-08-01 17:26
 **/
public class Ex2 {
    public static void main(String[] args) throws Exception{
        String str = "你好你好";
        System.out.println(str.getBytes().length);//此处默认UTF -8，一个中文3个字节
        System.out.println(str.getBytes("GBK").length);//GBK为2个
        //将字符串以字符数组的形式返回
        byte[] data = str.getBytes();
        System.out.println(new String(data,0,5));//将会有一个汉字不是完整的（应该是3的倍数）
    }
}
