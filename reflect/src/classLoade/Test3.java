/*
自定义一个类加载器，可以防止反编译看到源码（动态加载文件）
*/
/*
1.
replace() 方法通过用 newChar 字符替换字符串中出现的所有 oldChar 字符，并返回替换后的新字符串。
public String replace(char oldChar,char newChar)
oldChar -- 原字符。
newChar -- 新字符。
返回值
替换后生成的新字符串。
2.
public int read()
从此输入流中读取下一个数据字节
3.
public void write(int w)
 将指定的字节写入此字节数组输出流。
 */
package classLoade;

import java.io.*;

public class Test3 {
    public static void main(String[] args){
        String className = "classLoade.Member3";
        Class classz = new MyClassLoader().loadData(className);
        try {
            Class classz2 = Class.forName(className);
            //同一个类，由不同的类加载器所加载
            //所以Class对象就不相等了
            System.out.println(classz.getClassLoader());
            System.out.println(classz2.getClassLoader());
            System.out.println(classz == classz2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

class Member3{
    public String toString(){
        return "Member3";
    }

}

//通过一个class类名，去找class文件，然后变成一个byte数组，通过父类里面的defineClass 返回一个class对象
class MyClassLoader extends ClassLoader{
    public Class loadData(String className){
        byte[] data = classBytes(className);
        return super.defineClass(className,data,0,data.length);
    }


    //文件路径在out目录里 File path
    private byte[] classBytes(String className){
        String classPath = "F:\\Java14\\reflect\\out\\production\\reflect";
        String classFile = classPath + "\\" + className.replace(".","\\") + ".class";//其中一个\为转义符
        //File I/O，将文件内容转化为byte[]
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (FileInputStream in = new FileInputStream(classFile)){
            byte[] buff = new byte[1024];//长度为1024的一个缓冲区
            int len = -1;
            //一次读一批
            while((len = in.read(buff)) != -1){
                out.write(buff,0,len);
            }
        }catch (IOException e){
        };
        return out.toByteArray();
    }

}