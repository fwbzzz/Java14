package fwb.daYinLiu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @program: Io
 * @description: 系统打印流
 * @author: fwb
 * @create: 2019-08-02 13:39
 **/
public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(File.separator + "F" + File.separator + "Users" + File.separator
                + "冯炜博" + File.separator + "Desktop" + File.separator + "PringtStreamTest.txt");
        PrintStream printStream = new PrintStream(new FileOutputStream(file));
        printStream.print("哈哈");
        printStream.println(08.02);
    }
}
